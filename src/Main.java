import javax.management.RuntimeErrorException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {

    public static Map<String, Integer> lapTop = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Hi");

        Methods laptop1 = new Methods("Lenovo", 30);
        Methods laptop2 = new Methods("Dell", 45);
        Methods laptop3 = new Methods("Asus", 38);
        Methods laptop4 = new Methods("Acer", 31);
        Methods laptop5 = new Methods("MacBook", 180);


        add("Lenovo", 30);
        add("Dell", 45);

        System.out.println(lapTop);
//        System.out.println(lapTop);

//        lapTop.put("Lenovo", 30);
//        lapTop.put("Dell", 45);
//        lapTop.put("Asus", 38);
//        lapTop.put("Acer", 31);
//        lapTop.put("MacBook", 180);

    }

    public static void add(String string, Integer integer) {
        if (Objects.equals(lapTop.put(string, integer), integer)) {
            throw new UnsupportedOperationException("Введите значения");
        }
    }

//    public  Map<String, Integer> addParameters(Methods cart) {
//        Map<String, Integer> map = new HashMap<>();
//        if (!map.containsKey(this)) {
//            map.put(cart.getLaptopName(), cart.getCost());
//        } else if (map.containsKey(cart.getLaptopName()) && map.containsValue(cart.getCost())) {
//            throw new UnsupportedOperationException("Такой ноутбук уже есть в списке");
//        } else if (map.containsKey(this) && !map.containsValue(this)) {
//            map.put(this.laptopName, cart.getCost());
//        }
//        return getMap();
////        Map<String, Integer> map = new HashMap<>();
////        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if (entry.getKey() == laptopName && entry.getValue() == cost) {
//                throw new UnsupportedOperationException("Такой ноутбук уже есть в списке");
//            } else if (entry.getKey() == laptopName && entry.getValue() != cost) {
//                return entry.setValue(cost);
//            } else if (entry.getKey() == null) {
//                return map.put(entry.getKey(), entry.getValue());
//            }
//
//        }
    }

//    public static String check(Map<String, Integer> map) {
//
//
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            for (String string : map.keySet()) {
//                if (entry.getKey() != string) {
//                    map.put(entry.getKey(), entry.getValue());
//                } else if (entry.getKey() == string && entry.getValue() == map.containsValue()) {
//
//                }
//            }
//        }
//    }

