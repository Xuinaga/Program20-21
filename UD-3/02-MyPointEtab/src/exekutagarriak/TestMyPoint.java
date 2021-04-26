package exekutagarriak;


import model.MyPoint;
import java.util.ArrayList;
import java.util.Scanner;


public class TestMyPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
            System.out.println(points[i]);
        }
        MyPoint p0 = new MyPoint(0, 0);
        MyPoint p1 = new MyPoint(2, 1);
        MyPoint p2 = new MyPoint(4, 0);

        System.out.println("p0-tik kordenatu jatorrira dagoen distantzia: " + p0.distance());
        System.out.println("p1-tik kordenatu jatorrira dagoen distantzia:" + p1.distance());
        System.out.println("p2-tik kordenatu jatorrira dagoen distantzia:" + p2.distance());
        
//        ArrayList<MyPoint> puxtarriak = new ArrayList<MyPoint>();
//        for (int i=0;i<3;i++){
//           System.out.println("Sartu puntu bat: ");
//           MyPoint puxtarri=new MyPoint(sc.nextInt(),sc.nextInt());
//           puxtarriak.add(puxtarri);
//           System.out.println(puxtarriak);
//        }
        ArrayList<MyPoint> puxtarriRandom = new ArrayList<MyPoint>();
        for (int i = 0; i < 5; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            MyPoint iritzira = new MyPoint(x, y);
            puxtarriRandom.add(iritzira);
            System.out.println(puxtarriRandom);
        }
        MyPoint.grafiko(puxtarriRandom);
        
        
    }

    

   
                
}
       
            

        

    

