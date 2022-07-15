import java.util.Scanner;

public class Q14 {
    public static String getAmtInWords(int amt) {
        StringBuffer sb = new StringBuffer();
        
        while (amt != 0) {
            int d =  amt % 10;
            amt /= 10;
            switch (d) {
                case 0:
                sb.insert(0, "Zero ");
                break;

                case 1:
                sb.insert(0, "One ");
                break;

                case 2:
                sb.insert(0, "Two ");
                break;

                case 3:
                sb.insert(0, "Three ");
                break;

                case 4:
                sb.insert(0, "Four ");
                break;

                case 5:
                sb.insert(0, "Five ");
                break;

                case 6:
                sb.insert(0, "Six ");
                break;

                case 7:
                sb.insert(0, "Seven ");
                break;

                case 8:
                sb.insert(0, "Eight ");
                break;

                case 9:
                sb.insert(0, "Nine ");
                break;

                default:
                System.out.println("Invalid digit");
            }
        }

        return sb.toString();
    }


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amt = in.nextInt();

        if (amt > 99999) {
            System.out.println("Invalid Amount");
            return;
        }

        System.out.println(getAmtInWords(amt));
        System.out.println("Denomination:");
        
        int notes[] = {2000, 500, 100, 50, 20, 10, 5};
        int total_notes = 0;
        int t = amt;
        for (int i = 0; i < notes.length; i++) {
            int c = t / notes[i];
            if (c != 0)
                System.out.println(notes[i] + "\t*\t" 
                            + c + "\t=\t" + (c * notes[i]));
            t = t % notes[i];
            total_notes += c;
        }
        System.out.println("Total : " + amt);
        System.out.println("Total number of notes : " + total_notes);
    }
}

/*
 Output : 
Enter the amount: 14320
One Four Three Two Zero 
Denomination:
2000    *       7       =       14000
100     *       3       =       300
20      *       1       =       20
Total : 14320
Total number of notes : 11
 */
