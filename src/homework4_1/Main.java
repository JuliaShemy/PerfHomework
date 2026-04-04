package homework4_1;
/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */
public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(123456, 1000.00);
        CreditCard creditCard2 = new CreditCard(235467, 1500.00);
        CreditCard creditCard3 = new CreditCard(673421, 5000.00);
// тестовый сценарий
        creditCard1.addAmount(-100.00);
        creditCard2.addAmount(200.00);
        creditCard3.withdrawAmount(6300.00);

        creditCard1.infoCreditCard();
        creditCard2.infoCreditCard();
        creditCard3.infoCreditCard();
    }
}