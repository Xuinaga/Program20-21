/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Scanner;
import model.SQLiteKudeatu;

/**
 *
 * @author suinaga.jon
 */
public class ProgramaNagusia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SQLiteKudeatu s1 = new SQLiteKudeatu();
        System.out.println("Ongi etorri Suinagaren Hiztegira");
        int aukera = 1;
        while (aukera != 5) {
            
            System.out.println("\n---------------------------");
            System.out.println("1-Hiztegiko Terminoak ikusi");
            System.out.println("2-Termino bat gehitu");
            System.out.println("3-Termino bat eguneratu");
            System.out.println("4-Termino bat borratu");
            System.out.println("5-Programatik irten\n");
            System.out.println("Zer egin nahi duzu?\n");            
            aukera = sc.nextInt();
            System.out.println("");
            switch (aukera) {
                case 1:
                    s1.selectAll();
                    break;
                case 2:
                    System.out.println("\nSartu terminoa euskeraz: ");
                    String eusk = sc.next();
                    System.out.println("\nSartu terminoa gazteleraz: ");
                    String gazt = sc.next();
                    System.out.println("\nSartu terminoa inglesez: ");
                    String ingl = sc.next();
                    s1.insert(eusk, gazt, ingl);
                    s1.selectAll();
                    break;
                case 3:
                    System.out.println("\nZein ID duen terminoa eguneratu nahi duzu? ");
                    int ida = sc.nextInt();
                    System.out.println("\nEsan euskeraz nola deitu nahi diozun: ");
                    String euskB = sc.next();
                    System.out.println("\nEsan gazteleraz nola deitu nahi diozun:");
                    String gaztB = sc.next();
                    System.out.println("\nEsan inglesez nola deitu nahi diozun:");
                    String inglB = sc.next();
                    s1.update(ida, euskB, gaztB, inglB);
                    break;

                case 4:
                    System.out.println("\nZein ID duen terminoa ezabatu nahi duzu?");
                    s1.selectAll();
                    int idBorratu = sc.nextInt();
                    s1.delete(idBorratu);
                    s1.selectAll();
                    break;
                case 5:
                    System.out.println("IKUSI ARTE!");
                    break;
            }
        }

    }
}
