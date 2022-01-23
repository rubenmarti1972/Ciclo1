import React from "react";
import './ComponenteConProps.css'

const ComponenteConProps = ({ users }) => {
  return (
    <div>
      <table>
        {/***Cabecera de la tabla*****/}
        <thead>
          <tr>
            <td>Name</td>
            <td>Lastname</td>
            <td>Email</td>
            <td>Phone</td>
          </tr>
        </thead>
        {/***Cuerpo de la tabla*****/}
        <tbody>
          {users.map((obj, i) => {
            return (
              <tr key={i}>
                <td>{obj.name}</td>
                <td>{obj.lastname}</td>
                <td>{obj.email}</td>
                <td>{obj.phone}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
};

export default ComponenteConProps;

