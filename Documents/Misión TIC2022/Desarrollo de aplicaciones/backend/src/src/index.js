//Importar dependencias
const express = require('express');
const morgan = require('morgan');
//Importar módulos/clases
const IndexRouter = require('./routers/indexRouter');
const ConnDb = require('./database/connDb');
const UserRouter = require('./routers/userRouter');

class Server{

    constructor(){
        this.objConn = new ConnDb();
        //Crear aplicación express
        this.app = express();
        //Configurar servidor
        this.#config();
    }

    #config(){
        //indicar al servidor que se procesará datos de las peticiones en formato json
        this.app.use(express.json());
        //Añadir morgan a express para el monitoreo de las peticiones http
        this.app.use(morgan());
        //Almacenar el puerto por el que correrá el servidor
        this.app.set('PORT', process.env.PORT || 3000);
        //--------CREAR RUTAS-------
        const indexR = new IndexRouter();
        const userR = new UserRouter();

        //------AÑADIR RUTAS A EXPRES--------
        this.app.use(indexR.router);
        this.app.use(userR.router);

        //Poner el servidor a la escucha
        this.app.listen(this.app.get('PORT'), ()=>{
            console.log("Servidor corriendo por el puerto ==>> ", this.app.get('PORT'))
        });

    }
}

new Server();
