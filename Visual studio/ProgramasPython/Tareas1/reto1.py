"""
Programa que permite el acceso a la red WIFI de la empresa TICNet Corp 
que permita identificar a los usuarios y evitar los ateques contra los servidores
al inicio de sesión
"""
#Librerias a utilizar
from os import system
system("clear")



#Mensaje Inicial
print("Bienvenido al sistema de ubicación para zonas públicas WIFI")


#Función de ingreso
def ingreso()->str:
    #Variables a las que se les asigna el usuario y la contraseña para comparar con los datos de ingreso
    usuario: str ="51630"
    contrasena: str  ="03615"
      
    #Ingreso y validación del usuario y la contraseña
    user: str= input("Usuario:  ")
    if usuario== user:
        password: str= input("Contraseña: ")
        if  contrasena==password:
            #Calculo de las ecuaciones para el captcha
            try:
                digitos: int = 630
                penultimo: int = 3
                expresion: int = ((1%5)+(6-5)+1)-0 
                if penultimo == expresion:
                    suma: int = digitos + penultimo
                    #Ingreso y validación del captcha
                    respCaptcha = int(input (f"{digitos} + {penultimo} = "))
                    if suma ==respCaptcha:
                        print("Sesión iniciada")
                    else:
                        print("error")
                else:
                    print("Error")     
            except:
                print("Ingrese un valor numérico")
                exit(0)
        else:
            print("Error")
            exit(0)   
    else:
        print("error")
        exit(0)


ingreso()

