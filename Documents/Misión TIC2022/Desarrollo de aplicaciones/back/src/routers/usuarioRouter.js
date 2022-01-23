const { Router } = require('express');
const UsuarioController = require('../controllers/usuarioController');

class UsuarioRouter {
    constructor() {
        this.router = Router();
        this.#config();
    }

    #config() {
        //crear objeto de tipo UsuarioController
        const objUsuarioC = new UsuarioController();
        //-------CREACIÓN DE RUTAS--------
        this.router.get('/usuarios', objUsuarioC.obtenerTodosLosUsuarios);
        this.router.get('/usuarios/apellido/:apellido', objUsuarioC.buscarPorApellido);
        this.router.get('/usuarios/:id', objUsuarioC.obtenerUsuario);
        this.router.post('/usuarios', objUsuarioC.registrarUsuario);
        this.router.put("/usuarios/:id", objUsuarioC.actualizarUsuario);
        this.router.delete("/usuarios", objUsuarioC.eliminarUsuario);
    }
}

module.exports = UsuarioRouter;