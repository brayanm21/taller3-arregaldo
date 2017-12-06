# include <iostream>
# include <stdlib.h>
# include <stdio.h>
# include <conio.h>
# include <ctime>


using namespace std;

int main()
{
	
	int m,positivo=0,negativo=0,par=0,impar=0;
	
	cout<<"Tamaño del arreglo: "; // imprimimos
	cin >> m; //guardamos el valor en m
	
	int a[m][m];  //arreglo del tamaño seleccionado
	
	srand(time(0)); // pasa que siempre se genere de forma random
	for (int i =0; i<m;i++){ // llenamos el arreglo en cada posicion
		for (int j =0; j<m;j++){
			a[i][j]= -10 + rand()% 20;	//se van a llenar con numeros desde -10 hasta 20
	}}
	
	for (int i =0; i<m;i++){ // imprimimos el arreglo
		for (int j =0; j<m;j++){
			printf("[");
			cout<<a[i][j] ;	
			printf("]");	
	}printf("\n");
	}
	
	printf("\n");
	printf("Los numeros positivos son: ");// imprimimos para los positivos
	printf("\n");
	
	for (int i =0; i<m;i++){ // rrecoremos el arreglo para conocer cual es positivo y imprimirlo
		for (int j =0; j<m;j++){
			if(a[i][j]>0){
				positivo = positivo + 1; // suma uno cada vez que cumpla la condicion
				printf("[");
				cout<<a[i][j] ;
				printf("]");
				}	
	}
	}cout<<" Son : "<<positivo ; //imprima la suma de la condicion
	
	printf("\n");
	printf("Los numeros negativos son: ");// imprimimos para los negativos
	printf("\n");
	
	for (int i =0; i<m;i++){ // rrecoremos el arreglo para conocer cual es negativo y imprimirlo
		for (int j =0; j<m;j++){
			if(a[i][j]<0){
				negativo = negativo + 1; // suma uno cada vez que cumpla la condicion
				printf("[");
				cout<<a[i][j] ;
				printf("]");
				}	
	}
	}cout<<" Son : "<<negativo ;//imprima la suma de la condicion
	
	printf("\n");
	printf("Los numeros pares son: ");// imprimimos para los pares
	printf("\n");
	
	for (int i =0; i<m;i++){ // rrecoremos el arreglo para conocer cual es par y imprimirlo
		for (int j =0; j<m;j++){
			if(a[i][j]%2==0){
				par = par + 1;// suma uno cada vez que cumpla la condicion
				printf("[");
				cout<<a[i][j] ;
				printf("]");
				}	
	}
	}cout<<" Son : "<<par ;//imprima la suma de la condicion
	
	printf("\n");
	printf("Los numeros impares son: ");// imprimimos para los impares
	printf("\n");
	
	for (int i =0; i<m;i++){ // rrecoremos el arreglo para conocer cual es impar y imprimirlo
		for (int j =0; j<m;j++){
			if(a[i][j]%2!=0){
				impar = impar + 1;// suma uno cada vez que cumpla la condicion
				printf("[");
				cout<<a[i][j] ;
				printf("]");
				}	
	}
	}cout<<" Son : "<<impar ;//imprima la suma de la condicion
	printf("\n");
	
	system("pause");
	return 0;
}
