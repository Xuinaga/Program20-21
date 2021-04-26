/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suinaga.jon
 */
public class Laukia {
    private int altuera;
    private int zabalera;
    public Laukia() {                   // 1st Constructor (default constructor)
      altuera = 5;
      zabalera = 5;
   }
    public Laukia(int zab,int alt) {                   // 1st Constructor (default constructor)
      altuera = alt;
      zabalera = zab;
   }
    public int getZabalera(){
    return zabalera;
}
    public int getAltuera(){
        return altuera;
    }
    public int getAzalera(){
        return altuera*zabalera;
    }
    public int getPerimetroa(){
        return 2*altuera+2*zabalera;
    }
    public void setZabalera(int zabaleraBerria){
        zabalera=zabaleraBerria;
    }
    public void setAltuera(int altueraBerria){
        altuera=altueraBerria;
    }
    @Override
    public String toString(){
        //return getClass().getName()+"["+zabalera+"x"+altuera+"]";
        return "Laukia["+zabalera+"x"+altuera+"]";
    }
    public String getmota(){
        String mota;
        if(zabalera==altuera){
            mota="karratua";
        }else if(zabalera>altuera){
            mota="horizontala";
        }else{
            mota="bertikala";
        }
        return mota;
    }
    public void marraztuHutsik(int zabalera,int altuera){
        for(int i=0;i<altuera;i++){
            for(int j=0;j<zabalera;j++){
                if(i==0||i==altuera-1||j==0||j==zabalera-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }
    public void marraztuBeteta(int zabalera,int altuera){
        for(int i=0;i<altuera;i++){
            for(int j=0;j<zabalera;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

