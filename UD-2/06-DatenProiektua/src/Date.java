
public class Date {
   
   private int year;
   private int month;
   private int day;
   private String[][] hilabeteak= {{"urtarrila", "otsaila", "martxoa", "apirila", "maiatza", "ekaina", "uztaila", "abuztua", "iraila", "urria", "azaroa", "abendua"},
                                    {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"},
                                    {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"}};
   
   public Date(int year, int month, int day) {
      
      this.year = year;
      this.month = month;
      this.day = day;
   }

   
   public int getYear() {
      return this.year;
   }
   public int getMonth() {
      return this.month;
   }
   public int getDay() {
                  
       
      return this.day;
   }
   public void setYear(int year) {
       if(year >= 0)
      this.year = year;  
   }
   public void setMonth(int month) {
        if(month > 0 && month <= 12)
            this.month = month;  
   }
   public void setDay(int day) {
      this.day = day; 
      switch(this.month){ 
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
               if(day > 0 && day <= 31){
                   this.day = day;
               }
               break;
            case 4: case 6: case 9: case 11:
               if(day > 0 && day <= 30){
                   this.day = day;
               }
               break;
            case 2:
               if(day > 0 && day <= 28){
                   this.day = day;
               }
               break;
            default:
                System.out.println("Zenbaki okerra sartu duzu.");
                break;
      }    
   }

   @Override
   
   public String toString() {
        
        return String.format("%4d/%02d/%02d", year, month, day);
              
   }

   
   public void setDate(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }
   
   public String getHilabeteaLetretan( ){
       return hilabeteak[0][this.month-1];
   }
   
   public String getHilabeteaLetretan(String hizkuntza){
       
       switch(hizkuntza.toLowerCase()){
           case "eu":
               return hilabeteak[0][this.month-1];
           case "es":
               return hilabeteak[1][this.month-1];
           case "en":
               return hilabeteak[2][this.month-1];
           default:
               return "Wrong value";
       }
   }
}