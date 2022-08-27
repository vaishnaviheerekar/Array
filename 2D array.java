 import java.util.*;
 class TwoDArray1 {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int rows=sc.nextInt();
      int cols=sc.nextInt();
      int numbers[][]=new int[rows][cols]; //Syntax 2DArray: type[] arrayname[][]=new type[][]
      //input 
      for(int i=0;i<rows;i++){   //rows
          for(int j=0;j<cols;j++){  //cols
              numbers[i][j]=sc.nextInt();
          }
      }
      //output
      for(int i=0;i<rows;i++){ 
          for(int j=0;j<cols;j++){
              System.out.print(numbers[i][j]+" ");
          }
          System.out.println();
      }
    }
}

// Take a matrix as imput from the user. Search for the given number x and print the indices of that number

class TwoDArray2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int numbers[][]=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        int x=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
             if(numbers[i][j]==x){
                 System.out.println("found at:"+" "+i+","+j);
             }
            }
        }
    }
}

// For a given matrix of N x M, print its transpose.
 class TwoDArray3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
               System.out.println("the transpose is:");
            //transpose
            for(int j=0; j<cols ;j++) {
                for(int i=0; i<rows; i++) {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
      
            
        }
    }
}

class TwoDArray4{  //advance
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
   
        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
             for(int j=0; j<m; j++) {
                 matrix[i][j] = sc.nextInt();
             }
        }
   
        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
   
        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;
   
            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;
   
            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;
   
            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
   
            System.out.println();
        }
     }
  }
   
  