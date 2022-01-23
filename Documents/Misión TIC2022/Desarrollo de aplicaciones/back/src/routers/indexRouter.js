const express = require('express');
class IndexRouter{
    constructor(){
        this.router = express.Router();    
        this.config();    
    }

    config(){
        this.router.get('/', (req, res) => {
            res.status(200).json({ mensaje: 'Conexión exitosa' });
        });
        /*
        this.router.get('/:usuario', (req, res)=>{
            let usuario = req.params.usuario;
            console.log("Usuario-> ", usuario);
            res.status(200).json({message: 'Usuario recibido'});
        });
        */
    }
}

module.exports = IndexRouter;