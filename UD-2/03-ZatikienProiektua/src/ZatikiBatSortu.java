/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suinaga.jon
 */
public class ZatikiBatSortu {
    public static void main(String[] args) {
      Zatikia z1 = new Zatikia(1,4);  // Use 3rd constructor
      System.out.println(z1);  // use dot operator to invoke member methods
      
      Zatikia z2 = new Zatikia(1,2);  // Use 3rd constructor
      System.out.println(z2); 
      
      Zatikia z3 = new Zatikia();  // Use 3rd constructor
      System.out.println("Bi zatikien biderketa da: "+z3.biderkatu(z1,z2));
      Zatikia z4 = new Zatikia();  // Use 3rd constructor
      System.out.println("Bi zatikien batuketa da: "+z4.batu(z1,z2));
      
    }
}
