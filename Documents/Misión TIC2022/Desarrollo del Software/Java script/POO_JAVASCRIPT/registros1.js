let registros = [];


function agregarRegistro(arreglo) {
    arreglo = registros.push({username, password });
    console.log(arreglo);
}

//REQUERIMIENTO 1
function ordenarArreglo(arreglo) {
    arreglo.sort(function (a, b) {
        return (a.username - b.username)
    });
    //console.log(registros);
    return arreglo;

}

//REQUERIMIENTO 2
function obtenerUsername(registros) {
    
    function tiene_numeros(usuario) {
        let band = false;
        for (i = 0; i < usuario.length; i++) {
            if (!isNaN(usuario.charAt(i))) {
                band = true;
            }
        }
        return band;
    }
    
    
    if (tiene_numeros(arreglo)) {
        arreglo =registros.push({ usuario: usuario, contrasena: contrasena });
        console.log("cumple")
    } else {
        console.log("No cumple");
    }

    return ordenarArreglo(arreglo);
}


//REQUERIMIENTO 3   
function filtrarUsername(registros) {
    let objUsuario = registros.filter(m => (m.usuario.length > 10));
    return objUsuario;
}

module.exports = {
    filtrarUsername,
    obtenerUsername,
    ordenarArreglo,
    agregarRegistro,
    registros
}