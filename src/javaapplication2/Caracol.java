/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Asus
 */
public class Caracol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mat[][]= new int [10][10];
        int num=5;
int inicio = 0;
int fim = num -1;
int cont = 1;

while ( cont <= num*num){
	for(int i = inicio;i<=fim;i++){
		mat[inicio][i]= cont++;
	}
	for(int i= inicio+1;i<=fim;i++){
		mat[i] [fim]= cont++;
	}
	for(int i = fim-1;i>= inicio;i--){
		mat[fim][i]=cont ++;
	}
	for(int i = fim-1;i>=inicio +1;i--){
		mat[i][inicio]=cont ++;
	}
	inicio = inicio +1;
	fim=fim-1;
	}
        for(int i =0;i<=num;i++){
            System.out.println("");
            for(int j=0;j<=num;j++){
                System.out.print(mat[i][j]    +"\t");
            }
        }
    }
    
}
int num = 5;
//                int inicio = 0;
//                int fim = num - 1;
//                int cont = 1;
//
//                while (cont <= num * num) {
//                    for (int i = inicio; i <= fim; i++) {
//                        mat[inicio][i] = linea;
//                    }
//                    for (int i = inicio + 1; i <= fim; i++) {
//                        mat[i][fim] = linea;
//                    }
//                    for (int i = fim - 1; i >= inicio; i--) {
//                        mat[fim][i] = linea;
//                    }
//                    for (int i = fim - 1; i >= inicio + 1; i--) {
//                        mat[i][inicio] = linea;
//                    }
//                    inicio = inicio + 1;
//                    fim = fim - 1;
//                }