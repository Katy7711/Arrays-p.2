public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        System.out.println("Сумма затрат за месяц составила " + sum);


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");



        double averageExpense = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей");


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int y = reverseFullName.length - 1; y >= 0; y--) {
            System.out.print(reverseFullName[y]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}









