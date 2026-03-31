package homework4_2;

public class CashDispenser {
    int denomination20;
    int denomination50;
    int denomination100;

    public CashDispenser(int denomination20, int denomination50, int denomination100) {
        this.denomination20 = denomination20;
        this.denomination50 = denomination50;
        this.denomination100 = denomination100;
    }
    // добавляем деньги
    public void addDenomination(int add20, int add50, int add100) {
        denomination20 += add20;
        denomination50 += add50;
        denomination100 += add100;
        System.out.println("Внесено: ");
        System.out.println("Купюры номиналом 100: " + add100);
        System.out.println("Купюры номиналом 50: " + add50);
        System.out.println(("Купюры номиналом 20: " + add20));
    }
    // снимаем деньги
    public boolean withdrawMoney(int amount) {

        int a = amount;
        int withdraw100 = a / 100; //сколько раз можно снять по 100
        if (withdraw100 > denomination100) { //если нужно снять больше,чем есть,снимаем сколько есть
            withdraw100 = denomination100;
        }
        a = a - withdraw100 * 100; //уменьшаем остаток суммы

        int withdraw50 = a / 50;
        if (withdraw50 > denomination50) {
            withdraw50 = denomination50;
        }
        a = a - withdraw50 * 50;

        int withdraw20 = a / 20;
        if (withdraw20 > denomination20) {
            withdraw20 = denomination20;
        }
        a = a - withdraw20 * 20;

        if (a != 0) {
            System.out.println("Невозможно выдать сумму: " + amount);
            return false;
        }
        System.out.println("Выдано:");
        System.out.println("Купюры номиналом 100: " + withdraw100);
        System.out.println("Купюры номиналом 50: " + withdraw50);
        System.out.println("Купюры номиналом 20: " + withdraw20);
        denomination100 = denomination100 - withdraw100;
        denomination50 = denomination50 - withdraw50;
        denomination20 = denomination20 - withdraw20;
        return true;
    }
}