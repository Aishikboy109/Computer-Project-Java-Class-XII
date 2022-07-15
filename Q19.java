import java.util.Scanner;

public class Q19 {
    static void sort_elements(String str[]) {
        for (int i = 1; i < str.length; i++) {
            String temp = str[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < str[j].length()) {
                str[j + 1] = str[j];
                j--;
            }
            str[j + 1] = temp;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String str = sc.nextLine();
        String str_arr[] = str.split(" ");
        sort_elements(str_arr);
        System.out.print("The sorted array is : ");
        for (int i = 0; i < str_arr.length; i++)
            System.out.print(str_arr[i] + " ");
    }
}

/*
 Output:
 Enter the sentence : 
I love to watch thrillers in my free time
The sorted array is : I to in my love free time watch thrillers 
 */