
let registros = [];

function agregarRegistro() {
    arreglo = registros.push({ username, contrasena });
    console.log(arreglo);
}

function ordenarArreglo(arreglo) {
    arreglo.sort(function (a, b) {
        if(a.username > b.username){
            return 1;
        }else{
            return -1;
        }
    });
    //console.log(registros);
    return arreglo;
}

/*
function obtenerUsername(arreglo) {

    for (var i = 0, len = registros[i].length, count = 0, ch; i < len; ++i) {
        ch = str.charAt(i);
        if (ch >= 'A' && ch <= 'Z') {
            return arreglo = username.registros.push(i);
        }
        console.log(arreglo);
    }
}
*/



function tiene_numeros(usuario) {
    let band = false;
    for (i = 0; i < usuario.length; i++) {
        if (!isNaN(usuario.charAt(i))) {
            band = true;
        }
    }
    return band;
}

function obtenerUsername(arreglo){
    let tempo = [];
    arreglo.forEach(element => {
        if(tiene_numeros(element.username)){
            tempo.push(element);
        }
    });
    return tempo;
}

/*    function obtenerUsername(usuario) {
        let band = false;
        for (i = 0; i < usuario.length; i++) {
            if (!isNaN(usuario.charAt(i))) {
                band = true;
            }
        }
        return band;
    }*/


function filtrarUsername(arreglo) {
    let objUsuario = arreglo.filter(m => (m.username.length > 10));
    return objUsuario;
}

module.exports.registros = registros;
module.exports.filtrarUsername = filtrarUsername;
module.exports.obtenerUsername = obtenerUsername;
module.exports.ordenarArreglo = ordenarArreglo;
module.exports.agregarRegistro = agregarRegistro;

/*
obj_1 = {
    username: "Pedro"
}

obj_2 = {
    username: "Juan"
}

obj_3 = {
    username: "Andres"
}

obj_4 = {
    username: "Lina_1"
}

let array = [obj_1, obj_2, obj_3, obj_4]

console.log(ordenarArreglo(array));
console.log(obtenerUsername(array));
*/