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
public class Zadanie4 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
          
            int[] tab = new int[10];
            for (int i = 0; i<10;i++ ){
            System.out.println("Podaj "+ (i+1)+" liczbe");
            String liczba = scanner.nextLine();
            tab[i] = Integer.parseInt(liczba);
            }
            int x; 
            System.out.println("Podaj numer algorytmu do wykonania: ");
            System.out.println(" 1 - oblicz sumę elementów tablicy");
            System.out.println(" 2 - oblicz iloczyn elementów tablicy");
            System.out.println(" 3 - średnia wartość");
            System.out.println(" 4 - wartość minimalna");
            System.out.println(" 5 - wartość maksymalna");
            x = scanner.nextInt();
            switch (x){
                case 1:
                    int wynik;
                    wynik = 0;
                    for(int i=0; i<10; i++){
                        wynik += tab[i];
                    }
                    System.out.println("Suma elementów tablicy wynosi: " +wynik);
                    break;
                case 2:
                    int wynik1 = 1;
                    for(int i=0; i<10; i++){
                        wynik1= wynik1*tab[i];
                    }
                    System.out.println("Iloczyn elementów tablicy wynosi: " +wynik1);
                    break;
                case 3:
                    int suma = 0;
                    for(int i=0;i<10;i++){
                        suma += tab[i];
                      
                    }
                    System.out.println("Średnia wartość: " +suma/4);
                    break;
                case 4:
                    int wynik2 = tab[0];
                    for(int i=0;i<10;i++){
                        if(wynik2 < tab[i]){
                            wynik2 = tab[i];
                        }
                    }
                    System.out.println("Wartość minimalna: " +wynik2);
                    break;
                case 5:
                    int wynik3 = tab[0];
                    for(int i=0;i<10;i++){
                        if(wynik3 > tab[i]){
                            wynik3 = tab[i];
                        }
                    }
                    System.out.println("Wartość maksymalna: "+wynik3);
                    break;
                    
                    
            }       
            
                  
}
}
