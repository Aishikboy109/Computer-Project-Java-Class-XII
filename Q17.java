import java.util.Scanner;

class Q17
{
	/* Checks if a string is empty ("") or null. */
	public static boolean isEmpty(String s) {
		return s == null || s.length() == 0;
	}

	/* Counts how many times the substring appears in the larger string. */
	public static int countMatches(String text, String str)
	{
		if (isEmpty(text) || isEmpty(str)) {
			return 0;
		}

		int index = 0, count = 0;
		while (true)
		{
			index = text.indexOf(str, index);
			if (index != -1)
			{
				count ++;
				index += str.length();
			}
			else {
				break;
			}
		}

		return count;
	}

	public static void main(String[] args)
	{

        Scanner in = new Scanner(System.in);
		System.out.println("Enter the string : ");
        String str = in.next();
        System.out.println("Enter the substring to be searched : ");
		String substr = in.next();

		int count = countMatches(str, substr);
		System.out.println("The substring " + substr + " occurs " + count + " times in the string " + "\"" + str + "\"");
	}
}

/*
 Output : 
 Enter the string : 
Mississippi
Enter the substring to be searched : 
ss
The substring ss occurs 2 times in the string "Mississippi"
 */