# include <iostream>
# include <stdlib.h>
# include <stdio.h>
#include <vector>
#include <string>
#include <sstream>


using namespace std;

int main()
{
string str;
    vector<int> vect;
    int contador;
    int  temp; 
    int n,i;
    cout<<"tamaño del arreglo: ";cin>>n; 
	int a[n][n]; 
	int tam = (n*n);
	int acom[tam];
	
    cout << "ingrese datos separados por comas(,) \n";
    cin >> str;
    stringstream ss(str);
    
    

//ignoramos los datos que esten separados por comas
    while (ss >> i){
        vect.push_back(i);
        if (ss.peek() == ','){
		
            ss.ignore();}
	
    }

	
// llenamos el arreglo con los datos sin comas	
    for (i=0; i< vect.size(); i++){
    	acom[i] = vect.at(i);
    	 
	}
	//llenamos la primer parte del arreglo
	for (int i=0; i< n; i++){
			for (int j =0; j<n;j++){
    			a[i][j]=acom[j];
    	 	
	}
	//llenamos la segunda parte
	
			for (int j =n; j<tam;j++){
    			a[i][j]=acom[j];
    	 	
	}}
	
	for ( i =0; i<tam;i++){ // imprimimos el arreglo
			printf("[");
			cout<<acom[i] ;
			printf("]");
	}printf("\n");
	
	for ( i =0; i<n;i++){ // imprimimos el arreglo
		for (int j =0; j<n;j++){
			printf("[");
			cout<<a[i][j] ;
			printf("]");
	}printf("\n");
}
system("pause");
	return 0;}


	

