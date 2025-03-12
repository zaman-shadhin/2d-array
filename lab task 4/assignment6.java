import java.util.Scanner;

public class assignment6 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[][] A = new int[2][3];
            int[][] B = new int[2][3];

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

                    //SUM MATRIX
                      int[][] sum = new int [3][3];
                    for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < A[i].length; j++) {
                            sum[i][j] = A[i][j] + B[i][j];
                        }}

                        System.out.println("The Addition matrix of A & B matrix is :");
                        for (int i = 0; i < A.length; i++) {
                            for (int j = 0; j < A[i].length; j++) {
                                System.out.print(sum[i][j] + " ");
                            }
                            System.out.println();
                        }


                            

                            }
                        }