/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

/**
 *
 * @author HOME
 */
public class Taller3_2 {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int m;
        Random r = new Random();
        bw.write("Tamaño del arreglo: ");
        bw.flush();
        m = Integer.parseInt(bf.readLine());
        int[][] arreglo_1 = new int[m][m];

        int aux = m - 1, j, i;

        for (i = 0; i < arreglo_1.length; i++) {
            for (j = 0; j < arreglo_1.length; j++) {
                arreglo_1[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        bw.write("Arreglo original");
        bw.flush();
        for (i = 0; i < arreglo_1.length; i++) {
            bw.write("\n");
            for (j = 0; j < arreglo_1.length; j++) {

                bw.write("[" + arreglo_1[i][j] + "]");
                bw.flush();
            }
        }
        bw.write("\n");
        bw.write("\n");
        bw.flush();

        for (i = 1; i < m; i++) {
            for (j = i - 1; j < aux; j++) {
                bw.write("["+arreglo_1[m - (aux + 1)][j] + "]");
                
                bw.flush();
            }bw.write("\n");
            for (j = i - 1; j < aux; j++) {
                bw.write("["+arreglo_1[j][aux] + "]");
                
                bw.flush();
            }bw.write("\n");
            for (j = aux; j >= (i - 1); j--) {
                bw.write("["+arreglo_1[aux][j] + "]");
                
                bw.flush();
            }bw.write("\n");
            aux--;
            for (j = aux; j >= i; j--) {
                bw.write("["+arreglo_1[j][m - (aux + 2)] + "]");
                
                bw.flush();
            }bw.write("\n");
        }

    }

}
