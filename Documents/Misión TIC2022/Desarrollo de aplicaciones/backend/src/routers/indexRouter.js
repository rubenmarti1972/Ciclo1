const {Router} = require('express');

class IndexRouter{
    constructor(){
        //Crear atributo de la clase de tipo Router
        this.router = Router();
        //Llamar configuración y creación de las rutas
        this.#config();
    }

    #config(){
        this.router.get('/', (req, res)=>{
            res.status(200).json({message: 'All ok'});
        });
    }
}

module.exports = IndexRouter;