import java.util.Random;

public class Main {

    private static void printArray(int[] array) {
        for (int unit : array) {
            System.out.print(unit + "\t\t");
        }
        System.out.println();
    }

    //    Swap elements in array
    private static void swap(int[] array, int x, int y) {
        int tmp = array[y];
        array[y] = array[x];
        array[x] = tmp;
    }

    //    Create array by N size, and print in descending order
    private static int[] createArrayInDescendingOrder(int size) {
        int newArray[] = new int[size];
        int counter = 0;
        for (int i = newArray.length - 1; i >= 0; i--) {
            newArray[counter] = i;
            counter++;
        }
        printArray(newArray);
        return newArray;
    }

    //    Create array by N size, from 0 to N-1
    private static int[] newArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        printArray(newArray);
        return newArray;
    }

    //    create array by N size with random value from X to Y
    private static int[] randomArray(int size, int randomFrom, int randomTo) {
        int[] newArray = new int[size];
        Random randomGenerator = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = randomGenerator.nextInt(randomTo - randomFrom + 1) + randomFrom;
        }
        printArray(newArray);
        return newArray;
    }

    //    Sum elements of arrays with same length
    private static int[] sumArraysSameLength(int[] array1, int[] array2) {
        int array1Length = array1.length;
        int array2Length = array2.length;
        int[] resultArray = new int[array1Length];
        if (array1Length != array2Length) {
            System.out.println("Length of arrays is different");
            return new int[]{0};
        }
        for (int i = 0; i < array1Length; i++) {
            resultArray[i] = array1[i] + array2[i];
        }
        printArray(resultArray);
        return resultArray;
    }

    public static void main(String[] args) {

        int[] array1 = new int[]{21, 3, 2, 43, 5, 76, 89, 100, 1, -8};

        int[] array2 = new int[]{0,2,5,8,9};
        int[] array3 = new int[]{1,7,9,-95,13};

        System.out.println("\nTest for method - printArray");
        printArray(array1);

        System.out.println("\nTest for method - swap");
        swap(array1, 1, 5);
        printArray(array1);
        swap(array1, 0, 9);
        printArray(array1);

        System.out.println("\nTest for method - createArrayInDescendingOrder");
        createArrayInDescendingOrder(10);
        createArrayInDescendingOrder(21);
        createArrayInDescendingOrder(5);

        System.out.println("\nTest for method - newArray");
        newArray(15);
        newArray(8);

        System.out.println("\nTest for method - randomArray");
        randomArray(100, 0, 1);
        randomArray(20, -20, 20);
        randomArray(50, 0, 100);

        System.out.println("\nTest for method - sumArraysSameLength");
        sumArraysSameLength(array2,array3);
        sumArraysSameLength(array1,array2);

    }

}
