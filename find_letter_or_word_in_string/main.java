package find_letter_or_word_in_string;

import java.util.Scanner;

public class main {
    public static Scanner input = new Scanner(System.in);

    static String userInputText(){
        String text;
        System.out.println("Please, write down the text: \n");
        return text = input.nextLine();

    }
    static char userInputChar(){
        char character;
        System.out.println("Please, input the character that you want to search for in the text:\n");
        character = input.next().charAt(0);
        input.nextLine();
        return character;
    }
    static int counterOfCharacters(String text, char character){
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character){
                counter++;
            }
        }

        return counter;
    }
    static int numCharFunction(String text, char character){
        int counter = counterOfCharacters(text, character);
        System.out.println("Returning function: ");
        return counter;
    }

    static void numCharAction(String text, char character){
        int counter = counterOfCharacters(text,character);
        System.out.println("Action which doesn't return anything, just prints the result: ");
        System.out.println("The result is: " + counter);
    }

    static int numStringFunction(String text1, String text2){
        int counter = stringCountInString(text1, text2);
        System.out.println("The function that counts number of words that is in the string2. ");
        return counter;
    }

    static int stringCountInString(String text1, String text2){
        int counter = 0;

        for (int i = 0; i < text2.length()-text1.length()+1; i++) {
            if (text1.equals(text2.substring(i, i + text1.length()))) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        String text = userInputText();
        char character = userInputChar();


        int counter = numCharFunction(text, character);
        System.out.println("The result is: " + counter);

        numCharAction(text, character);

        text = userInputText();
        String text2 = userInputText();

        counter = numStringFunction(text, text2);
        System.out.println("The result is: " + counter);
    }
}
