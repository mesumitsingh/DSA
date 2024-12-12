public class Recursions {

    public static void printNumb(int n) {
        if (n == 0) return;
        System.out.println(n);
        printNumb(n - 1);
    }
    
    public static void printNumbF(int n){
        if(n>5) return;
        System.out.println(n);
        printNumbF(n+1);
    }

    public static void natSum(int i, int n, int sum){ 
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        natSum(i+1, n, sum);
    }

    public static int factorial(int n){ 
        // if(n==0){
        //     System.out.println(fact);
        //     return;
        // }
        // fact *= n;
        // factorial(n-1, fact);

        if(n==0 || n==1) return 1;     
        int fact_n1 = factorial(n-1);
        int fact_n = n*fact_n1; 
        return fact_n;

    }

    public static void main(String args[]) {
        int n = 5;
        printNumb(n);

        int n2 = 1; 
        printNumbF(n2);
        
        System.out.println("Sum of N natural numbers:");
        natSum(0,9,0);

        System.out.println("Factorial:");
        factorial(5);

    }
     


}
