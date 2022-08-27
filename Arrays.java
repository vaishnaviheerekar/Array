import java.util.*;
public class Arrays {
    public static void main(String args[]){
        int[] marks=new int[3];  // syntax of array: type arrayName= new type[size]
        marks[0]=20;
        marks[1]=14;
        marks[2]=30;
        System.out.println(marks[1]);
        }
}

class array1{
    public static void main(String args[]){
        int[] marks=new int[3];  // syntax of array: type arrayName= new type[size]
        marks[0]=20;
        marks[1]=14;
        marks[2]=30;
        for(int i=0;i<=2;i++){
            System.out.println(marks[i]);
        }
    }
}

class array2{
    public static void main(String args[]){
        int marks[]={20,14,30};      // if the elements of the array is known then we can write it directly
        for(int i=0;i<=2;i++){
            System.out.println(marks[i]);
        }
    }
}
// if the elements in an array and size are not known 
 class array3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();   //input declare size
        int numbers[]=new int[size]; //array
        for(int i=0;i<size;i++){ // input elements
            numbers[i]=sc.nextInt();
        }
         //output
        for(int i=0;i<size;i++){
             System.out.println(numbers[i]);
    }
}
}

//take an array from the user. Search for a given number x and print the index at which it occurs
class array4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int x=sc.nextInt();   // numbers.length
         for(int i=0;i<size;i++){  //size bhi likh sakte numbers.length bhi likh sakte
             if(numbers[i]==x){
                 System.out.println("x found at index"+ i);
             }
         }
    }
}

// Take an array of names as input from the user and print them on the screen.

class array5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt(); //input size
        String names[]=new String[size]; //declare array of string
        for(int i=0;i<size;i++){
            names[i]=sc.next(); // input names
        }
            for(int i=0;i<size;i++){
                System.out.println(names[i]); //output names
            }
        }
    }

// Find the maximum & minimum number in an array of integers.

class array6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int list[]= new int[size];
        for(int i=0;i<size;i++){
           list[i]=sc.nextInt();
        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
       
         for(int i=0; i<list.length; i++) {
             if(list[i] < min) {
                 min = list[i];
             }
             if(list[i] > max) {
                 max = list[i];
             }
         }
         System.out.println("Largest number is : " + max);
         System.out.println("Smallest number is : " + min);
  
    }
}

class array7{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size= sc.nextInt();
    int numbers[]=new int[size];

    //input
    for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
  }
  boolean isaccending=true;
  
    }
}

