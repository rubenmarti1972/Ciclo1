const {Router} = require('express');
const ProductController = require('../controllers/productController');
const {TokenController} = require('../controllers/tokenController');


class ProductRouter{
    constructor(){
        this.router = Router();
        this.#config();
    }

    #config(){
        //Middleware
        this.router.use((req, res, next)=>{
            let tokenController = new TokenController();
            let token = tokenController.getToken(req);
            let decode = tokenController.verify(token);
            if(decode){
                next();
            }else{
                res.status(401).json({info: 'Requiere autenticación'});
            }          
        });
        //crear objeto
        const objProductC = new ProductController();
        //crear/configurar las rutas
        this.router.post('/product', objProductC.create);
        this.router.get('/product', objProductC.get);
        this.router.put('/product', objProductC.update);
        this.router.delete('/product', objProductC.delete);
    }
}

module.exports = ProductRouter;