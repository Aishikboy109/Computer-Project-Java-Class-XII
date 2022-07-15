import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        int row = 0, col = 0, i = 0, j = 0, k = 0, temp = 0, count = 0;
        int arr[][], b[];

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROW OF MATRIX");
        row = sc.nextInt();
        System.out.println("ENTER THE NUMBER OF COLUMN OF MATRIX");
        col = sc.nextInt();

        arr = new int[row][col];
        System.out.println("ENTER THE ELEMENTS IN MATRIX");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
                /* counting the number of boundary elements */

                if (i == 0 || i == (row - 1) || j == 0 || j == (col - 1)) {
                    count++;
                }
            }
        }
        b = new int[count];
        System.out.println("ORIGINAL MATRIX");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == (row - 1) || j == (col - 1)) {
                    b[k] = arr[i][j];
                    k++;
                }
            }
        }

        /* sorting one-dimensional array */
        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b.length; j++) {
                if (b[i] < b[j]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        /* putting sorted elements to their positions */
        k = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == (row - 1) || j == (col - 1)) {
                    arr[i][j] = b[k];
                    k++;
                }
            }
        }

        System.out.println("SORTED MATRIX");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }
}

/*
 Output:

 ENTER THE NUMBER OF ROW OF MATRIX
3
ENTER THE NUMBER OF COLUMN OF MATRIX
4
ENTER THE ELEMENTS IN MATRIX    
4
2
8
0
2
6
9
8
0
3
1
7
ORIGINAL MATRIX
4 2 8 0
2 6 9 8
0 3 1 7
SORTED MATRIX   
0 0 1 2
2 6 9 3
4 7 8 8
 */