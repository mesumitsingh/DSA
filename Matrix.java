import java.util.Scanner;

class Matrix{ 

    // Multiplication of Matrix 
    // Addition of Matrix
    // Transpose

    public static int[][] addition(int[][] mat1, int[][] mat2){
        if(mat1.length != mat2.length){
            throw new IllegalArgumentException("No. of rows & columns must be same for both the matrix to perform addition");
        }
        int rows = mat1.length; 
        int cols = mat1[0].length; 
        
        int[][] result = new int[rows][cols];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return result;

    }

    public static int[][] multiplication(int[][] mat1, int[][] mat2){
        int rows1 = mat1.length;
        int cols1 = mat1[0].length; 
        int rows2 = mat2.length; 
        int cols2 = mat2[0].length;
        
        if (cols1 != rows2) {
            throw new IllegalArgumentException("Number of columns in mat1 must be equal to number of rows in mat2.");
        }
        
        int[][] result = new int[rows1][cols2];

        for(int i=0; i<rows1; i++){
            for(int j=0; j<cols2; j++){
                for(int k=0; k<cols1; k++){ 
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }   
            }
        }
        return result; 
    }

    public static int[][] transpose(int[][] mat){ 
        int[][] result = new int[mat.length][mat[0].length];

        for(int i=0; i<mat[0].length; i++){
            for(int j=0; j<mat.length; j++){ 
                result[i][j] = mat[j][i];
            }
        }
        return result; 
    }

    public static void printMat(int[][] matrix){
        for(int[] row: matrix){ 
            for(int element: row){ 
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter rows of matrix: "); 
            int rows = sc.nextInt();
            System.out.print("Enter cols of matrix: ");
            int cols = sc.nextInt();

            int[][] matrix1 = new int[rows][cols]; 
            int[][] matrix2 = new int[rows][cols];

            System.out.println("Enter Matrix 1: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){ 
                    int element = sc.nextInt();
                    matrix1[i][j] = element;
                }
            }

            System.out.println("Enter Matrix 2: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){ 
                    int element = sc.nextInt();
                    matrix2[i][j] = element;
                }
            }

            System.out.println("Your matrixes:");
            printMat(matrix1);
            System.out.println();
            printMat(matrix2);
            
            System.out.println("Addition:");
            printMat(addition(matrix1, matrix2));
            System.out.println("Mulitplication:");
            printMat(multiplication(matrix1, matrix2));
            System.out.println("Transpose:");
            printMat(transpose(matrix1));
            System.out.println();
            printMat(transpose(matrix2));

            System.out.println("Do you want to to continue (Y/N)");
            String choice = sc.next();
            
            if (choice.equals("N") || choice.equals("n")) {
                break; 
            }
        }

    }
}

