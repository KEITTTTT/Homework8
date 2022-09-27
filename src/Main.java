public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int[] arr = {100000, 105000, 110000, 115000, 120000, 125000, 130000, 135000, 140000, 145000, 150000, 155000, 160000, 165000, 170000, 175000, 180000, 185000, 190000, 195000, 107000, 112000, 122000, 134000, 148000, 156000, 164000, 118000, 187000, 111000};
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i] + " ");
            }

        }
        // Задача 1
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей ");


        // Задача 2
        int min = 201000;
        for (int i = 0; i < arr.length && arr[i] < min; i++) {
            if (arr [i] < min) {
                min = arr[i];
            }
        }
        int max = 0;
        for (int a = 0; a < arr.length && arr[a] > max; a++) {
            if (arr [a] > max) {
                max = arr[a];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " + "Максимальная сумма трат за день составила " + max + "рублей ");
    }

    public static void task2() {
        double[] arr = {100000, 105000, 110000, 115000, 120000, 125000, 130000, 135000, 140000, 145000, 150000, 155000, 160000, 165000, 170000, 175000, 180000, 185000, 190000, 195000, 107000, 112000, 122000, 134000, 148000, 156000, 164000, 118000, 187000, 111000};
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i] + " ");
            }
        }
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i] / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + "рублей ");
    }


    public static void task3() {
        // Задаие 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i = i - 1) {
            System.out.print(reverseFullName[i] + " ");
        }

    }
}


