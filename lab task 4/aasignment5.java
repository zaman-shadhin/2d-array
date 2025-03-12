import java.util.Scanner;

public class aasignment5 {
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
                    int rows = arr.length;
                    int cols = arr[0].length;
                    int[][] transpose = new int[cols][rows];
            
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            transpose[j][i] = arr[i][j];
                        }
                    }
            
                    System.out.println("Transpose of the matrix:");
                    for (int i = 0; i < cols; i++) {
                        for (int j = 0; j < rows; j++) {
                            System.out.print(transpose[i][j] + " ");
                        }
                        System.out.println();
                    }
                            }
                        }