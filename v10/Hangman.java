import java.util.*;

public class Hangman {

    public static void main(String [] args){

    //Initialize all the variables used here
    String storedword;
    char[] charstring;
    int length;
    char[] censor; 
    int attempts=0;

    StringBuilder pastguesses = new StringBuilder(); //String Builder to add and print out previous guesses

    Scanner typedword = new Scanner(System.in);
    System.out.println("Enter your word to guess: ");
    storedword = typedword.nextLine();  
    storedword = storedword.toUpperCase(); //stores the word and changes it to all caps
    length = storedword.length(); 

    charstring = storedword.toCharArray(); //creates char array of string

    //creates and prints an array of chars with the same length as string
    censor = storedword.toCharArray(); 
    System.out.println("Your secret word is: ");

    for (int index = 0; index < length; index++){
        censor[index] = '*';
    }

    //Main loop to take guesses (is this while loop the ideal loop here?
    while (String.valueOf(censor).equals(storedword)== false){

        //Initialize all variables in loop
        char charguess;
        String tempword;
        String tempstring;
        boolean correct = false; //required for if loops below/lets the user know if the letter is in the word or not
        int times = 0; //number of times a letter is in the word
        boolean repeated = false; //check if user guessed the same letter twice

        //prints the censored secret word
        for(int a= 0; a < length; a++){
             System.out.print(censor[a]);
        }
        System.out.println();

        //asks user for guess, then stores guess in Char charguess and String tempstring
        Scanner guess = new Scanner(System.in);
        System.out.println("Type your guess: ");
        tempword = guess.next();
        charguess = tempword.charAt(0); //gets char data from scanner

        pastguesses.append(charguess); //adds guess to previous guess string
        tempstring = pastguesses.toString();

        //checks if user already guessed the letter previously
        if (tempstring.lastIndexOf(charguess, tempstring.length() -2 ) != -1){
            System.out.println("You already guessed this letter! Guess again. Your previous guesses were: ");
            pastguesses.deleteCharAt(tempstring.length()-1); 
            System.out.println(tempstring.substring(0, tempstring.length()-1));
            repeated = true;
        }

        //if the guess is not a duplicated guess, checks if the guessed letter is in the word
        if (repeated == false){
            for (int index = 0; index < length; index++){

                 if(charstring[index] == Character.toUpperCase(charguess)) {

                     censor[index] = Character.toUpperCase(charguess);  //replaces * with guessed letter in caps             
                     correct = true; 
                     times++; 
                  }
            }
            if(correct == true){
                System.out.println("The letter " + charguess + " is in the secret word! There are " + times +" " + charguess + " 's in the word. Revealing the letter(s): ");
            }

            else if (correct == false){
                System.out.println("Sorry, the letter is not in the word. Your secret word:  ");
            }
            System.out.println();
        }
        attempts++;
    }
    System.out.println("You guessed the entire word "+ storedword.toUpperCase() + " correctly! It took you " + attempts + " attempts!");

    //typedword.close(); //StackOverFlow readers: is this necessary? Not sure how to use .close()

}}
