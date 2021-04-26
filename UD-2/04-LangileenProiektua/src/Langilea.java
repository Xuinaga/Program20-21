
public class Langilea {
   private int id;
   private String izena;
   private String abizena;
   private double soldata;
   private Zatikia lanaldia= new Zatikia(1,1);
   
   Langilea(int id,String izena,String abizena,double soldata){
    this.id=id;
    this.izena=izena;
    this.abizena=abizena;
    this.soldata=soldata;
    }
   public int getId(){       
       return this.id;       
   }
   public String getIzena(){
       return this.izena;
   }
    public String getAbizena() {
        return abizena;
    }
    public double getSoldata() {
        return soldata;
    }
    public String getIzenOsoa(){
        return izena+" "+abizena;
    }
    public double getUrtekoSoldata(){
        return soldata*12;
    }
    public Zatikia getLanaldia() {
        return lanaldia;
    }
    public void setLanaldia(Zatikia lanaldia) {
        
        if(lanaldia.getZenbakitzailea() < lanaldia.getIzendatzailea() && lanaldia.getZenbakitzailea() > 0 && lanaldia.getIzendatzailea() > 0){
            this.lanaldia = lanaldia;
        }
    }
    public void setSoldata(double soldata){
        this.soldata=soldata;
    }
    public double soldataIgo(double portzentaia){
        
        return (this.soldata*portzentaia/100)+this.soldata;
    }
    @Override
    public String toString(){
        return "Langilea[id= "+id+" izena= "+this.getIzenOsoa()+" soldata= "+soldata+"]";
    }
    public static Langilea[] nireHamarLagunLangile(){
        Langilea[] langileak = new Langilea[10];
        langileak[0] = new Langilea(0, "Iker", "Romero", 50);
        langileak[1] = new Langilea(1, "Jon", "Suinaga", 150);
        langileak[2] = new Langilea(2, "Jon", "Zengo", 75);
        langileak[3] = new Langilea(3, "Benito", "Lertxundi", 100);
        langileak[4] = new Langilea(4, "Markel", "Uribe", 150);
        langileak[5] = new Langilea(5, "Laura", "Peralta", 200);
        langileak[6] = new Langilea(6, "Asier", "Moneo", 500);
        langileak[7] = new Langilea(7, "Maitane", "Gallastegi", 300.65);
        langileak[8] = new Langilea(8, "Alex", "Moreno", 250);
        langileak[9] = new Langilea(9, "Andres", "Disapeared", 400);
        
        return langileak;
    }
    public static Langilea bilatu(String izena,Langilea[]langileak){
        for(int i=0;i<langileak.length;i++){
            if(langileak[i].getIzena().toLowerCase().equals(izena.toLowerCase())){
                return langileak[i];
            }
        }
        return null;
    }
    public static Langilea bilatu(Langilea[]langileak,String objetua,String bilatu){
        if(bilatu.toLowerCase().equals("izena") || bilatu.toLowerCase().equals("abizena")){
            for(int i = 0; i<langileak.length;i++){
                if(objetua.equals(langileak[i].getIzena())||objetua.equals(langileak[i].getAbizena())){
                    return langileak[i];
                }
            }
            
        }else if(bilatu.toLowerCase().equals("id") || bilatu.toLowerCase().equals("soldata")){
            for(int i = 0; i<langileak.length;i++){
                if(Integer.valueOf(objetua).equals(langileak[i].getId())||Double.valueOf(objetua).equals(langileak[i].getSoldata())){
                    return langileak[i];
                }
            }
        }
        return null;
    }
    
    
}