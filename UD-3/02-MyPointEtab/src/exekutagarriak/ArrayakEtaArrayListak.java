
package exekutagarriak;

import model.MyTriangle;
import model.MyPoint;

import java.util.ArrayList;
import java.util.Arrays;
import model.MyRectangle;

/**
 *
 * @author suinaga.jon
 */
public class ArrayakEtaArrayListak {
    public static void main(String[] args) {
        ArrayList<MyTriangle> triangeluLista = new ArrayList<MyTriangle>();
        MyTriangle t1= new MyTriangle(new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)),new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)),new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)));
        MyTriangle t2= new MyTriangle(new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)),new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)),new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)));
        MyTriangle t3= new MyTriangle(new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)),new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)),new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)));
     
        triangeluLista.add(t1); 
        triangeluLista.add(t2);
        triangeluLista.add(t3);
        System.out.println(triangeluLista);
        
        MyRectangle[] karratuak = new MyRectangle[3];
        MyRectangle r1= new MyRectangle (new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)),new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)));
        MyRectangle r2= new MyRectangle (new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)),new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)));
        MyRectangle r3= new MyRectangle (new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)),new MyPoint((int)(Math.random() * 10), (int)(Math.random() * 10)));
        karratuak[0]=r1;
        karratuak[1]=r2;
        karratuak[2]=r3;
        System.out.println(Arrays.toString(karratuak));
    }
    
}
