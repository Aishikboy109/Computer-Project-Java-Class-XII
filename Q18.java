import java.util.Scanner;

public class Q18 {
    static int countVowels(String word){
        word = word.toLowerCase();
        int count = 0;
 
        for (int i = 0; i < word.length(); i++) {
            // check if char[i] is vowel
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e'
                || word.charAt(i) == 'i'
                || word.charAt(i) == 'o'
                || word.charAt(i) == 'u') {
                // count increments if there is vowel in
                // char[i]
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " has " + countVowels(words[i]) + " vowels");
        }
    }
}

/*
 Output : 
 Enter the string : 
I love eating mangoes        
I has 1 vowels
love has 2 vowels
eating has 3 vowels
mangoes has 3 vowels
 */


/*
Output:

*/