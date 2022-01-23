"""
Programa que permite el acceso a la red WIFI de la empresa TICNet Corp 
que permita identificar a los usuarios y evitar los ateques contra los servidores
al inicio de sesión
"""
#Librerias a utilizar
from tkinter import *
import os
from typing import AbstractSet, Annotated, Any


# Apertura y lectura del archivo plano donde se encuentran los datos
#ruta= "plano.txt"
#archivo =open (ruta,'r')
#print(archivo.read())

#Crear la ventana principal.
def ventanaInicio():
    global ventanaInicial
    colorFondo="DarkGrey"
    ventanaInicial=Tk()
    ventanaInicial.geometry("600x300")#Dimensiones de la ventana
    ventanaInicial.title("                         ")
    Label(text="TicNet Corp.", bg="Blue", width="300", height="2", font=("Calibri", 28)).pack()#Título
    Label(text="Bienvenido al sistema de ubicación para zonas públicas WIFI.", bg="LightBlue", width="400", height="2", font=("Calibri", 12)).pack()#Mensajes de bienvenida
    Label(text="").pack()
    Button(text="Ingresar", height="2", width="30", bg=colorFondo, command=ingreso).pack() #Botón "Ingresar".
    ventanaInicial.mainloop()


def ingreso():
    global usuario
    global contraseña
    global entradaUsuario
    global entradaContraseña
    global ventanaIngreso
    ventanaIngreso = Toplevel(ventanaInicial)
    ventanaIngreso.title("Ingreso")
    ventanaIngreso.geometry("300x250")
   
    usuario=StringVar()
    contraseña=StringVar()
    
    Label(ventanaIngreso, text="Introduzca datos", bg="LightGreen").pack()
    Label(ventanaIngreso, text="").pack()
    etiquetaUsuario= Label(ventanaIngreso, text="Nombre de usuario * ")
    etiquetaUsuario.pack()
    entradaUsuario = Entry(ventanaIngreso, textvariable=usuario) 
    entradaUsuario.pack()
    etiquetaContraseña = Label(ventanaIngreso, text="Contraseña * ")
    etiquetaContraseña.pack()
    entradaContraseña = Entry(ventanaIngreso, textvariable=contraseña, show='*') 
    entradaContraseña.pack()
    Label(ventanaIngreso, text="").pack()
   

"""#Ingreso de los datos del usuario: 
#Usuario (código del estudiante en Misión TIC) y contraseña (código invertido)
usuario:str=(input("Ingrese el usuario"))
contraseña:str=(input("Ingrese la contraseña"))
"""

ventanaInicio()

