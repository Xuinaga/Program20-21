package model;


public class Account {
   private String id;
   private String name;
   private int balance =0;
   
   public Account(String id,String name){
       this.id=id;
       this.name=name;
   }
   public Account(String id,String name,int balance){
       this.id=id;
       this.name=name;
       this.balance=balance;
   }
   public String getId(){       
       return this.id;       
   }
   public String getName(){       
       return this.name;       
   }
   public int getBalance(){       
       return this.balance;       
   }
   public void setName(String newName){
       this.name=newName;
   }
   @Override
   public String toString() {
       return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
   }
   public int credit(int amount) {
        return balance=balance+amount;
    }

    public int debit(int amount) {
        if (amount<=balance) {
            balance=balance-amount;
        } else {
            System.out.println("amount exceeded");
        }
        return balance;
    }
   public int transferTo(Account another, int amount) {
        if (amount<=this.balance){
            this.balance=this.balance-amount;
            another.balance=another.balance+amount;
        } else {
            System.out.println("amount exceeded");
        }
        return this.balance;
    }
}
