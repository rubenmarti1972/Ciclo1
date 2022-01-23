const express = require("express");
const app = express();
//const appointments = require('./appointments.json');
app.use(express.urlencoded({extended:false}));
app.use(express.json());


app.get('/api/medical-appointments/appointments',(req, res)=>{
    res.status(200).json(appointments);
});


app.post('/api/medical-appointments/confirm/:appointment_id',(req, res)=>{
    let {appointment_id} = req.params;
    appointments=appointments.map(appointment=>{
        if(appointment.id === parseInt(appointment_id)){
            appointment.status = "confirmed";
            res.status(200).json(appointments);
        }
    });

    
});


module.exports=app;
