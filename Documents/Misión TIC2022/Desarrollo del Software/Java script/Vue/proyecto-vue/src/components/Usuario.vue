<template>
  <div>
    <div>
    <h1>Productos</h1>

    <!---Formulario para crear un producto---->
    <div>
      <!-----Nombre y precio---->
      <div class="row">
        <!---nombre-->
        <div class="col-6 mb-3">
          <input
            type="text"
            class="form-control"
            id="nombreProducto"
            placeholder="nombre producto"
            v-model="nombre"
          />
        </div>
        <!---precio-->
        <div class="col-6 mb-3">
          <input
            type="number"
            class="form-control"
            id="precioProducto"
            placeholder="precio producto"
            v-model="precio"
          />
        </div>
      </div>
      <!-----Categoría y descripción--->
      <div class="row">
        <!---Categoría--->
        <div class="col-6">
          <select
            v-model="categoria"
            class="form-select"
            aria-label="Default select example"
          >
            <option selected value="null">Categoría</option>
            <option value="Bebidas">Bebidas</option>
            <option value="Licores">Licores</option>
            <option value="Frutas">Frutas</option>
          </select>
        </div>
        <!------Descripción----->
        <div class="col-6 mb-3">
          <input
            type="text"
            class="form-control"
            id="nombreProducto"
            placeholder="descripción producto"
            v-model="descripcion"
          />
        </div>
      </div>
      <!----Botón de guardado--->
      <button type="button" class="btn btn-success" @click="btnCrearProducto">
        Guardar
      </button>
    </div>

    <!-----TABLA DE PRODUCTOS------->
    <table class="table table-striped table-hover">
      <!---Cabecera de la tabla--->
      <thead>
        <tr>
          <th scope="col">Nombre</th>
          <th scope="col">Precio</th>
          <th scope="col">Categoria</th>
          <th scope="col">Descripción</th>
          <th scope="col">Acciones</th>
        </tr>
      </thead>
      <!---Cuerpo de la tabla--->
      <tbody>
        <!---Iterar la propiedad computada que contiene los productos--->
        <tr v-for="objProducto in productos" :key="objProducto._id">
          <td>{{ objProducto.nombre }}</td>
          <td>{{ objProducto.precio }}</td>
          <td>{{ objProducto.categoria }}</td>
          <td>{{ objProducto.descripcion }}</td>
          <td>
            <!---Botón de editar--->
            <button type="button" class="btn btn-primary">Editar</button>
            &nbsp;
            <!----Botón de eliminar--->
            <button type="button" class="btn btn-danger" @click="btnEliminar(objProducto._id)">Eliminar</button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
    <h1>Usuarios</h1>
    <!-----Formulario:
      *Nombre
      *Apellido
      *Nickname
      *email
      *telefono
      --->
    <input type="text" v-model="nombre" placeholder="Nombre" />
    <br />
    <input type="text" v-model="apellido" placeholder="Apellido" />
    <br />
    <input type="text" v-model="nickname" placeholder="Nickname" />
    <br />
    <input type="text" v-model="email" placeholder="Email" />
    <br />
    <input type="text" v-model="telefono" placeholder="Teléfono" />
    <br />
    <!----Desarrollar el botón 'crear usuario' y añadirlo a un arreglo de objetos----->
    <button v-on:click="crearUsuario">Crea usuario</button>
    <br />
    <table>
      <!------Cabecera de la tabla----->
      <thead>
        <tr>
          <th>Nombre</th>
          <th>Apellido</th>
          <th>Nickname</th>
          <th>Email</th>
          <th>Teléfono</th>
          <th>Acciones</th>
        </tr>
      </thead>
      <!-----Cuerpo de la tabla---->
      <tbody>
        <tr v-for="objUsuario in usuarios" :key="objUsuario.nickname">
          <td>{{ objUsuario.nombre }}</td>
          <td>{{ objUsuario.apellido }}</td>
          <td>{{ objUsuario.nickname }}</td>
          <td>{{ objUsuario.email }}</td>
          <td>{{ objUsuario.telefono }}</td>
          <td>
            <button v-on:click="btnActualizar(objUsuario.nombre, objUsuario.apellido, objUsuario.nickname, objUsuario.email, objUsuario.telefono)">Actualizar</button>
            <button>Eliminar</button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
var obj_1 = {
  nombre: "Carolina",
  apellido: "Daza",
  nickname: "caro123",
  email: "carolina@gmail.com",
  telefono: "319872",
};
var obj_2 = {
  nombre: "Ana Maria",
  apellido: "Hernán",
  nickname: "ana0123",
  email: "anamaria@gmail.com",
  telefono: "08255",
};
var obj_3 = {
  nombre: "Juan",
  apellido: "Quiñonez",
  nickname: "Juancho",
  email: "juan@gmail.com",
  telefono: "64332",
};
var obj_4 = {
  nombre: "Daniel",
  apellido: "Fernandez",
  nickname: "danielF",
  email: "daniel@gmail.com",
  telefono: "2945002",
};

export default {
  data: () => {
    return {
      nombre: null,
      apellido: null,
      nickname: null,
      email: null,
      telefono: null,
      usuarios: [obj_1, obj_2, obj_3, obj_4],
    };
  },
  methods: {
    crearUsuario() {
      //Crear objeto json a partir de la info del formulario
      let objUsuario = {
        nombre: this.nombre,
        apellido: this.apellido,
        nickname: this.nickname,
        email: this.email,
        telefono: this.telefono,
      };
      //Añadimos el objeto al arreglo global del componente
      this.usuarios.push(objUsuario);
      //llamamos al método para que limpie los datos de los campos del formulario
      this.limpiarCampos();
    },
    limpiarCampos() {
      this.nombre = null;
      this.apellido = null;
      this.nickname = null;
      this.email = null;
      this.telefono = null;
    },
    btnActualizar(nombre, apellido, nickname, email, telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickname = nickname;
        this.email = email;
        this.telefono = telefono;
    }
    /******
     * <template>
  <div>
    <h1>Productos</h1>

    <!---Formulario para crear un producto---->
    <div>
      <!-----Nombre y precio---->
      <div class="row">
        <!---nombre-->
        <div class="col-6 mb-3">
          <input
            type="text"
            class="form-control"
            id="nombreProducto"
            placeholder="nombre producto"
            v-model="nombre"
          />
        </div>
        <!---precio-->
        <div class="col-6 mb-3">
          <input
            type="number"
            class="form-control"
            id="precioProducto"
            placeholder="precio producto"
            v-model="precio"
          />
        </div>
      </div>
      <!-----Categoría y descripción--->
      <div class="row">
        <!---Categoría--->
        <div class="col-6">
          <select
            v-model="categoria"
            class="form-select"
            aria-label="Default select example"
          >
            <option selected value="null">Categoría</option>
            <option value="Bebidas">Bebidas</option>
            <option value="Licores">Licores</option>
            <option value="Frutas">Frutas</option>
          </select>
        </div>
        <!------Descripción----->
        <div class="col-6 mb-3">
          <input
            type="text"
            class="form-control"
            id="nombreProducto"
            placeholder="descripción producto"
            v-model="descripcion"
          />
        </div>
      </div>
      <!----Botón de guardado--->
      <button type="button" class="btn btn-success" @click="btnCrearProducto">
        Guardar
      </button>
    </div>

    <!-----TABLA DE PRODUCTOS------->
    <table class="table table-striped table-hover">
      <!---Cabecera de la tabla--->
      <thead>
        <tr>
          <th scope="col">Nombre</th>
          <th scope="col">Precio</th>
          <th scope="col">Categoria</th>
          <th scope="col">Descripción</th>
          <th scope="col">Acciones</th>
        </tr>
      </thead>
      <!---Cuerpo de la tabla--->
      <tbody>
        <!---Iterar la propiedad computada que contiene los productos--->
        <tr v-for="objProducto in productos" :key="objProducto._id">
          <td>{{ objProducto.nombre }}</td>
          <td>{{ objProducto.precio }}</td>
          <td>{{ objProducto.categoria }}</td>
          <td>{{ objProducto.descripcion }}</td>
          <td>
            <!---Botón de editar--->
            <button type="button" class="btn btn-primary">Editar</button>
            &nbsp;
            <!----Botón de eliminar--->
            <button type="button" class="btn btn-danger" @click="btnEliminar(objProducto._id)">Eliminar</button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>Ejercicio:
     * Añada una función al botón 'actualizar' el cual lleve los datos
     * de la fila a la tabla 'registro'
     */
  },
};
</script>

<style>
table {
  margin-top: 50px;
  width: 100%;
}

table,
tr,
td,
th {
  border: 1px solid black;
}
</style>
