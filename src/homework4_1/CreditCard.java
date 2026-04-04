package homework4_1;

public class CreditCard {
    int cardNumber;
    double balance;

    public CreditCard(int numberCheck, double balance) {
        this.cardNumber = numberCheck;
        this.balance = balance;
    }
    public double addAmount(double amount) {
        if (amount <= 0){
            System.out.println("Сумма внесения должна быть больше 0");
            return  balance;
        }
       balance = balance + amount;
        return balance;
    }
    public double withdrawAmount(double amount) {
        if (amount<=0){
            System.out.println("Сумма снятия должна быть больше 0");
            return balance;
        }
        if (amount>balance){
            System.out.println("Недостаточно средств на карте " + cardNumber);
            return balance;
        }
        balance = balance - amount;
        return balance;
    }
    public void infoCreditCard() {
        System.out.println("Баланс карты с номером " + cardNumber + " равен " + balance);
    }
}
