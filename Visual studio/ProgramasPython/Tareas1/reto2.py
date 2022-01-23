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

#Función para limpiar la consola
def limpiar():
    system("clear")

#Lista con las opciones de menu
lista_menu: list=["Cambiar contraseña","Ingresar coordenadas actuales","Ubicar zona wifi más cercana","Guardar archivo con ubicación cercana","Actualizar registros de zonas wifi desde archivo","Elegir opción de menú favorita","Cerrar sesión"]

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
def opcion_favorita():
    
#Intercambio de las opciones del menu 
    op_favorita = int(input("Seleccione opción favorita: "))
    if (op_favorita >= 1 and op_favorita <=5):
        limpiar()
        
        adv = int(input("Para confirmar por favor responda: Si me giras pierdo tres unidades por eso debes colocarme siempre de pie, la respuesta es "))
        if (adv == 9):
            adv2 = int(input("Para confirmar por favor responda: De millones de hijos que somos el primero nací, pero aun así soy el menor de todos. ¿Quién soy? : "))
            if (adv2 == 0):
                print(lista_menu)
            else:
                print("Error")
                
        else:
            print("Error")
            
    else:
        print("Error")
        exit()



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

def funcion_menu(lista_menu):
    limpiar() # Sub programa 
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
            exit()
        
        if opc_menu == 2:
            print(f"Usted ha elegido la opción {opc_menu}") 
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

def cambiar_contraseña():
   
    opcion_favorita()
    print("Error")

def cambiar_coordenadas():
   
    opcion_favorita()
    print("Error")

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
funcion_menu(lista_menu)