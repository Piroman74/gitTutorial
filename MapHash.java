package Map;

import java.util.HashMap;
import java.util.Map;

public class MapHash {
    public static void main(String[] args) {
        // Ключ может быть и стринг либой другой тип данных
        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(2121, "Славик");
        hmap.put(2122, "Димон");
        hmap.put(2123, "Валёк");
        hmap.put(2124, "Игорёк");
        //putIfAbsent - добавляет в коллекцию если такого ключа нет. Если есть то ничего не происходит./////////////////
        hmap.putIfAbsent(2121, "Семён");
        System.out.println(hmap);
        //get - выводит по ключу, если такого ключа нет, то null////////////////////////////////////////////////////////
        System.out.println(hmap.get(2122));
        System.out.println(hmap.get(24242));
        //containsValue - возвращает тру или фолз если найдено соответсвие//////////////////////////////////////////////
        System.out.println(hmap.containsValue("Валёк"));
        System.out.println(hmap.containsValue("Малёк"));
        //containsKey - возвращает уже по ключу/////////////////////////////////////////////////////////////////////////
        System.out.println(hmap.containsKey(2124));
        System.out.println(hmap.containsKey(5454));
        //keySet - множество ключей/////////////////////////////////////////////////////////////////////////////////////
        System.out.println(hmap.keySet());
        //values - множество значений///////////////////////////////////////////////////////////////////////////////////
        System.out.println(hmap.values());


    }
}
