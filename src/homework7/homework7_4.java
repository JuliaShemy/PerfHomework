package homework7;

/*
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
 */
public class homework7_4 {
    public static String findFirstUniqueWord(String str1, String str2, String str3) {
        if (checkForUnique(str1)) {
            System.out.println("Первая строка состоящая только из различных символов:" + str1);
            return str1;
        }
        if (checkForUnique(str2)) {
            System.out.println("Первая строка состоящая только из различных символов:" + str2);
            return str2;
        }
        if (checkForUnique(str3)) {
            System.out.println("Первая строка состоящая только из различных символов:" + str3);
            return str3;
        }
        return "Нет слова состоящего только из различных символов";
    }

    //проверяем символы на уникальность, если символы разные возвращаем true
    private static boolean checkForUnique(String word) {
        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);
            for (int j = i + 1; j < word.length(); j++) {
                if (symbol == word.charAt(j)) { //если одинаковые, то false
                    return false;
                }
            }
        }
        return true;
    }
}