//Importar dependencias
const jwt = require('jsonwebtoken');
//Importar módulos
const User = require("../models/user");
const { PRIVATE_KEY } = require('./tokenController');


class UserController{

    register(req, res){
        let objUser = req.body;
        if(objUser.name && objUser.lastname && objUser.email && objUser.password){
            User.create(objUser, (error, data)=>{
                if(error){
                    console.log(error);
                    res.status(500).json({error});
                }else{
                    let token = jwt.sign({email: data.email}, PRIVATE_KEY);
                    res.status(201).json({token});
                }
            });
        }else{
            res.status(400).json({info: 'Datos incompletos'});
        }
    }

    login(req, res){
        //Capturar datos del cuerpo de la petición
        let {email, password} = req.body;
        //Validar la existencia de los datos en la BD
        User.findOne({email, password}, (error, data)=>{
            if(error){
                res.status(500).json({info: error});
            }else{
                console.log(data);
                if(data != null && data != undefined){
                    let token = jwt.sign({email: data.email}, PRIVATE_KEY);
                    res.status(200).json({token});
                }else{
                    res.status(401).json({info: 'Credenciales inválidas'})
                }                
            }
        })
    }
}

module.exports = UserController;