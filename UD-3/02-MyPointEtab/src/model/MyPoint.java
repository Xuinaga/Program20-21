package model;


import java.util.ArrayList;


public class MyPoint {
    private int x;
    private int y;
    
    public MyPoint(){
       this(0,0); 
    }
    public MyPoint(int x, int y){
       this.x=x;
       this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int[] getXY(){
        int[]puntua= new int[2];
        puntua[0]=this.x;
        puntua[1]=this.y;
        return puntua;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
    
    public double distance(MyPoint another){
        return Math.sqrt(Math.pow(another.getX() - x, 2) + Math.pow(another.getY() - y, 2));
    }
    
    public double distance(int x, int y){
        return distance(new MyPoint(x, y));
    }

    @Override
    public String toString() {
        return "{" + x + "," + y + "}";
    }
    public static void grafiko(ArrayList<MyPoint> puxtarriRandom){
        for (int i = 10; i >= -1; i--) {
            System.out.print("|");
                
            for (int j = 0; j < 10; j++) {          
                if(i==0){
                    System.out.print("¯|");
                }
                if(i==-1){
                    System.out.print(" "+j);
                }
                boolean marraztuta=false;
                for (int k = 0; k < puxtarriRandom.size(); k++) {
                    if(j==puxtarriRandom.get(k).getX()&& i==puxtarriRandom.get(k).getY()){
                        System.out.print("*");   
                        marraztuta=true;
                    }else{
                        marraztuta=false;
                        
                    }
                    
                }
                if (marraztuta==false){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
