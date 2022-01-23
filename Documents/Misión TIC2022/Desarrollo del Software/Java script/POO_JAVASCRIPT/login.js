let registros = [];
var cont = 1;


    function agregarRegistro() {
        arreglo = registros.push({ username, contrasena });
        console.log(arreglo);
    }

    function login() {
            let band = false;
            registros.forEach(element => {
                if((element.username===username && element.contrasena===contrasena)&&(validarCAPTCHA(valor) === true)){
                    band = true;
                }
            });
            return band;
    }
    

    function validarCAPTCHA(valor) {
        let band = false;
        if (valor = 9000) {
            band = true;
        }

        return band;
    }


        module.exports.login = login;
        module.exports.registros = registros;
        module.exports.validarCAPTCHA = validarCAPTCHA;
        module.exports.agregarRegistro = agregarRegistro;

