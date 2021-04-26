/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import moodel.Entrenador;
import moodel.Futbolista;
import moodel.IntegranteSeleccion;
import moodel.Masajista;

public class EuskalSelekzioa {
    
    public static int azkenId = 0; 
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<IntegranteSeleccion>();
    /** Programa honek metodo desberdinei deituko die banan banan. 
     *  Beharbada ez diozu koherentzia handirik topatuko programa osoari. 
     *  Ariketaren helburua da beste pakete bateko klase hierarkia erabiltzen trebatzea. 
     *   
     */
    public static void main(String[] args) {
        
        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 5;
        if (partaideaEzabatu(ezabatzekoIda)){
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
        System.out.println("Selekzioa horrela geratu da:"+selekzioa);
    }
    
    
    /** Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta formatu honetan inprimatzen du:    
     *  "Futbolista{id=1, nombre=Asier, apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}"
     *  Hori lortzeko Futbolista klasean toString() metodoa birdefinitu beharko duzu.
     *  Gainera, Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu. 
     *  Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu bat) erabili dezakezu 
     *  partaide bat sortzen den bakoitzean handituko dena. 
     *  Amaitzeko, Villalibre entrenatzen hasiko da.
    */
    public static void futbolariBat(){
        Futbolista f1= new Futbolista(11, "del", ++azkenId, "Asier", "Villalibre", 23);
        System.out.println(f1);
        f1.entrenar();
     
    }
    
    /** Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak: 
     * - Javier Clemente
     * - Iñaki Sertxiberrieta
     * - Ander Etxeburu
     * Zein klaseko objektua izan behar du bakoitzak?
     * 
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu(){
        Entrenador e1= new Entrenador("euskal", ++azkenId, "Javier", "Clemente", 71);
        System.out.println(e1);
        e1.viajar();
        e1.concentrarse();
        Masajista m1= new Masajista("fisio", 21, ++azkenId, "Iñaki", "Sertxiberrieta", 54);
        System.out.println(m1);
        m1.viajar();
        m1.concentrarse();
        IntegranteSeleccion d1= new IntegranteSeleccion(++azkenId, "Iñaki", "Sertxiberrieta", 43);
        System.out.println(d1);
        d1.viajar();
        d1.concentrarse();
        
        
    }
    
    
    /** Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion klaseko 
     * ArrayList estatiko baten.
     *  
     */
    public static void selekzioOsoaSortu(){
       selekzioa.add(new Masajista("fisio", 21, ++azkenId, "Iñaki", "Sertxiberrieta", 54));
       selekzioa.add(new Entrenador("euskal", ++azkenId, "Javier", "Clemente", 71));
       selekzioa.add(new Futbolista(11, "del", ++azkenId, "Asier", "Villalibre", 23));
       selekzioa.add(new Futbolista(13, "del", ++azkenId, "Iker", "Porrero", 23));
       selekzioa.add(new IntegranteSeleccion(++azkenId, "Iñaki", "Sertxiberrieta", 43));
        System.out.println(selekzioa);
    }
    
    /** ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
     * 
     * @param id Ezabatu nahi den partaidearen ida
     * @return 
     */
    public static boolean partaideaEzabatu(int id){
        for (int i = 0; i < selekzioa.size(); i++) {
            if(selekzioa.get(i).getId()==id){
                selekzioa.remove(i);
                return true;
            }               
        }
        System.out.println("Sartu duzun jokalariaren id-a ez dago selekzioan.");
        return false;
    }
}
