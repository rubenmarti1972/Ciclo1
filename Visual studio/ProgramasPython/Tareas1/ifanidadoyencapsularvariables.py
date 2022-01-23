from os import system

system("clear")

#Operaciones ternarias
"""
var1 = 5
var2 = 8
resultado = 'Cumple' if var1 > var2 else 'No cumple'
print(resultado)
"""
"""
j = "8.9"
#Castear (convertir) un tipo de dato a otro
#Convertimos un string a un flotante
n = float(j)
#Convertir un entero a un string
entero = 10
cadena = str(entero)
"""
"""
nuevo_tipo_dato = tipo_dato(lo_que_quiero_convertir)
"""

"""
El input retorna un string
por eso es importante
"""
"""
num1 = int( input("Por favor ingrese un número: ") )
num2 = int( input("Por favor ingrese otro número: ") )
suma = num1 + num2
print("La suma es: ")
print(suma)
#Terminar el programa
exit(0)
"""
"""
import random
longitud:int = 3

abecedario:str = '51630A'
# Elije aleatoriamente 5 elementos del abecedario
desordenar = random.sample(abecedario, longitud)
# join crea cadenas a partir de objetos iterables 
palabra:str = ''.join(desordenar)

print(palabra)
"""

num = 10
num2 = 5
#Condición padre o principal
if num == 10:
    #Condición hijo o condición anidada
    if num2 == 5:
        print("Condición anidada")
    elif num2 < 5:
        print("Fuera del if")
else:
    #Condición anidada
    if num > 10:
        #Condición anidada
        if num == 12:
            print("")

#Muestro información
#print("Muestra informacion")
#Solicito información
#info = input("Por favor digite una tecla: ")
#Muestro la información ingresada por el usuario
#print("El usuario ingresó:", info)
"""
var = "5"
#Casteamos (convertimos) un tipo de dato a otro
numero1 = var#int(var)
numero2 = 5
#Operación matematica
suma = numero1 + numero2
print(suma)
"""
#Manejo de excepciones
try:
    numero1 = float(input("Por favor ingrese un número: "))
    # Pedimos un numero por consola
    numero2 = float(input("Por favor ingrese otro número: "))
    # Operamos las variables
    suma = numero1 + numero2
    print(suma)
except:
    print("Debe digitar un número")
    #Terminar el programa
    exit(0)