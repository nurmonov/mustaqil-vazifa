package w3resource.lesson1.bank;

public class Bank {
    private String name;
    private  String accountNumber;
    private int balans=0;


    public Bank(String name, String accountNumber, int balans) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balans = balans;
    }

    public Bank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalans() {
        return balans;
    }

    public void setBalans(int balans) {
        this.balans = balans;
    }
    public int quwiw(int inMoney){
        return balans+=inMoney;
    }
    public int oliw(int onMoney){
        return balans-=onMoney;
    }
    public void print(){
        System.out.println("name: "+name+"\naccauntNumber: "+accountNumber+"\n balans: "+balans);
    }


}
