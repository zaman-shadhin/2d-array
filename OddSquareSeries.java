package com.mycompany.productfile;

import java.util.Scanner;

public class OddSquareSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int number = 1;
        
        // Compute the sum of squares of first n odd numbers
        for (int i = 0; i < n; i++) {
            sum += number * number;
            number += 2;
        }
        
        // Display the result
        System.out.println("Sum of the series: " + sum);
        
        scanner.close();
    }
}

