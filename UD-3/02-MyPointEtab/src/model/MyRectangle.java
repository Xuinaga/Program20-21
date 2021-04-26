package model;


public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;
    
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft=topLeft;
        this.bottomRight=bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }
    public double getAzalera(){
        double altuera,zabalera;
        if(this.topLeft.getY() > this.bottomRight.getY()){
            altuera=this.topLeft.getY()-this.bottomRight.getY(); 
        }else{
            altuera=this.bottomRight.getY()-this.topLeft.getY();
        }

        if(this.topLeft.getX()>this.bottomRight.getX()){
             zabalera=this.topLeft.getX()-this.bottomRight.getX();
        }else{
             zabalera=this.bottomRight.getX()-this.topLeft.getX();
        }
         return zabalera*altuera;
    }
    public double getPerimetroa(){
        double altuera,zabalera;
        if(this.topLeft.getY() > this.bottomRight.getY()){
            altuera=this.topLeft.getY()-this.bottomRight.getY(); 
        }else{
            altuera=this.bottomRight.getY()-this.topLeft.getY();
        }

        if(this.topLeft.getX()>this.bottomRight.getX()){
             zabalera=this.topLeft.getX()-this.bottomRight.getX();
        }else{
             zabalera=this.bottomRight.getX()-this.topLeft.getX();
        }
         return 2*(zabalera+altuera);
    }

    @Override
    public String toString() {
        return "Rectangle{" + topLeft + ", " + bottomRight + '}';
    }
    
    
}
