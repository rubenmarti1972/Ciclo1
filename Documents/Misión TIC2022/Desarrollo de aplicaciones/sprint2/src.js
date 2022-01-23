import fetch from "node-fetch";


const obtenerCitasDisponibles = (especialidad, fecha_inicio, fecha_final) => {
    const API_URL = "https://misiontic2022upb.vercel.app/api/medical-appointments/appointments";
    let citasDisponibles =
        fetch(API_URL, {})
            .then((response) => response.json())
            .then((json) => {
                return json.filter(element => (
                    especialidad === element.especialidad
                    &&
                    Date.parse(element.fecha) >= Date.parse(fecha_inicio)
                    &&
                    Date.parse(element.fecha) <= Date.parse(fecha_final)
                ));

            })
            //.catch((error) => console.log(error));
    return citasDisponibles;
}


const confirmarCita = async (idCita) => {
    const API_URL = "https://misiontic2022upb.vercel.app/api/medical-appointments/confirm/";
    let cita = await fetch(
        { API_URL } + { idCita },
        {
            method: "POST"
        }
    )
        .then((response) => response.json())
        .then((resp) => String(resp))
        //.catch((error) => console.log(error));
    return cita;
}


/*let especialidad = "optometría";
let nombre = "Dr. Mario";
let fecha = "2020-01-01";
let hora = "16:00";
*/


module.exports.obtenerCitasDisponibles = obtenerCitasDisponibles;
module.exports.confirmarCita = confirmarCita;

