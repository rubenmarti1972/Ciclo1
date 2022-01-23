import './MiPrimerComponente.css'

const MiPrimerComponente = ()=>{

    return (
        <>{/*Esto es un fragment (etiqueta vacia) */}
            <h2>Mi Primer Componente</h2>
            <h3>Subtitulo desde mi primer componente</h3>
            <p>Esto es un pàrrado desde mi primer componente</p>
            <a href="http://google.com">Google</a>
            <h4>Formulario de registro</h4>
            {/*Formulario*/}
            <form>
                <label htmlFor="nombre">Nombre: </label>
                <input type="text" placeholder="Nombre" name="nombre" id="nombre"/>
                <br/>
                <label htmlFor="apellido">Apellido</label>
                <input type="text" placeholder="Apellido" name="apellido" id="apellido"/>
                <br/>
                <label htmlFor="email">Email</label>
                <input type="email" placeholder="Email" name="email" id="email"/>
                <br/>
                <label htmlFor="telefono">Teléfono</label>
                <input type="tel" placeholder="Teléfono" name="telefono" id="telefono"/>
                <br/>
                <button type="submit">Registrar</button>
            </form>
        </>        
    );

}

export default MiPrimerComponente;