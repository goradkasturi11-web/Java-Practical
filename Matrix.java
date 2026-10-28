import java.util.Scanner;

class Matrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Matrix 1 declaration
        int row1,col1;
        System.out.println("Enter the no. of rows and columns for first matrix:");
        row1=sc.nextInt();
        col1=sc.nextInt();
        int matrix1[][]=new int[row1][col1];
        
        //input matrix 1
        System.out.println("Enter the elements of first matrix:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        //dispaly elements of 1 matrix
        System.out.println("Elements of first matrix are:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print(matrix1[i][j] +" ");   
            }
            System.out.println(" ");
        }

        //Matrix 2 decalaration
        int row2,col2;
        System.out.println("Enter the no. of rows and columns for second matrix:");
        row2=sc.nextInt();
        col2=sc.nextInt();
        int matrix2[][]=new int[row2][col2];
        
        //input matrix 2
        System.out.println("Enter the elements of second matrix:");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        //dispaly elements of 2 matrix
        System.out.println("Elements of second matrix are:");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.print(matrix2[i][j] +" ");   
            }
            System.out.println(" ");
        }
        //addition of matrix 
        //declration of addition matrix
        if((row1==row2)&&(col1==col2)){
            int add[][]=new int [row1][col1];
        System.out.println("Addition of two matrix:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                add[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print(add[i][j]+ " ");
            }
            System.out.println(" ");
        }
        }
        else
            System.out.println("Order of matrix is not same so addition not possible");
        //multipliction
        
        int rowA,colA;
        System.out.println("Enter the no. of rows and columns for first Matrix");
        rowA=sc.nextInt();
        colA=sc.nextInt();
        int multiA[][]=new int[rowA][colA];
        System.out.println("Enter elements for first matrix");
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colA;j++){
                multiA[i][j]=sc.nextInt();
            }
        }
        int rowB,colB;
        System.out.println("Enter the no. of rows and columns for second matrix");
        rowB=sc.nextInt();
        colB=sc.nextInt();
        int multiB[][]=new int[rowB][colB];
        System.out.println("Enter elements for second matrix");
        for(int i=0;i<rowB;i++){
            for(int j=0;j<colB;j++){
                multiB[i][j]=sc.nextInt();
            }
        } 
        int result[][]=new int [rowA][colA];
        if((colA==rowB)){
            for(int i=0;i<rowA;i++){
                for(int j=0;j<colB;j++){
                    for(int k=0;k<colA;k++){
                        result[i][j]+=multiA[i][k]*multiB[k][j];
                    }
                }
            }
            System.out.println("Multiplication of matrix");
            for(int i=0;i<rowA;i++){
                for(int j=0;j<colB;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println(" ");
            }

        }
        else
            System.out.println("Multiplication not possible");
        sc.close();

    }
}