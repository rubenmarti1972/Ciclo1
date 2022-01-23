const {Router} = require('express');
const UserController = require('../controllers/userController');

class UserRouter{
    constructor(){
        this.router = Router();
        this.#config();
    }

    #config(){
        //Crear objeto UserController
        const objUserC = new UserController();
        this.router.post('/user', objUserC.register);
        this.router.post('/user/auth', objUserC.login);
    }
}

module.exports = UserRouter;