const Usuario = require('../models/usuario');


class UsuarioController{

    obtenerTodosLosUsuarios(req, res){
        Usuario.find((error, data)=>{
            if(error){
                res.status(500).send();
            }else{
                res.status(200).json(data);
            }
        });
    }
    
    //#(almohadilla)-> convierte en privado un atributo o método de una clase
    obtenerUsuario(req, res) {
        let id = req.params.id;
        Usuario.findById(id, (error, data)=>{
            if(error){
                res.status(500).send();
            }else{
                res.status(200).json(data);
            }
        });
    }

    registrarUsuario(req, res) {
        let objUsuario = req.body;
        if(objUsuario.nombre && objUsuario.apellido){
            Usuario.create(objUsuario, (error, data)=>{
                if(error){
                    res.status(500).send();                
                }else{
                    res.status(201).json(data);
                }
            });
        }else{
            res.status(400).send();
        }        
    }

    actualizarUsuario(req, res) {
        //let { id, nombre, apellido } = req.body;
        let id = req.params.id;
        let objUsuario = req.body;
        if(objUsuario.nombre && objUsuario.apellido){
            Usuario.findByIdAndUpdate(id, objUsuario, (error, data)=>{
                if(error){
                    res.status(500).send();
                }else{
                    res.status(200).json(data);
                }
            });
        }else{
            res.status(400).send();
        }
        
    }

    //Christian Machado
    eliminarUsuario(req, res) {
        let {id} = req.body;
        if(id != null && id != undefined && id != ""){
            Usuario.findByIdAndRemove(id, (error, data)=>{
                if(error){
                    res.status(500).send();
                }else{
                    res.status(200).json(data);
                }
            });
        }else{
            res.status(400).send();
        }
    }

    buscarPorApellido(req, res){
        let apellido = req.params.apellido;
        Usuario.find({apellido: apellido}, (error, data)=>{
            if(error){
                res.status(500).send();
            }else{
                res.status(200).json(data);
            }
        })
    }

}

module.exports = UsuarioController;