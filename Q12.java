class Q12 {
    public static void main(String[] args) {
        String str, word;
        int wordsLen, i, count, j, k;
        str = "I love Java but Rahul loves Python";
        String words[] = str.split(" ");
        wordsLen = words.length;

        System.out.println("\n----Occurrences of Each Word----");
        for (i = 0; i < wordsLen; i++) { 
            word = words[i]; // Selects each word from the 
            count = 1;
            for (j = (i + 1); j < (wordsLen - 1); j++) {
                if (word.equals(words[j])) {
                    count++;
                    for (k = j; k < (wordsLen - 1); k++) {
                        words[k] = words[k + 1];
                    }
                    wordsLen--;
                    j--;
                }
            }
            System.out.println(word + " occurs " + count);
            count = 0;
        }
    }
}

/*
 * ----Occurrences of Each Word----
 * I occurs 1
 * love occurs 1
 * Java occurs 1
 * but occurs 1
 * Rahul occurs 1
 * loves occurs 1
 * Python occurs 1
 */