import logo from './logo.svg';
import './App.css';
import MiPrimerComponente from './components/MiPrimerComponente';
import ComponenteConEstado from './components/ComponenteConEstado';

function App() {

  const saludar = <h2>Hola mundo desde un objeto jsx</h2>
  const parrafo = <p>Esto es un párrafo representado como variable</p>

  return (
    <div className="App">
      <header className="App-header">
        {saludar}
        {parrafo}
        <img src={logo} className="App-logo" alt="logo" />
        <ComponenteConEstado/>
        {/*Esto es un comentario desde un objeto jsx 
        <MiPrimerComponente/>
        <MiPrimerComponente/>
        <MiPrimerComponente/>
        <MiPrimerComponente/>
        */}
      </header>
    </div>
  );
}

export default App;
