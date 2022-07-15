import java.util.Scanner;

public class Q15 {
    static boolean kaprekar(int n)   
    {   
        if (n == 1)   
           return true;   
        int sq_n = n * n;   
        int count_digits = 0;   
        while (sq_n != 0)   
        {   
            count_digits++;   
            sq_n /= 10;   
        }   
        sq_n = n*n;   
        for (int r_digits=1; r_digits<count_digits; r_digits++)   
        {   
             int eq_parts = (int) Math.pow(10, r_digits);   
            if (eq_parts == n)   
                continue;   
             int sum = sq_n/eq_parts + sq_n % eq_parts;   
             if (sum == n)   
               return true;   
        }   
        return false;   
    }     

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lower limit : ");
        int lower = in.nextInt();
        System.out.println("Enter the upper limit : ");
        int upper = in.nextInt();
        for (int i = lower; i <= upper; i++) {
            if (kaprekar(i)) {
                System.out.print(i + ", ");
            }
        }
    }
}


/*
 Output:

 Enter the lower limit : 
1
Enter the upper limit : 
100
1, 9, 45, 55, 99, 
 */