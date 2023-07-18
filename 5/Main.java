public class Main {

    public static void generateExpressions(int num, int sumSoFar, int lastNumber, String expression) {
        if (num > 9) {
            if (sumSoFar + lastNumber == 100) {
                System.out.println(expression + " = 100");
            }
            return;
        }

        generateExpressions(num + 1, sumSoFar + lastNumber, num, expression + " + " + num);
        generateExpressions(num + 1, sumSoFar + lastNumber, -num, expression + " - " + num);
        generateExpressions(num + 1, sumSoFar, lastNumber * 10 + (lastNumber > 0 ? num : -num), expression + num);
    }

    public static void main(String[] args) {
        generateExpressions(1, 0, 0, "1");
    }
}
