
public class Zortzigarrena {
    public static void main(String[] args) {
        Langilea[] arraya=Langilea.nireHamarLagunLangile();
        Zatikia lanErdi= new Zatikia(1,2);
        arraya[0].setLanaldia(Zatikia.biderkatu(arraya[0].getLanaldia(),lanErdi));
        arraya[arraya.length-1].setLanaldia(Zatikia.biderkatu(arraya[arraya.length-1].getLanaldia(),lanErdi));
        double astekoOrduak=0;
        for(int i=0;i<arraya.length;i++){
           astekoOrduak+=35.0 *(arraya[i].getLanaldia().getZenbakitzailea())/arraya[i].getLanaldia().getIzendatzailea();
        }
        System.out.println("Hauek dira aste osoko enpresako lan orduak: "+astekoOrduak);
    }
}
 