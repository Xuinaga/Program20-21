package view;

import model.FKudeatu;
import model.Terminoa;

/**
 *
 * @author suinaga.jon
 */
public class JFrame {

    public static void main(String[] args) {

        FKudeatu.sortu();
        Terminoa t1 = FKudeatu.bilatu("Ikatza");
        if (t1 != null) {
            System.out.println(t1.toString());
        }
        Terminoa t2 = new Terminoa("Ilargia", "Luna");
        FKudeatu.gehitu(t2);
        Terminoa t3 = FKudeatu.bilatu("Ilargia");
        System.out.println("");
        if (t3 != null) {
            System.out.println(t3.toString());
        }
        System.out.println(FKudeatu.inprimatu());
    }
}
