/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;



import static exekutagarriak.EuskalSelekzioa.azkenId;

import static exekutagarriak.EuskalSelekzioa.selekzioa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import moodel.Entrenador;
import moodel.Futbolista;
import moodel.IntegranteSeleccion;
import moodel.Masajista;

/**
 * Programa honetan Euskal Selekzioaren datuekin egingo dugu lan. Iturria:
 * https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 * Programa hau selekzioko partaideen datuak kargatzen hasiko da. Normalena da,
 * datu hauek fitxategi edo datu-base batetik irakurtzea baina oraindik hori ez
 * dakigunez egiten guk programan bertan, metodo baten barruan idatziko ditugu.
 *
 * Gero, horrelako menu bat agertuko zaigu:
 *
 *  **********************************************************
 *  * EUSKAL SELEKZIOA * ---------------------------------- * 1. Partaideen
 * datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak:
 * 23 Entren...) * 2. Partaideen datuak ikusi taldekatuta * 3. Futbolariak
 * alfabetikoki inprimatu * 4. Aldaketa ( Sartu zaitez zu beste partaide baten
 * ordez. Horretarako ArrayList-en set metodoa erabiliz) * 5. Bilatu abizenetik
 * (String-en startsWith() metodoa erabiliz adibidez) * 6. Irten
 *
 *  * Aukeratu zenbaki bat:
 *
 *  **************************************************************
 */
public class EuskalSelekzioaMenua {

    public static int azkenId = 0;
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("    EUSKAL SELEKZIOA");
        System.out.println("------------------------------------");
        System.out.println("1. Partaideen datuak ikusi");
        System.out.println("2. Partaideen datuak ikusi taldekatuta");
        System.out.println("3. Futbolariak alfabetikoki inprimatu");
        System.out.println("4. Aldaketa");
        System.out.println("5. Bilatu abizenetik");
        System.out.println("6. Irten");
        System.out.println("");
        System.out.println("Aukeratu zenbaki bat: ");
        int aukera = in.nextInt();
        switch (aukera) {
            case 1: 
                selekzioOsoaSortu();
                break;
            case 2: 
                taldekatutaIkusi();
                break;
        }
        
    }
    public static void selekzioOsoaSortu(){
       selekzioa.add(new Masajista("fisio", 21, ++azkenId, "Iñaki", "Sertxiberrieta", 54));
       selekzioa.add(new Entrenador("euskal", ++azkenId, "Javier", "Clemente", 71));
       selekzioa.add(new Futbolista(11, "del", ++azkenId, "Asier", "Villalibre", 23));
       selekzioa.add(new Futbolista(13, "del", ++azkenId, "Iker", "Porrero", 23));
       selekzioa.add(new IntegranteSeleccion(++azkenId, "Iñaki", "Sertxiberrieta", 43));
       System.out.println(selekzioa);
    }
    public static void taldekatutaIkusi(){
        selekzioOsoaSortu();
        
        System.out.println("Futbolista:");
        System.out.println("===========================");
        for (int i = 0; i < selekzioa.size(); i++) {
            if (selekzioa.get(i) instanceof Futbolista) {
                System.out.println(selekzioa.get(i));
            }

        }
        System.out.println("\nEntrenador:");
        System.out.println("===========================");
        for (int i = 0; i < selekzioa.size(); i++) {
            if (selekzioa.get(i) instanceof Entrenador) {
                System.out.println(selekzioa.get(i));
            }

        }
        System.out.println("\nMasajista:");
        System.out.println("===========================");
        for (int i = 0; i < selekzioa.size(); i++) {
            if (selekzioa.get(i) instanceof Masajista) {
                System.out.println(selekzioa.get(i));
            }

        }
    }
    public static void aldaketa(){
        selekzioOsoaSortu();
        System.out.println("");
    }
//    public static void futbolariakAlfabetikoki(){
//        System.out.println("Futbolista:");
//        System.out.println("===========================");
//        ArrayList<IntegranteSeleccion> futbolariak = new ArrayList<>();
//        for (int i = 0; i < selekzioa.size(); i++) {
//            if (selekzioa.get(i) instanceof Futbolista) {
//                futbolariak.add(selekzioa.get(i));
//                futbolariak
//
//                System.out.println(futbolariak);
//            }
//
//        }
//    }
}
