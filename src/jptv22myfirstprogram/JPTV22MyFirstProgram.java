/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22myfirstprogram;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV22MyFirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Имя");
        String firstname = scanner.nextLine();
        System.out.println("Введите Фамилию");
        String lastname = scanner.nextLine();
        System.out.println("Hello! " + firstname + " " + lastname);
    }
    
}
