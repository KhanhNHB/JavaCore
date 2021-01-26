import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        Map<String, String> englishToViewnamese = new HashMap<String, String>();

        englishToViewnamese.put("Monday", "Thứ 2");
        englishToViewnamese.put("Tuesday", "Thứ 3");
        englishToViewnamese.put("Wednesday", "Thứ 4");
        englishToViewnamese.put("Thirsday", "Thứ 5");
        englishToViewnamese.put("Friday", "Thứ 6");
        englishToViewnamese.put("Saturday", "Thứ 7");
        englishToViewnamese.put("Sunday", "Chủ nhật");

        Map<String, Integer> books = new HashMap<String, Integer>();
        books.put("Khanh", 123);
        books.put("Giau", 234);
        books.put("Han", 456);

        try {
            int value = books.get("aaa");
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("Not found");
        }
    }
}