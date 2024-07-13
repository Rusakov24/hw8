import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1,2");
        int[] numbers = new int[12];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i % 3) + 1;
        }
        double[] fractions = {1.57, 7.654, 9.986};

        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

        System.out.println("Целочисленный массив в прямом порядке:");
        printArray(numbers);

        System.out.println("Массив с дробными числами в прямом порядке:");
        printArray(fractions);

        System.out.println("Массив строк в прямом порядке:");
        printArray(fruits);

        System.out.println("\nЗадание 3");
        System.out.println("Целочисленный массив в обратном порядке:");
        printArrayReverse(numbers);

        System.out.println("Массив с дробными числами в обратном порядке:");
        printArrayReverse(fractions);

        System.out.println("Массив строк в обратном порядке:");
        printArrayReverse(fruits);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void printArrayReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void printArrayReverse(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void printArrayReverse(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("\nЗадание 4");
        int[] arr = {0,1,2,3,4,5,6,7,8,9 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
