package com.kg.shifrovatel;

import java.util.Arrays;

public class Cript {
    private static String ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyz";
    private char[] charArray = ALPHABET.toCharArray();
    private char[] textCharArray, textCipherToIntNumbers;


    public String criptText(String text) {
        text.toLowerCase();

        charArray = ALPHABET.toCharArray();
        textCharArray = text.toCharArray();
        textCipherToIntNumbers = new char[textCharArray.length];

        for (int i = 0; i <= textCharArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - 1; j++) {
                if (textCharArray[i] == charArray[j]) {
                    textCipherToIntNumbers[i] = charArray[j + 3];
                }
            }
        }
        text = Arrays.toString(textCipherToIntNumbers).replaceAll("\\[|\\]|,|\\s", "");
        return text;
    }




    public String decriptText(String text){
        text.toLowerCase();

         charArray = ALPHABET.toCharArray();
         textCharArray = text.toCharArray();
         textCipherToIntNumbers = new char[textCharArray.length];

        for (int i = 0; i <= textCharArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - 1; j++) {
                if (textCharArray[i] == charArray[j]) {
                    textCipherToIntNumbers[i] = charArray[j - 3];
                }
            }
        }
        text = Arrays.toString(textCipherToIntNumbers).replaceAll("\\[|\\]|,|\\s", "");
        return text;
    }

}
