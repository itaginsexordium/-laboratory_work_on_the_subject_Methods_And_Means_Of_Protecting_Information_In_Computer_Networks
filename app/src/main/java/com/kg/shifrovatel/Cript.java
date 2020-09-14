package com.kg.shifrovatel;

import java.util.Arrays;

public class Cript {
    private static String ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyz";
    private char[] ALPHABET_ARRAY;
    private char[] textCharArray, textCipher;

    public String criptText(String text) {
        text.toLowerCase();

        ALPHABET_ARRAY = ALPHABET.toCharArray();
        textCharArray = text.toCharArray();
        textCipher = new char[textCharArray.length];

        for (int i = 0; i <= textCharArray.length - 1; i++) {
            for (int j = 0; j < ALPHABET_ARRAY.length - 1; j++) {
                if (textCharArray[i] == ALPHABET_ARRAY[j]) {
                    textCipher[i] = ALPHABET_ARRAY[j + 3];
                }
            }
        }
        text = Arrays.toString(textCipher).replaceAll("\\[|\\]|,|\\s", "");
        return text;
    }




    public String decriptText(String text){
        text.toLowerCase();

         ALPHABET_ARRAY = ALPHABET.toCharArray();
         textCharArray = text.toCharArray();
         textCipher = new char[textCharArray.length];

        for (int i = 0; i <= textCharArray.length - 1; i++) {
            for (int j = 0; j < ALPHABET_ARRAY.length - 1; j++) {
                if (textCharArray[i] == ALPHABET_ARRAY[j]) {
                    textCipher[i] = ALPHABET_ARRAY[j - 3];
                }
            }
        }
        text = Arrays.toString(textCipher).replaceAll("\\[|\\]|,|\\s", "");
        return text;
    }

}
