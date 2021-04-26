/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;
import model.Bezeroa;
import model.Enpresa;
import model.Erosketa;
import model.Pertsona;
import model.Produktua;

/**
 *
 * @author Jon
 */
public class ErosketakKudeatu {

    private static ArrayList<Bezeroa> kontaktuak = new ArrayList<>();
    private static ArrayList<Produktua> produktuKatalogoa = new ArrayList<>();
    private static ArrayList<Erosketa> erosketenZerrenda = new ArrayList<>();

    public static void main(String[] args) {
        initialize();
        int aukera;
        while ((aukera = menuNagusiaErakutsi()) != 5) {

            switch (aukera) {
                case 1:
                    for (int i = 0; i < erosketenZerrenda.size() ; i++) {
                        System.out.println(erosketenZerrenda.get(i).toStringLuzea()); 
                    }
                    for (int i = 0; i < erosketenZerrenda.size() ; i++) {
                        System.out.println(erosketenZerrenda.get(i).toString()); 
                    }
                
                    create();
                    break;
                case 2:
                    recover();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                default:
                    System.out.println("1-5 bitarteko zenbaki bat sartu behar zenuen. ");
            }
        }

    }

    public static void initialize() {
        String[] emailUni={"idazkari@uni.eus","a"};
        kontaktuak.add(new Pertsona(1, "Karlos", "Arguiñano", "Hondartza Pasialekua z/g ZARAUTZ", "kargi@zarautz.eus"));
        kontaktuak.add(new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g. DONOSTIA", "mbera@donostia.eus"));
        kontaktuak.add(new Enpresa(3, "IES-UNI-Eibar", "UNI_EIBAR_ERMUA", "Otaola Hiribidea", emailUni));
        
        produktuKatalogoa.add(new Produktua("C01", "Toshiba Satellite Pro", 450));
        produktuKatalogoa.add(new Produktua("C02", "HP Pavilion", 600));
        produktuKatalogoa.add(new Produktua("T01", "Samsung Galaxy", 210));
        produktuKatalogoa.add(new Produktua("T02", "iPhone XX", 1300));

        ArrayList<Produktua> laugarrenErosketaProduktuak = new ArrayList<>();
        laugarrenErosketaProduktuak.add(produktuKatalogoa.get(0));
        laugarrenErosketaProduktuak.add(produktuKatalogoa.get(1));
        laugarrenErosketaProduktuak.add(produktuKatalogoa.get(2));

        ArrayList<Integer> laugarrenUnitateak = new ArrayList<>();
        laugarrenUnitateak.add(4);
        laugarrenUnitateak.add(2);
        laugarrenUnitateak.add(3);

        erosketenZerrenda.add(new Erosketa("E18-01", "2019-02-09", kontaktuak.get(1), laugarrenErosketaProduktuak, laugarrenUnitateak, 3630));

        ArrayList<Produktua> hirugarrenErosketaProduktuak = new ArrayList<>();
        hirugarrenErosketaProduktuak.add(produktuKatalogoa.get(0));

        ArrayList<Integer> hirugarrenUnitateak = new ArrayList<>();
        hirugarrenUnitateak.add(15);

        erosketenZerrenda.add(new Erosketa("E18-02", "2018-10-24", kontaktuak.get(0), hirugarrenErosketaProduktuak, hirugarrenUnitateak, 6750));

        ArrayList<Produktua> bigarrenErosketaProduktuak = new ArrayList<>();
        bigarrenErosketaProduktuak.add(produktuKatalogoa.get(0));
        bigarrenErosketaProduktuak.add(produktuKatalogoa.get(2));

        ArrayList<Integer> bigarrenUnitateak = new ArrayList<>();
        bigarrenUnitateak.add(1);
        bigarrenUnitateak.add(1);

        erosketenZerrenda.add(new Erosketa("E19-01", "2019-01-09", kontaktuak.get(0), bigarrenErosketaProduktuak, bigarrenUnitateak, 660));

        ArrayList<Produktua> lehenErosketaProduktuak = new ArrayList<>();
        lehenErosketaProduktuak.add(produktuKatalogoa.get(0));
        lehenErosketaProduktuak.add(produktuKatalogoa.get(1));
        lehenErosketaProduktuak.add(produktuKatalogoa.get(3));

        ArrayList<Integer> lehenUnitateak = new ArrayList<>();
        lehenUnitateak.add(3);
        lehenUnitateak.add(1);
        lehenUnitateak.add(1);

        //erosketenZerrenda.add(new EpekakoErosketa("E19-02", "09-02-2019", kontaktuak.get(0), 3250, 29.16));
        erosketenZerrenda.add(new Erosketa("E19-02", "2019-02-09", kontaktuak.get(0), lehenErosketaProduktuak, lehenUnitateak, 3250));

    }

    public static int menuNagusiaErakutsi() {
        Scanner in = new Scanner(System.in);
        int aukera = 0;

        System.out.println("        MENU NAGUSIA");
        System.out.println("-----------------------------");
        System.out.println("1.  Create (Datuak gehitu)");
        System.out.println("2.  Recover(Ikusi)");
        System.out.println("3.  Update(Eguneratu)");
        System.out.println("4.  Delete(Ezabatu)");
        System.out.println("5.  Irten");
        System.out.println("------------------------------");
        System.out.println("* Aukeratu zenbaki bat:");

        try {
            aukera = in.nextInt();
        } catch (Exception e) {
            aukera=0;
        }
        return aukera;
    }

    public static void create() {

    }

    public static void recover() {

    }

    public static void update() {

    }

    public static void delete() {

    }

//    public static int readMenuaErakutsi() {
//        return;
//    }
//
//    public static void erosketenZerrenda() {
//
//    }
//
//    public static double fakturazioOsoa() {
//        return;
//    }
//
//    public static Bezeroa bezerorikOnena() {
//        return;
//    }
    public static void helbideaBilatu() {

    }

    public static void epekakoErosketenTxostena() {

    }
}
