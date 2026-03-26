
     abstract class Bankaccount {
    private String accountholder;
    private double balance;


    public double getBalance() {
       return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String getAccountholder(){
        return accountholder;
    }
    public void setAccountholder(String accountholder){
            this.accountholder = accountholder;
    }
    //constructor
    public Bankaccount(String accountholder,double balance){
        this.accountholder=accountholder;
        this.balance=balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += balance;
        }
    }
    public void withdraw( double balance,double amount) {
        if (amount <= balance) {
            this.balance += balance;
        }else{
            System.out.println("Insaficient balance");
        }
    }
    abstract public void withdraw(double amount);
}

//child class
 class savingaccount extends Bankaccount{
    public savingaccount(String accountholder,double balance){
        super(accountholder,balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount<= getBalance()){
            setBalance(getBalance()-amount);
            System.out.println("Withdraw successfully");
        }else{
            System.out.println("Insuficient amount");
        }
    }
}
public class BankProject {

    public static void main(String[] args) {
    Bankaccount bankaccount = new savingaccount("Ram", 100000);
     System.out.println("Saving accounts");
     System.out.println(bankaccount.getAccountholder());
     System.out.println(bankaccount.getBalance());
     bankaccount.deposit(100000);
     bankaccount.withdraw(500);
     System.out.println(bankaccount.getBalance());

    }
}

    

