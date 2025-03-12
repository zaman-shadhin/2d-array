import java.util.Scanner;

public class aasignment4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[][] arr = new int[3][3];
                
                   System.out.println("Enter elements for matrix : ");  
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.printf("arr[%d][%d]=",i,j ); 
                            arr[i][j]=input.nextInt();
                        }                      
                    }
                    System.out.println("the matrix is : ");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Row-wise Sum:");
                    for (int i = 0; i < arr.length; i++) {
                        int rowSum = 0;
                        for (int j = 0; j < arr[i].length; j++) {
                            rowSum =rowSum + arr[i][j];
                        }
                        System.out.println("Row " + (i + 1) + ": " + rowSum);
                    }
            
                    
                    System.out.println("\nColumn-wise Sum:");
                    for (int j = 0; j < arr[0].length; j++) {
                        int colSum = 0;
                        for (int i = 0; i < arr.length; i++) {
                            colSum =colSum + arr[i][j];
                        }
                        System.out.println("Column " + (j + 1) + ": " + colSum);
                    }}}