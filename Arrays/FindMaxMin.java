import java.util.Scanner;

public class FindMaxMin {
    public static void main(String args[]){ 
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter array separated by spaces: ");
        String input = sc.nextLine(); 

        String[] inputString = input.split(" ");

        int[] arr = new int[inputString.length];
        for(int i=0; i<inputString.length; i++){ 
            arr[i] = Integer.parseInt(inputString[i]);
        }

        //Print array 
        System.out.println("Array created: ");
        System.out.print("[ ");
        for(int i =0; i<arr.length; i++){ 
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){ 
            if(arr[i] < min){ 
                min = arr[i]; 
            } 
            if(arr[i] > max){ 
                max = arr[i];
            }
        }

        System.out.println("Maximum element in array: " + max);
        System.out.println("Minimum element in array: " + min);
    }    
}
