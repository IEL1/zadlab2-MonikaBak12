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
public class Zadanie6 {
    
    public static void main(String[] arg){
        Scanner scanner = new Scanner (System.in);
        int x;
        while (true) {
            System.out.println("Podaj x: ");
            x = scanner.nextInt();
            if ( x < 0){
                break;
            }
        }
      } 
    
    
}
