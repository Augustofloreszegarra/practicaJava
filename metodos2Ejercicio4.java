public class metodos2Ejercicio4 {

    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5};
        String[] arrayString = {"Hola", "mundo", "de", "Java"};
        int[][] arrayBidimensionalInt = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[][] arrayBidimensionalString = {{"Hola", "mundo"}, {"de", "Java"}};

        imprimirArray(arrayInt);
        imprimirArray(arrayString);
        imprimirArray(arrayBidimensionalInt);
        imprimirArray(arrayBidimensionalString);
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void imprimirArray(String[] array) {
        for (String array1 : array) {
            System.out.print(array1 + " ");
        }
        System.out.println();
    }

    public static void imprimirArray(int[][] array) {
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirArray(String[][] array) {
        for (String[] array1 : array) {
            for (String array11 : array1) {
                System.out.print(array11 + " ");
            }
            System.out.println();
        }
    }
}
