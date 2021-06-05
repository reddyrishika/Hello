/***************************************************************************
* PhoneSelection.java
****************************************************************************
* This lab outputs the corresponding digit when a single letter is entered on the display screen.
*___________________________________________________________________________
* Rishika Reddy
* 06/05/21
* CMSC 255 C01
***************************************************************************/

import java.util.Scanner;

public class PhoneSelection1 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner scnr = new Scanner(System.in);
    
        // Prompt user to enter a single letter
    System.out.print("Enter a single letter, and I will tell you what the corresponding digit is on the telephone ");
    
        // Capture a character from the user and convert the lower-case letter to an upper-case letter
    char letter = scnr.next().toUpperCase().charAt(0);
        
        // Switch statements that match the single letter to the corresponding digit
        // Display the corresponding digit to the single letter on the display screen
        switch (letter){
            case 'A': 
            case 'B':
            case 'C':
                System.out.println("The digit 2 corresponds to the letter " + letter + " on the telephone.");
                break;
            case 'D':
            case 'E':
            case 'F':
                System.out.println("The digit 3 corresponds to the letter " + letter + " on the telephone.");
                break;
            case 'G':
            case 'H':
            case 'I':
                System.out.println("The digit 4 corresponds to the letter " + letter + " on the telephone.");
                break;
            case 'J':
            case 'K':
            case 'L':
                System.out.println("The digit 5 corresponds to the letter " + letter + " on the telephone.");
                break;
            case 'M':
            case 'N':
            case 'O':
                System.out.println("The digit 6 corresponds to the letter " + letter + " on the telephone.");
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                System.out.println("The digit 7 corresponds to the letter " + letter + " on the telephone.");
                break;
            case 'T':
            case 'U':
            case 'V':
                System.out.println("The digit 8 corresponds to the letter " + letter + " on the telephone.");
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                System.out.println("The digit 9 corresponds to the letter " + letter + " on the telephone.");
                break;
        }
      
    }
}










