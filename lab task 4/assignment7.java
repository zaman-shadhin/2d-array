import java.util.Scanner;

public class assignment7 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[][] A = new int[2][3];
            int[][] B = new int[3][3];
            


                //protom matrix
                   System.out.println("Enter elements for A matrix : ");  
                    for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < A[i].length; j++) {
                            System.out.printf("A[%d][%d]=",i,j ); 
                            A[i][j]=input.nextInt();
                        }                      
                    }
                    System.out.println(" Matrix A : ");
                    for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < A[i].length; j++) {
                            System.out.print(A[i][j] + " ");
                        }
                        System.out.println();
                    }

                    //second matrix
                    System.out.println("Enter elements for B matrix : ");  
                    for (int i = 0; i < B.length; i++) {
                        for (int j = 0; j < B[i].length; j++) {
                            System.out.printf("B[%d][%d]=",i,j ); 
                            B[i][j]=input.nextInt();
                        }                      
                    }
                    System.out.println(" Matrix B : ");
                    for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < B[i].length; j++) {
                            System.out.print(B[i][j] + " ");
                        }
                        System.out.println();
                    }

                    int rows = A.length;
                    int cols = B[0].length;
                    int[][] result = new int[rows][cols];
            
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            for (int k = 0; k < A[0].length; k++) {
                                result[i][j] += A[i][k] * B[k][j];
                            }
                        }
                    }
            
                    System.out.println("multipication of A B  matrix:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print(result[i][j] + " ");
                        }
                        System.out.println();
                    }
                     }
                 }