/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Account;

/**
 *
 * @author Jon
 */
public class GastatuTaGastatu {
    public static void main(String[] args) {
        Account a1 = new Account("2095-05", "Suinaga", 1000);
        int ateraldiak=0;
        while(a1.getBalance()>=150){
            a1.debit(150);
            ateraldiak++;
        }
        System.out.println("Triste nago 150€ atera ditudalako "+ateraldiak+" aldiz eta orain "+a1.getBalance()+"€ bakarrik dauzkadalako kontuan. :-(");
    }
}
