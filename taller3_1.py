#(Python) Dada una matriz cuadrada M de tamaño m ∗ m, la cual almacena números
#enteros generados de forma aleatoria, y siendo m un parámetro que se ingresa por
#consola, imprima todos los números que corresponden al rombo generado al interior
#de la matriz como se muestra en la Figura 1.

import random
array = int(input("ingrese tamaño del arreglo: "))
fn=array
cn=array

mitad_1 = int(array/2)
mitad_2 = mitad_1-1

matriz = [] #Creamos la matriz
matriz_2 = []

for i in range(fn): # llenamos la matriz
    matriz.append([]) # creamos la matriz segun sus lados
    matriz_2.append([])
    for j in range(cn):
        matriz[i].append(0) #llenamos la matriz de ceros
        matriz_2[i].append(0) #llenamos la matriz de ceros



for i in range(fn): #llenamos la matriz de numeros aleatorios
    for j in range(cn):
        matriz[i][j]=random.randrange(1,10)

print ("Matriz normal")
for i in range(fn): #imprimimos la matriz normal
    print ()
    for j in range(cn):
        print ("[", matriz[i][j], "]", end= "")
print ()

# recorremos hasta la mitad
for i in range (0,mitad_1):
    for j in range (0,mitad_1):

        # darle forma de triangulo rectangulo a cada lado
        if(j>=i):
            matriz_2[j][mitad_1 + i] = matriz[j][mitad_1 + i] #lado superio derecho
            matriz_2[j][mitad_2 - i] = matriz[j][mitad_2 - i] #lado superio izquierdo

            matriz_2[fn - j - 1][mitad_1 + i] = matriz[fn - j - 1][mitad_1 + i]; #lado inferior derecho
            matriz_2[fn - j - 1][mitad_2 - i] = matriz[fn - j - 1][mitad_2 - i]; # lado inferiro izquierdo

print ("Matriz en rombo")
for i in range(fn): #imprimimos la matriz cambiando sus lados
    print ()
    for j in range(cn):
        print ("[", matriz_2[i][j], "]", end= "")



