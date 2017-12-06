/*
 (Java) Dada una matriz cuadrada M de tama no m ∗ m, la cual almacena números
enteros ingresados de forma manual por el usuario (sucesión de números separados por
comas), y siendo m un parámetro ingresado por consola, imprima todos los números
que NO corresponden al rombo generado al interior de la matriz como se muestra en
la Figura 3.
 */
package taller3_5;

//librerias
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class Taller3_5 {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int m;
        Random r = new Random(); //para los numeros random
        
        bw.write("ingrese tamaño del arreglo: ");
        bw.flush();
        m = Integer.parseInt(bf.readLine()); //guardamos tamaño del arreglo
        
        int[][] rombo_1 = new int[m][m]; //creamos el arreglo

        int mitad = m / 2; //idetificar mitad del arreglo
        int mitad_2 = mitad - 1;

        //llenamos el arreglo con numeros aleatorios
        for (int i = 0; i < rombo_1.length; i++) {
            for (int j = 0; j < rombo_1.length; j++) {
                rombo_1[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        
        //imprimos el arreglo normal
        for (int i = 0; i < rombo_1.length; i++) {
            bw.write("\n");
            for (int j = 0; j < rombo_1.length; j++) {

                bw.write("[" + rombo_1[i][j] + "]");
                bw.flush();
            }
        }
        bw.write("\n");

        //desde o hasta la mitad realiza lo siguiente
        for (int i = 0; i < mitad; i++) {
            for (int j = 0; j < mitad; j++) {

                // darle forma de triangulo rectangulo a cada lado
                if (j >= i) {

                    rombo_1[j][mitad + i] = 0; //superior derecha
                    rombo_1[j][mitad_2 + i] = 0; //superior derecha

                    rombo_1[j][mitad - i] = 0; //superior izquierda
                    rombo_1[j][mitad_2 - i] = 0; //superior izquierda

                    rombo_1[m - j - 1][mitad - i] = 0;  //inferior izquierda
                    rombo_1[m - j - 1][mitad_2 - i] = 0; //inferior izquierda

                    rombo_1[m - j - 1][mitad + i] = 0; //inferior derecha
                    rombo_1[m - j - 1][mitad_2 + i] = 0; // inferior derecha

                }

            }

        }

        //imprimimos el arreglo 
        for (int i = 0; i < rombo_1.length; i++) {
            bw.write("\n");
            for (int j = 0; j < rombo_1.length; j++) {

                bw.write("[" + rombo_1[i][j] + "]");
                bw.flush();
            }
        }
    }

}
