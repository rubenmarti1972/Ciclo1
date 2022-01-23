const Product = require('../models/product');
const jwt = require('jsonwebtoken');
const { PRIVATE_KEY, TokenController } = require('./tokenController');

class ProductController {

    constructor() {
        this.tokenController = new TokenController();
    }

    create = (req, res) => {
        let { name, price } = req.body;
        //Decodificar el token
        let decode = jwt.decode(this.tokenController.getToken(req), PRIVATE_KEY);
        //insertar en la BD
        Product.create({ name, price, user_email: decode.email }, (error, data) => {
            if (error) {
                res.status(500).json({ info: error });
            } else {
                res.status(201).json({ info: 'Producto creado' });
            }
        });
    }

    get = (req, res) => {
        //Decodificar el token
        let decode = jwt.decode(this.tokenController.getToken(req), PRIVATE_KEY);
        //Consultar los productos en la BD
        Product.find({ user_email: decode.email }, (error, data) => {
            if (error) {
                res.status(500).json({ info: error });
            } else {
                res.status(200).json(data);
            }
        });
    }

    /***********************************
     * 
     * Christian Machado
     * 
     ***********************************/

    update = (req, res) => {
        //decodificar token
        let decode = jwt.decode(this.tokenController.getToken(req), PRIVATE_KEY);
        let { id, name, price } = req.body;
        Product.findOneAndUpdate(
            { _id: `${id}`, userEmail: decode.email },
            { name: name, price: price },
            (err, doc) => {
                if (err) {
                    res.status(500).json({ info: err });
                } else {
                    res.status(200).json({ info: "Producto Actualizado" });
                }
            }
        );
    }

    delete = (req, res) => {
        //decodificar token
        let decode = jwt.decode(this.tokenController.getToken(req), PRIVATE_KEY);
        let { id } = req.body;
        Product.findOneAndRemove(
            { _id: id, userEmail: decode.email },
            (err, doc) => {
                if (err) {
                    res.status(500).json({ info: err });
                } else {
                    res.status(200).json({ info: "Producto eliminado" });
                }
            }
        );
    };

}

module.exports = ProductController;