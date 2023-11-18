// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minWastes = 200_000;
        int maxWastes = 0;
        for (int i : arr) {
            if (minWastes > i) {
                minWastes = i;
            }
            if (maxWastes < i) {
                maxWastes = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWastes + " рублей. Максимальная сумма трат за день составила " + maxWastes + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        float midWastes = total / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + midWastes + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int total = 0;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }




}