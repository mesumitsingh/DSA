import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int rows = sc.nextInt(); 
        int cols = sc.nextInt(); 
        
        int[][] numbers = new int[rows][cols];

        //input
        for(int i=0; i<rows; i++){ 
            //columns
            for(int j=0; j<cols; j++){ 
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrics Created:");
        //output
        for(int i=0; i<rows; i++){ 
            //columns
            for(int j=0; j<cols; j++){ 
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter element to be searched: ");
        int x = sc.nextInt(); 

        for(int i=0; i<rows; i++){ 
            for(int j=0; j<cols; j++){ 
                if(numbers[i][j] == x){ 
                    System.out.println("Element "+ x +" found at " + i + ", " + j +" index");
                }
            }
        }

    }
}
