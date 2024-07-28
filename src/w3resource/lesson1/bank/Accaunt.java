package w3resource.lesson1.bank;

public class Accaunt {
    private int inMoney;
    private int onMoney;

    public Accaunt() {
    }

    public Accaunt(int inMoney, int onMoney) {
        this.inMoney = inMoney;
        this.onMoney = onMoney;
    }

    public int getInMoney() {
        return inMoney;
    }

    public void setInMoney(int inMoney) {
        this.inMoney = inMoney;
    }

    public int getOnMoney() {
        return onMoney;
    }

    public void setOnMoney(int onMoney) {
        this.onMoney = onMoney;
    }
}
