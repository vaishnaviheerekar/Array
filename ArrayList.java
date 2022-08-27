import java.util.ArrayList;
import java.util.Collections; 
import java.util.*;  // we can write * 
 class ArrayLists {

    public static void main(String args[]){
    // int[] list = new int[size];
    // ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list =new ArrayList<Integer>(); 
          list.add(0);   //add elements
          list.add(2);
          list.add(3);
          System.out.println(list);
          
          int number=list.get(1);  //get will get the value of the index position you want
          System.out.println(number);

          list.set(0,2);       //set is used to change of the value of that particular index
          System.out.println(list);

          list.remove(2);  // remove = delete the number of that particular index
          System.out.println(list);

          list.add(2,4);  //adding elements in between by using index and updated number
          System.out.println(list);

          int size=list.size();  //size (no need to write index)
          System.out.println(size);

          for(int i=0;i<list.size();i++){ //loops i is index starts from 0 to list-1
            System.out.print(list.get(i));
          }
          System.out.println();

          list.set(0,7);
          System.out.println(list);

          Collections.sort(list); // sort we use collections and need to import collections
          System.out.println(list);
        }
    
}


class twoD{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int cols=sc.nextInt();
    int[][] matrix =new int[rows][cols];
    for(int i=0;i<rows;i++){  //input elements
      for(int j=0;j<cols;j++){
        matrix[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }
}

// Searching for an element x in a matrix.
class search{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int rows=sc.nextInt();
  int cols=sc.nextInt();
  int[][] matrix= new int[rows][cols];
  for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
      matrix[i][j]=sc.nextInt();
    }
  }
  int x=sc.nextInt();
  for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
      if(matrix[i][j]==x){
        System.out.println("x found at index"+" "+i+","+j);
      }
}
  }
}

}