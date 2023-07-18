import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> fibonacciSequence(int n) {
        List<Integer> fibList = new ArrayList<>();
        fibList.add(0);
        fibList.add(1);

        while (fibList.size() < n) {
            int nextNum = fibList.get(fibList.size() - 1) + fibList.get(fibList.size() - 2);
            fibList.add(nextNum);
        }

        return fibList;
    }

    public static void main(String[] args) {
    
        List<Integer> first100Fibonacci = fibonacciSequence(100);
        System.out.println(first100Fibonacci);
    }
}


