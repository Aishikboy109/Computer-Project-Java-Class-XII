class ReverseWord {

    static String revWord(String word){
        String revWord = ""; // String to store the reversed word
        for (int i = 0; i < word.length(); i++) {
            revWord += word.charAt(word.length() - i -1); // Appending each character in reversed order
        }
        return revWord; // Returing the reversed word to the function which called revWord()
    }
    public static void main(String[] args) {
        String word = "Aishik"; // Original Word
        System.out.println ("Word in reverse order : " + revWord(word)); // Printing the reversed word
    }
}


/* OUTPUT

Word in reverse order : kihsiA */