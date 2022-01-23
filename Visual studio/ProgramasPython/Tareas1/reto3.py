
"""
Programa que permite el acceso a la red WIFI de la empresa TICNet Corp 
que permita identificar a los usuarios y evitar los ateques contra los servidores
al inicio de sesión con un menú de opciones como sigue:
1. Cambiar contraseña
2. Ingresar coordenadas actuales
3. Ubicar zona wifi más cercana
4. Guardar archivo con ubicación cercana
5. Actualizar registros de zonas wifi desde archivo
6. Elegir opción de menú favorita
7. Cerrar sesión

"""
#Librerias a utilizar
from os import system
import time


#Función para limpiar la consola
def limpiar():
    system("clear")


#Variables a las que se les asigna el usuario y la contraseña para comparar con los datos de ingreso

usuario: str ="51630"
contrasena: str  ="03615"


#Lista con las opciones de menu
lista_menu: list=["Cambiar contraseña",
            "Ingresar coordenadas actuales",
            "Ubicar zona wifi más cercana",
            "Guardar archivo con ubicación cercana",
            "Actualizar registros de zonas wifi desde archivo",
            "Elegir opción de menú favorita","Cerrar sesión"
        ]

#Función de ingreso
def menu(lista_menu):
    
    print("")
    cont: int = 1
    for x in lista_menu:
        print(f"{cont}. {x}")
        cont += 1
    opc_menu = None
    try:
        opc_menu = int(input("Elija una opción: "))
    except:
        opc_menu = 0
    return opc_menu



#función para cambiar la opción a favorita
def opcion_favorita():
    
#Intercambio de las opciones del menu 
    op_favorita = int(input("Seleccione opción favorita: "))
    if (op_favorita >= 1 and op_favorita <=5):
        limpiar()
        
        adv = int(input("Para confirmar por favor responda: Tengo forma de serpiente, y entre el dos y el cuatro siempre estoy cuando me buscas "))
        if (adv == 9):
            adv2 = int(input("Para confirmar por favor responda: Se trata de un caso extraño, pues siendo siempre el mismo vale mucho o vale nada, según el sitio en que va. : "))
            if (adv2 == 0):
                print(lista_menu)
            else:
                print("Error")
                
        else:
            print("Error")
            
    else: 
        print("Error")
        exit()
# Se declara una lista vacía para almacenar las coordenadas
coordenadas_usuario:list  = [] 
#función para escoger cual coordenada se va a cambiar
def funcion_submenu():
    
    
    opc_cambiar = int(input("Presione 1,2 ó 3 para actualizar la respectiva coordenada. Presione 0 para regresar al menú"))
    
     
    if (opc_cambiar>=0) and (opc_cambiar<=3): # controlo que las opciones del menu esten entre 0 y 3
        if opc_cambiar == 1:
            
            cambiar_coordenadas1()
            exit()
        
        if opc_cambiar == 2:
            cambiar_coordenadas2()
            
            exit()

        if opc_cambiar == 3:
            cambiar_coordenadas3()
            exit()

        if (opc_cambiar == 0):
            funcion_menu(lista_menu)
            exit()
    else: 
        print("Error actualización")
    
      
# Función para ingresar las coordenadas
def ingresar_coordenadas():
    
    cont =0
    while cont < 3:
        global coordenadas_usuario
        try:
            latitud:float=(float(input(f"Coordenada [latitud]{cont+1}: ")))
        except ValueError:
            print("Error")
            exit()
        # Se valida que las coordenadas estén dentro del rango 
        if (latitud >= 5.888) and (latitud <= 6.306): 
            try:
                longitud:float=(float(input(f"Coordenada [longitud] {cont+1}: ")))
            except ValueError:
                print("Error")
                exit()
                
            if (longitud >= -72.552) and (longitud <= -72.321):
                lugar_nuevo: list=[latitud,longitud]
                coordenadas_usuario.append(lugar_nuevo)
                cont+=1
            else:
                limpiar()
                print("Error coordenada")
                exit()
        else: 
            limpiar()
            print("Error coordenada")
            exit()
                    
        

                
 
#función que permite cambiar las coordenadas    
def cambiar_coordenadas():
    limpiar()
    if len(coordenadas_usuario)==0:
        ingresar_coordenadas()
        funcion_menu(lista_menu)
       
    else:
        
        cont: int=1
        for k in coordenadas_usuario:
            print(f"Coordenadas [Latitud, Longitud] {cont}: ['{k[0]}','{k[1]}']")
            cont+=1
    
    print("La coordenada 1 es la que está más al norte")
    print("La coordenada 2 es el promedio de todos los puntos")
    time.sleep(1)
    funcion_submenu()
        
#cambia la primera coordenada
def cambiar_coordenadas1():
    
    try:
        nueva_latitud:float=float(input("Ingrese la nueva [Latitud 1]:  "))
    except ValueError:
            print("Error")
            exit()
    
    if (nueva_latitud >= 5.888) and (nueva_latitud <= 6.306): 
        try:
            nueva_longitud:float=float(input("Ingrese la nueva [Longitud 1]:  "))
        except ValueError:
            print("Error")
            exit()
        if (nueva_longitud >= -72.552) and (nueva_longitud <= -72.321):
            lugar_nuevo: list=[nueva_latitud,nueva_longitud]
            coordenadas_usuario[0] =lugar_nuevo
        else: 
            print("Error actualización")
            exit()
    else: 
        print("Error actualización")
        exit()

    
    funcion_submenu()

#cambia la segunda coordenada
def cambiar_coordenadas2():
    
    try:
        nueva_latitud:float=float(input("Ingrese la nueva [Latitud 2]:  "))
    except ValueError:
        print("Error")
        exit()   
    
    if (nueva_latitud >= 5.888) and (nueva_latitud <= 6.306): 
        try:
            nueva_longitud:float=float(input("Ingrese la nueva [Longitud 2]:  "))
        except ValueError:
            print("Error")
            exit() 
        if (nueva_longitud >= -72.552) and (nueva_longitud <= -72.321):
            lugar_nuevo: list=[nueva_latitud,nueva_longitud]
            coordenadas_usuario[1] =lugar_nuevo
        else: 
            print("Error actualización")
            exit()
    else:
        print("Error actualización")
        exit()
    
    funcion_submenu()
#Si la opción es 3 cambia la tercera coordenada
def cambiar_coordenadas3():    
    try:
        nueva_latitud:float=float(input("Ingrese la nueva [Latitud 3]:  "))
    except ValueError:
        print("Error")
        exit() 
    if (nueva_latitud >= 5.888) and (nueva_latitud <= 6.306): 
        
        try:
            nueva_longitud:float=float(input("Ingrese la nueva [Longitud 3]:  "))
        except ValueError:
            print("Error")
            exit() 
        if (nueva_longitud >= -72.552) and (nueva_longitud <= -72.321):
            lugar_nuevo: list=[nueva_latitud,nueva_longitud]
            coordenadas_usuario[2] =lugar_nuevo
        else: 
            print("Error actualización")
            exit()
    else: 
        print("Error actualización")
        exit()
                      
    funcion_submenu()

#Función del menú principal
def funcion_menu(lista_menu):
    limpiar() 
    contint = 0 # cuenta el numero de intens fallido y se sale del menu al ser igual a 3
    opc_menu = 1 # se inicializa en 1 para que entre por primera vez al while
    # ciclo repetitivo para controlar el menu
    while (opc_menu != 7 and contint !=3): 
        opc_menu = menu(lista_menu)
        if (opc_menu > 7) or (opc_menu <= 0): # controlo que las opciones del menu esten entre 1 y 7
            contint +=1
            print("Error")

        if opc_menu == 1:
            print(f"Usted ha elegido la opción {opc_menu}")
            cambiar_contrasena()
            
 
        
        if opc_menu == 2:
            print(f"Usted ha elegido la opción {opc_menu}") 
            cambiar_coordenadas()
            exit()

        if opc_menu == 3:
            print(f"Usted ha elegido la opción {opc_menu}") 
            exit()

        if opc_menu == 4:
            print(f"Usted ha elegido la opción {opc_menu}") 
            exit()
        
        if opc_menu == 5:
            print(f"Usted ha elegido la opción {opc_menu}") 
            exit()

        if opc_menu == 6: 
            opc_menu = opcion_6(lista_menu) 
            

        if (opc_menu == 7):
            print("Hasta pronto")
            exit()

# función para cambiar la contraseña
def cambiar_contrasena():
    limpiar()
    global contrasena
    contrasena_actual:str =input("Ingrese la contraseña actual: ")
    if contrasena_actual == contrasena:
        contrasena_nueva:str = input("Ingrese la nueva contraseña: ")
        if contrasena_nueva == contrasena_actual:
            limpiar()
            print("Error")
            exit()
        else:
            contrasena_nueva=contrasena
            print("Su contraseña ha sido cambiada con éxito")
    else:
        print("Error")
    
    time.sleep(0.5)
    funcion_menu(lista_menu)




def opcion_6(lista_menu): # se hace el intercambio de las opciones del menu.
    opc_favorita = int(input("Seleccione opción favorita: "))
    if (opc_favorita >= 1 and opc_favorita <=5):
        adv = int(input("Para confirmar por favor responda: Tengo forma de serpiente, y entre el dos y el cuatro siempre estoy cuando me buscas "))
        if (adv == 3):
            adv2 = int(input("Para confirmar por favor responda: Se trata de un caso extraño, pues siendo siempre el mismo vale mucho o vale nada, según el sitio en que va. : "))
            if (adv2 == 0):
                aux = lista_menu[0]
                lista_menu[0] = lista_menu[5]
                lista_menu[5] = aux
                limpiar()
                cont1=0
                for x in lista_menu:
                    print(f"{cont1}. {x}")
                    cont1 += 1
                
                funcion_menu(lista_menu)
                
        else:
            print("Error")
            funcion_menu(lista_menu)
    else:
        print("Error")
        exit()

def ubicar_zona():
   
    opcion_favorita()
    print("Error")
            
def guradar_archivo():
    opcion_favorita()
   
    print("Error")       

def actualizar_registros():
    
    opcion_favorita()
    print("Error")  




#Mensaje Inicial
print("Bienvenido al sistema de ubicación para zonas públicas WIFI")

#Función de ingreso
def ingreso()->str:
    global usuario
    global contrasena
      
    #Ingreso y validación del usuario y la contraseña
    user: str= input("Usuario:    ")
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
                        time.sleep(1)
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
funcion_menu(lista_menu)
