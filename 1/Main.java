import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static String largestNumber(int[] nums) {

        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numStrs, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); 
            }
        });

        if (numStrs[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String numStr : numStrs) {
            sb.append(numStr);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {50, 2, 1, 9};
        String largestNumber = largestNumber(nums);
        System.out.println("The largest number: " + largestNumber);
        System.out.println(TypeOf(largestNumber));
    }
}
