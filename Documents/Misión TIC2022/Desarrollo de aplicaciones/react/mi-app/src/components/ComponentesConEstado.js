import React, { useState } from 'react'

const ComponenteConEstado = () => {
    const objForm = {
        name: "",
        lastname: "",
        email: "",
        phone: ""
    }
    const [form, setForm] = useState(objForm);
    const [users, setUsers]= useState([]);

   const handleForm = (e)=>{
       let tempoForm = {...form, [e.target.name]: e.target.value};
       setForm(tempoForm);
   }

   const handleSubmit = (e)=>{
       e.preventDefault();
       let array =[...users, form];
       setUsers(array);
       console.log(users);
    /*let msg = `
        Name: ${form.name}
        Lastname: ${form.lastname}
        Email: ${form.email}
        Phone: ${form.phone}
    `;
    alert(msg);
    */
   }

    return (
        <>
            <h2>Formulario de registro</h2>
            <form onSubmit={handleSubmit}>
                <input value={form.name} onChange={handleForm} name="name" id="name" type="text" placeholder="Nombre"/>
                <br/>
                <input value={form.lastname} onChange={handleForm} name="lastname" id="lastname" type="text" placeholder="Apellido"/>
                <br/>
                <input value={form.email} onChange={handleForm} name="email" id="email" type="email" placeholder="Email"/>
                <br/>
                <input value={form.phone} onChange={handleForm} name="phone" id="phone" type="phone" placeholder="Teléfono"/>
                <br/>
                <button type="submit">Registrar</button>
            </form> 
            {/**LLamara a componente con hijo y enviarle props */}           
            <ComponenteConProps users="users"/>
        </>
    )
}

export default ComponenteConEstado
