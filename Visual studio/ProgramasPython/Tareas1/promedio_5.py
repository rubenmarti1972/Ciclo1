""" 
Programa que calcula el promedio de 5 números y lo muestra por pantalla
"""

def espacio(): 
    print("\n")

contador = 1
suma = 0
espacio()  
print ("Ingrese los números")
while contador <= 5:
    numero= float(input())
    suma: float = suma + numero
    contador = contador + 1

promedio: float = suma/5
print("El promedio de los 5 números es: {}".format(promedio))