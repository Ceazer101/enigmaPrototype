package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*char[] alphabet = {' ', 'a', 'b', 'c', 'd', 'e'};

        char[] message = {'a', 'b', 'e'};

        int[] encode = new int[message.length];

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < message.length; j++) {

                if (alphabet[i] == message[j]){

                    encode[j] = i;
                }

            }

        }

        for (int i = 0; i < encode.length; i++) {
            System.out.println(encode[i]);
        }*/

       /* char letter = 'C';
        int number = convertLetterToNumber(letter);
        System.out.printf("Bogstavet %c bliver til %d", letter, number);*/

       /* String plaintext = "ÅSI";
        int[] cipher = textToListOfNumbers(plaintext);
        System.out.println(Arrays.toString(cipher));*/

        /*int number = 2;
        char letter = convertNumberToLetter( number);
        System.out.printf("Tallet %d bliver til bogstavet %c\n", number, letter);*/

        int[] cipher = {1, 3, 5};
        String plaintext = listOfNumbersToText(cipher);
        System.out.println("Den decryptede tekst er: ");
        System.out.println(plaintext);


    }

    public static int[] textToListOfNumbers(String text) {
        int[] list = new int[text.length()];

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            int number = convertLetterToNumber(letter);
            list[i] = number;
        }

        return list;

    }

    public static int convertLetterToNumber(char letter) {

        String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        int num = alphabet.indexOf(letter);

        return num;
    }

    public static String listOfNumbersToText(int[] numbers) {

        String text = "";

        for (int i = 0; i < numbers.length; i++) {

            int number = numbers[i];
            char letter = convertNumberToLetter(number);
            text = text + letter;

        }
        return text;
    }

    public static char convertNumberToLetter(int number) {

        String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        char letter = alphabet.charAt(number);

        return letter;
    }

}





