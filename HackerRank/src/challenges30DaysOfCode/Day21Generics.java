package challenges30DaysOfCode;

import java.util.Scanner;

public class Day21Generics {
	    
	    public static void main(String args[]){
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        Integer[] intArray = new Integer[n];
	        for (int i = 0; i < n; i++) {
	            intArray[i] = scanner.nextInt();
	        }

	        n = scanner.nextInt();
	        String[] stringArray = new String[n];
	        for (int i = 0; i < n; i++) {
	            stringArray[i] = scanner.next();
	        }
	        
	        Day21Printer<Integer> intPrinter = new Day21Printer<Integer>();
	        Day21Printer<String> stringPrinter = new Day21Printer<String>();
	        intPrinter.printArray( intArray  );
	        stringPrinter.printArray( stringArray );
	        if(Day21Printer.class.getDeclaredMethods().length > 1){
	            System.out.println("The Printer class should only have 1 method named printArray.");
	        }
	        scanner.close();
	    } 
	}
