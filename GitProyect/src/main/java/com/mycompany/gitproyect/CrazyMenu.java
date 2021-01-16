/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gitproyect;

import java.util.Scanner;

/**
 *
 * @author chema
 */
public class CrazyMenu {
    public static void main(String[] args) {
        
       Scanner r = new Scanner(System.in);
       
        System.out.println("INTERCAMBIO DE FILAS");
		
	int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		
	for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
		System.out.print(a[i][j]+" ");
            }
	}
		
	int f1, f2, aux, n=3;
		
	System.out.println();
	System.out.println("fila 1 a intercambiar: ");
	f1=r.nextInt();
	System.out.println("fila 2 a intercambiar: ");
	f2=r.nextInt();
		
	for (int i = 0; i < n; i++) {
            aux=a[f1-1][i];
            a[f1-1][i]=a[f2-1][i];
            a[f2-1][i]=aux;
			
	}
	for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
		System.out.print(a[i][j]+" ");
					
            }
	}	
        
    
    
        
        
        
    }
    
}
