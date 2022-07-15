import java.util.Scanner;

class Q16{
    public static void main(String[] args) {
        int arr[] = {1,9,45,55,99};
        int flag = 0, pos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be deleted : ");
        int elem = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                pos = i;
                flag = 1;
                break;
            }    
        }
        if (flag == 1) {
            for (int i = pos+1; i < arr.length; i++) {
                arr[i-1] = arr[i];
            }
            System.out.println("The array after deletion is : ");
            for (int i = 0; i < arr.length-2; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println(arr[arr.length-2]);
        }
        else {
            System.out.println("The element is not present in the array");
            
        }
    }
}


/*
Output:
Enter the element to be deleted : 
45
The array after deletion is : 
1, 9, 55, 99
 */