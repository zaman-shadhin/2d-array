import java.util.Scanner;

public class assignment3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[][] arr = new int[3][3];
                
                   System.out.println("Enter elements for matrix : ");  
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.printf("arr[%d][%d]=",i,j ); 
                            arr[i][j]=input.nextInt();
                        }   }

                    System.out.println("the matrix is : ");

                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }

                    int max=arr[0][0];
                    int min=arr[0][0];
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                           
                                if (arr[i][j] > max) max = arr[i][j];
                                if (arr[i][j] < min) min = arr[i][j];
                                }
                               
                            }
                            
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
                        }
                        
                    }

                            
                