//Importar dependencias
const jwt = require('jsonwebtoken');
//Importar módulos
const User = require("../models/user");


class UserController{

    register(req, res){
        let objUser = req.body;
        if(objUser.name && objUser.lastname && objUser.email && objUser.password){
            User.create(objUser, (error, data)=>{
                if(error){
                    console.log(error);
                    res.status(500).json({error});
                }else{
                    let token = jwt.sign({name: objUser.name}, 'misiontic2022UPB123456');
                    res.status(201).json({token});
                }
            });
        }else{
            res.status(400).json({info: 'Datos incompletos'});
        }
    }
}

module.exports = UserController;
