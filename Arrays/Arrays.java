import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){ 
        int[] marks = new int[3]; 
        marks[0] = 97;
        marks[1] = 98; 
        marks[2] = 95; 
        System.out.println(marks);

        for(int i=0; i<3; i++){ 
            System.out.println(marks[i]);
        }

        System.out.print("Enter size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); 
        int numbers[] = new int[size]; 

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt(); 
        }

        System.out.println("Array you entered:");
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
        
        System.out.print("Enter element to be searched: ");
        int x = sc.nextInt(); 

        boolean found = false;
        int index = -1;
        for(int i=0; i<size; i++){ 
            if(numbers[i] == x){
                found = true; 
                index = i;
                break;
            }
        }
        if(found){
            System.out.println("Element \"" + x + "\" found at " + index + " index");
        } else{ 
            System.out.println("Element " + x + " not found");
        }
        
            sc.close();
    }
}
 