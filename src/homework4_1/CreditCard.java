package homework4_1;

public class CreditCard {
    int numberCheck;
    double balance;

    public CreditCard(int numberCheck, double balance) {
        this.numberCheck = numberCheck;
        this.balance = balance;
    }
    public double addAmount(double a) {
        return balance += a;
    }
    public double reduceAmount(double b) {
        return balance -= b;
    }
    public void infoCreditCard() {
        System.out.println("Баланс крты с номером " + numberCheck + " равен " + balance);
    }
}
