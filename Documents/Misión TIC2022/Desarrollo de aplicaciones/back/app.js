const express = require('express');
const mongoose = require('mongoose');
//Importar morgan
const morgan = require('morgan');
const {db} = require('./database/db');
const IndexRouter = require('./routers/indexRouter');
const UsuarioRouter = require('./routers/usuarioRouter');

//Clase que representa la configuracion del servidor

class Server {

    constructor() {
        this.connDb();
        //Crear aplicación express
        this.app = express();
        this.#config();
    }

    #config() {
        //Configurar/almacenar puerto por el que se ejecutará el servidor
        this.app.set('PORT', process.env.PORT || 3000);
        //Procesar los datos de las peticiones en formato json
        this.app.use(express.json());
        //Utilizar morgan
        this.app.use(morgan());
        //--------------Crear rutas-----------
        let indexR = new IndexRouter();
        let usuarioR = new UsuarioRouter();
        //----------Añadir ruta a express--------
        this.app.use(indexR.router);
        this.app.use(usuarioR.router);

        //Poner a la escucha el servidor
        this.app.listen(this.app.get('PORT'), () => {
            console.log("Servidor corriendo por el puerto => ", this.app.get('PORT'));
        });
    }

    connDb(){
        mongoose.connect(db).then(()=>{
            console.log("Conexión exitosa a la BD");
        }).catch(error=>{
            console.log("Error de conexión a la BD");
            console.log(error);
        });
    }

}

new Server();