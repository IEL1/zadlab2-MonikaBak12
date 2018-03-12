/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author Monika
 */
public class Zadanie7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x;
        int i;
        int sort = 1;
        int temp;
        System.out.println("Podaj ilość liczb jaką chcesz wprowadzić: ");
        x = scanner.nextInt();
        int[] tab = new int[x];
        for(i=0;i<tab.length; i++){
            System.out.println("Podaj liczbe: ");
            tab[i] = scanner.nextInt();
           
        }
        while(sort !=0){
           sort = 0;
           for(i=0;i<tab.length - 1; i++){
            if(tab[i]>tab[i + 1]){
                temp = tab[i];
                tab[i]=tab[i+1];
                tab[i+1]=temp;
                sort++;
            }
        }
    }
        for(i=0; i<tab.length; i++){
            System.out.println(tab[i] + " ");
        }
    }
    
}


