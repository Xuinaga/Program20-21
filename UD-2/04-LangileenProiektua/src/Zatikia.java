public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;
    
    public Zatikia() { 
      zenbakitzailea = 1;
      izendatzailea = 4;      
   }
     public Zatikia(int zenb,int izen) {                  
      zenbakitzailea = zenb;
      izendatzailea = izen;
   }
     public int getZenbakitzailea(){
    return zenbakitzailea;
   }
     public int getIzendatzailea(){
        return izendatzailea;
   }
     public void setZenbakitzailea(int zenbBerria){
        zenbakitzailea=zenbBerria;
    }
    public void setIzendatzailea(int izenBerria){
        izendatzailea=izenBerria;
    }
    @Override
    public String toString(){
        //return getClass().getName()+"["+zabalera+"x"+altuera+"]";
        return "Zatikia["+zenbakitzailea+"/"+izendatzailea+"]";
    }
   
    public static Zatikia biderkatu(Zatikia zatiki1, Zatikia zatiki2){
        Zatikia biderketa=new Zatikia(zatiki1.zenbakitzailea*zatiki2.zenbakitzailea,zatiki1.izendatzailea*zatiki2.izendatzailea);
        return biderketa;
        
    }
    public static Zatikia batu(Zatikia zat1, Zatikia zat2){
        
        int zkh=0;
        int mkt;
        
        if (zat1.izendatzailea<=zat2.izendatzailea){
		for (int i=1; i <=zat1.izendatzailea ; i++) {
			if ((zat1.izendatzailea % i  == 0) && (zat2.izendatzailea % i  == 0)) {
			zkh = i;
			}
		}
	} else {
		for (int i=1; i <=zat2.izendatzailea ; i++) {
			if ((zat1.izendatzailea % i  == 0) && (zat2.izendatzailea % i  == 0)) {
			zkh = i;
			}
		}
	}
	mkt=(zat1.izendatzailea*zat2.izendatzailea)/zkh;
        Zatikia batu=new Zatikia((zat1.zenbakitzailea*(mkt/zat1.izendatzailea))+(zat2.zenbakitzailea*(mkt/zat2.izendatzailea)),mkt);
        return batu;
        
    }
    public int mkt(Zatikia zat1, Zatikia zat2){
        int zkh=0;
        int mkt;
        
        if (zat1.izendatzailea<=zat2.izendatzailea){
		for (int i=1; i <=zat1.izendatzailea ; i++) {
			if ((zat1.izendatzailea % i  == 0) && (zat2.izendatzailea % i  == 0)) {
			zkh = i;
			}
		}
	} else {
		for (int i=1; i <=zat2.izendatzailea ; i++) {
			if ((zat1.izendatzailea % i  == 0) && (zat2.izendatzailea % i  == 0)) {
			zkh = i;
			}
		}
	}
	mkt=(zat1.izendatzailea*zat2.izendatzailea)/zkh;
        return mkt;
    }
    public double hamartarBaliokidea(){
        return (double)this.zenbakitzailea/this.izendatzailea;
    }
   
}

