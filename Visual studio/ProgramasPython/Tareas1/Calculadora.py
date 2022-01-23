from typing import Type

""" Programa que simula una calculadora que suma, resta, multiplica, divide y eleva a la potencia
"""
def espacio():
    
    print("\n")


    
#Ingresa la cantidad de hijos y lo muestra en pantalla
espacio()
cantidadHijos: int = input ("Ingrese la cantidad de hijos: \n")
print(type(cantidadHijos))
print("La cantidad de hijos es: \n",cantidadHijos)

#Área de un triángulo 
base: None
altura: None

while True:
    try:
        espacio()
        base= float(input("Ingrese la base del triángulo:\n "))
        break 
    except:
        print("debe ingresar un número real")

while True:
    try:
        altura= float(input("Ingrese la altura del triángulo:\n "))
        break 
    except:
        print("debe ingresar un número real")

area = (base * altura)/2
print (type(base))
print (type(altura))
print ("El área de un triángulo es: {} \n".format(area))

#Cadena de caracteres
espacio()
Nombre:str=input("Ingrese el nombre: ")
Apellido: str=input("Ingrese el apellido: ")
NombreCompleto: str=Nombre + Apellido
print("Su nombre completo es:  = {} " .format(NombreCompleto))



