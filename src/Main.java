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

    public static void main(String[] args) {

        int[] array1 = new int[]{21, 3, 2, 43, 5, 76, 89, 100, 1, -8};

        printArray(array1);

        swap(array1,1,5);
        printArray(array1);
        swap(array1,0,9);
        printArray(array1);

    }

}
