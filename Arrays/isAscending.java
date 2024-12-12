import java.util.Scanner;

public class isAscending {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array separated by spaces: ");
        String input = sc.nextLine();

        String[] inputString = input.split(" ");

        int[] arr = new int[inputString.length];
        for (int i = 0; i < inputString.length; i++) {
            arr[i] = Integer.parseInt(inputString[i]);
        }

        // Print array
        System.out.println("Array created: ");
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        boolean isAscending = true; 

        for(int i=0; i<arr.length-1; i++){ 
            if(arr[i]>arr[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){ 
            System.out.println("Array is in Ascending order");
        } else{ 
            System.out.println("Array isn't in Ascending order");

        }
    }
}
