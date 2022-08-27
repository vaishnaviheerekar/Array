import java.util.*;
class Array{
    public static void main(String args[]){
        int[] marks= new int[3];
        marks[0]= 100;
        marks[1]= 40;
        marks[2]= 30;
        System.out.println(marks[0]);
    }
}

class array12{
    public static void main(String args[]){
        int[] ages = new int[2];
        ages[0]=10;
        ages[1]=20;
        for(int i=0;i<2;i++)
        System.out.println(ages[i]);
    }
}

class array13{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        marks[0]=20;
        marks[1]= 30;
        marks[2]= 40;
        System.out.println(marks[2]);
    }
}


class array14{
    public static void main(String args[]){
        int marks[]={100,30,50};
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}

class array15{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] marks= new int[size];  // defined array and their size
        for(int i=0;i<size;i++){
        marks[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++){
        System.out.println(marks[i]);
    }
}
}


class searchnumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter x");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
        if(numbers[i]==x){
            System.out.println("x is at index"+i);
        }
    }

    }
}

class names{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        String[] names=new String[size];
        for(int i=0;i<size;i++){
            names[i]=sc.next(); // if we put nextline here then we are getting one size less
        }
        for(int i=0;i<size;i++){
            System.out.println(names[i]);
        }
    }
}


class MaxMin{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int MaxMin[]= new int[size];
        for(int i=0;i<size;i++){
            MaxMin[i]=sc.nextInt();
        }
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<MaxMin.length;i++){
            if(MaxMin[i]<min){
                min=MaxMin[i];
            }
            if(MaxMin[i]>max){
                max=MaxMin[i];
            }
            
        }
        System.out.println("largest number is"+" "+ max);
            System.out.println("Smallest number is"+" "+ min);
    }
}


class array6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int list[]= new int[size];
        for(int i=0;i<size;i++){
           list[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
       
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

// Take an array of numbers as input and check if it is an array sorted in ascending order.
class sorting{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int list[]=new int[size];
        for(int i=0;i<size;i++){
            list[i]=sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0; i<list.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
            if(list[i] > list[i+1]) { // This is the condition for descending order
                isAscending = false;
            }
        }
        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
 
 
    }

}