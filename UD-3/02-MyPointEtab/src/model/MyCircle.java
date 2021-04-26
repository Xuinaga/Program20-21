package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suinaga.jon
 */
public class MyCircle {
    private MyPoint center= new MyPoint(0,0);
    private int radius=1;
    
    public MyCircle(){
       
    }
    public MyCircle(int x, int y, int radius){
       MyPoint zentrua= new MyPoint(x,y);
       this.center=zentrua;
       this.radius=radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center=center;
        this.radius=radius;
    }
    public double distance(MyCircle another){
         return Math.sqrt(Math.pow(this.center.getX() - center.getX(), 2) + Math.pow(this.center.getY() - center.getY(), 2));
    }
    public boolean isInside(MyPoint barrukoPuntua){
       if (this.center.distance(barrukoPuntua)<=this.radius){
           return true;
       }else{
           return false;
       }                        
    }   
    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }
    public int getCenterX() {
        return this.center.getX();
    }
    public int getCenterY() {
        return this.center.getY();
    }
    public int[] getCenterXY(){
        int[] XY = new int[]{this.center.getX(),this.center.getY()};
        return XY;
    }
    public double getCircunference(){
        return Math.PI*this.radius*2;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public void setCenterX(int x){
        this.center.setX(x);
    } 
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public void setCenterXY(int x,int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
    }
    
}
