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

    //    Create array with N size, and print in descending order
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

    public static void main(String[] args) {

        int[] array1 = new int[]{21, 3, 2, 43, 5, 76, 89, 100, 1, -8};

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

    }

}
