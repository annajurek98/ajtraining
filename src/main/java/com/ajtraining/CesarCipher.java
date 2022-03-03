package com.ajtraining;

class CesarCipher {

    public static final int LETTERS_IN_ALPHABET = 26;
    public static final int SHIFT = 3;

    public static String encode(String input) {
        char[] output = new char[input.length()];
        char reference = 'A';
        for (int i = 0; i < input.length(); i++) {
            int currentChar = input.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                reference = 'A';
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                reference = 'a';
            }
            int absolutCharIndex = currentChar - reference;
            int shiftedChar = (absolutCharIndex + SHIFT) % LETTERS_IN_ALPHABET;
            output[i] = (char) (reference + shiftedChar);
        }
        return new String(output);
    }
}
