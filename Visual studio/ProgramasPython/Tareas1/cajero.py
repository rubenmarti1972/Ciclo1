"""

Desarrollar una función que se implementará en un cajero,
esta función será la encargada de procesar los
retiros de dinero.
Reciba como parámetros la cantidad a retirar y
el saldo inicial del usuario.
Si la cantidad a retirar es superior a $20.000
el cajero cobrará una comisión de $2.000.
Si el monto supera el saldo inicial muestre en pantalla
"El valor a retirar supera el saldo"
En caso de realizar el retiro de forma exitosa,
mostrar el saldo que al cliente le queda.
"""
from os import system
from tkinter import Canvas
system("cls")


def cajero(saldoCuenta,cantidadRetiro):
    if cantidadRetiro > saldoCuenta: 
        mensaje="Saldo insuficiente"
        return mensaje
    elif CantidadRetiro > 20000:
        saldoNuevo=float(saldoCuenta-cantidadRetiro-2000)
    else:
        saldoNuevo=float(saldoCuenta-cantidadRetiro)
    return saldoCuenta



try:
    saldoCuenta = float(input("Ingrese su saldo inicial: "))
    cantidadRetiro = float(input("Ingrese valor del saldo a retirar: "))
    print(cajero(cantidadRetiro,saldoCuenta))
except:
    print("El valor ingresado debe ser numérico, muchas gracias")
exit(0)
"""
def retiroCajero(canReti,saldoIni):
    if canReti > saldoIni:
        msj = "El valor a retirar supera el saldo"
        return msj
    elif canReti > 20000:
        saldoIni = saldoIni - canReti
        saldoIni = saldoIni - 2000
    else:
        saldoIni = saldoIni - canReti
        print("Retiro de forma Exitosa")
    return saldoIni
try:
    canReti = float(input("Ingrese valor del saldo a retirar: "))
    saldoIni = float(input("Ingrese su saldo inicial: "))
    print(retiroCajero(canReti,saldoIni))
except:
    print("El valor ingresado debe ser numérico, muchas gracias")
exit(0)

def cajero(retiro: int, saldo: int)->int:
    
    if retiro <= saldo:
        if retiro > 20000:
            comision:int = 2000
            movimiento: int = saldo - retiro - comision
        else: movimiento: int = saldo - retiro
    else: 
        print("El valor a retirar supera el saldo")
        exit(0)
    return movimiento

try:
    saldo = int(input("Saldo inicial: $ "))
    monto = int(input("Cantidad a retirar: $ "))
    print("Nuevo saldo: $ ",format(cajero(monto,saldo)))

except:print("Debe digitar un número")
"""
print("\U0001f600")
print("\U0001F606")
print("\U0001F923")
print("\U0001F618")
print("\U0001F917")
print("\U0001F62A")

