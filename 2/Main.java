import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Object> combineAlternately(List<Object> list1, List<Object> list2) {
        List<Object> combinedList = new ArrayList<>();
        int size = Math.min(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {
            combinedList.add(list1.get(i));
            combinedList.add(list2.get(i));
        }

        // Add any remaining elements from the longer list
        if (list1.size() > size) {
            combinedList.addAll(list1.subList(size, list1.size()));
        } else if (list2.size() > size) {
            combinedList.addAll(list2.subList(size, list2.size()));
        }

        return combinedList;
    }

    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<Object> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        List<Object> combinedList = combineAlternately(list1, list2);
        System.out.println(combinedList);
    }
}
