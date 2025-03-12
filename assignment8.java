import java.util.Scanner;

public class assignment8 {
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int key = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element found at (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
     
}}
