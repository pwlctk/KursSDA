package pl.pwlctk.kurs03.zajecia;

public class TablesMulti {
    public static void main(String[] args) {
        System.out.println("Wielowymiarowe tablice:");
        int[][] squareArray = new int[5][5];
        int[][] squareArray2 = new int[2][3];

/*        System.out.println("Tablica z jedynkami wygląda tak:");
        arrayOne(squareArray);
        showMatrix(squareArray);

        System.out.println("\nTablica z liczbami po skosie wygląda tak: ");
        arrayDiagonally(squareArray);
        showMatrix(squareArray);

        System.out.println("\nTablica z cyframi po kolei:");
        arrayCounter(squareArray2);
        showMatrix(squareArray2);*/

        System.out.println("\nWypisanie wszystkiego: ");
        showMatrixAll(squareArray2);

    }

    private static void showMatrixAll(int[][] squareArray2) {
        for (int i = 0; i < squareArray2.length; i++) {
            for (int j = 0; j < squareArray2[i].length; j++) {
                System.out.print("tab[" + i + ", " + j + "] = " + squareArray2[i][j] + "; ");
                if (Math.abs(j - i) == 1) {
                    System.out.println();
                }
            }

        }
    }

    private static void arrayCounter(int[][] squareArray2) {
        int counter = 0;
        for (int i = 0; i < squareArray2.length; i++) {
            for (int j = 0; j < squareArray2[i].length; j++) {
                squareArray2[i][j] = counter;
                counter++;
            }
        }
    }

    private static void arrayDiagonally(int[][] squareArray) {
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                if (i == j) {
                    squareArray[i][j] = i;
                } else {
                    squareArray[i][j] = 0;
                }
            }
        }
    }

    private static void arrayOne(int[][] squareArray) {
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                if (i == 2) {
                    squareArray[i][j] = 1;
                } else {
                    squareArray[i][j] = 0;
                }
            }
        }
    }

    private static void showMatrix(int array[][]) {
        for (int[] anArray : array) {
            for (int anAnArray : anArray) {
                System.out.print(anAnArray + " ");
            }
            System.out.println();
        }
    }

}
