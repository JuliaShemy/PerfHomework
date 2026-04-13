package homework8_3;

import java.util.HashMap;
import java.util.Map;

public class StringCollection {
    public static Map<String, Boolean> stringChecking(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();//создаем MAP
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            if (map.containsKey(word)) {//есть ли такой ключ(word) в map, если это слово уже было, то TRUE
                map.put(word, true);//добавляем элемент в map
            } else {
                map.put(word, false);//если нет то FALSE
            }
        }
        return map;
    }
}