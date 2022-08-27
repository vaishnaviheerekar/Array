// How to sort an array and search an element inside it?
import java.util.*; //linear search
import java.util.Arrays;
class arrayp1{
public static void main(String args[]){ 
   Scanner sc= new Scanner(System.in);
   int size=sc.nextInt();
   int[] arr = new int[size];
   for(int i=0;i<size;i++){
    arr[i]=sc.nextInt();
   }
   int target = 0;
   for(int i=0;i<size;i++){
    if(arr[i]==0){
        System.out.println("target found at index" + i);
    }
   }
}
}

class arrayp2{
    public static void main(String args[]){
        int arr[]= {2,3,4,0,-9,-6,-7};
        Arrays.sort(arr);
        for(int i=0;i<6;i++){ 
        System.out.print(arr[i]+" ");
        }
        int index=Arrays.binarySearch(arr,0);
        System.out.println("found 0 at "+ index);
    }
}

// to sort an array using bubble sort
class arrayp3{
    public static void printSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={9,10,6,5,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                // swap
                int temp= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
        printSort(arr);
    }
}

//How to sort an array and insert an element inside it?


class h{
    public static void main(String args[]){
        int val2=12;
        val2=val2 >>> 12;
        System.out.println(val2);
    }
}
 class Series {
  public static void main(String[] args) {

    // create Scanner class object
    // to read input values
    Scanner in = new Scanner(System.in);

    // declare variables
    int a;
    int sum = 0;

    // read N value
    int arr[]=new int[5];
    for(int i=0; i<5; i++) {
        arr[i]=in.nextInt();
    }
    // calculate the sum of series
    for(int i=1; i<=5; i++) {
      sum = sum + i;
      System.out.println(sum);
    }

  }
}


//sum of the cummulative
class series2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=5;
    int sum=0;
    int arr[]= new int[a];
    //input array elements
    for(int i=0;i<a;i++){
       arr[i]=sc.nextInt();
    }
    //output sum of elements
     for(int i=1;i<=a;i++){
      sum=sum+i;
      System.out.println(sum);
     }

  }
}
//how to check if both arrays are equal or not
class arrayp4{
    public static void main(String args[]){
        int arr1[]= {1,2,3,4,5};
        int arr2[]= {1,2,3,4,5};
        if(Arrays.equals(arr1, arr2)){
            System.out.println("same");
        }else
        System.out.println("not same");
    }
}
//How to find an object or a string in an Array?
class arrayp5{
    public static void main(String args[]){
        ArrayList objArray = new ArrayList<>();
        ArrayList objArray2 = new ArrayList<>();
        objArray2.add(0,"common1");
      objArray2.add(1,"common2");
      objArray2.add(2,"notcommon");
      objArray2.add(3,"notcommon1");
      objArray.add(0,"common1");
      objArray.add(1,"common2");
      System.out.println("Array elements of array1"+objArray);
      System.out.println("Array elements of array2"+objArray2);
      System.out.println("Array 1 contains String common1?? "
         +objArray.contains("common3"));
      System.out.println("Array 2 contains Array1?? "
         +objArray2.contains(objArray) );
   }
    }

    // How to find common elements from arrays ?\
    class arrayp6{
        public static void main(String args[]){
            int arr1[]={1,2,3,4,5,6};
            int arr2[]={1,6,5,7,8,9};
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    if(arr1[i]==arr2[j]){
                        System.out.println(arr1[i]);
                    }
                }
            }
        }
    }
// using arraylist common elements
    class arrayp7{
        public static void main(String args[]){
         ArrayList obj1= new ArrayList<>();
         ArrayList obj2 = new ArrayList<>();  
         obj1.add("a");
         obj1.add("b");
         obj1.add("c");
         obj2.add("a");
         obj2.add("f");
         System.out.println("obj1 elements"+" "+obj1);
         System.out.println("obj2 elements"+" "+obj2);
         obj1.retainAll(obj2);
         System.out.println("common elements"+" "+obj1);
        }
    }
// how to remove an element in an array
class arrayp8{
    public static void main(String args[]){
        ArrayList series= new ArrayList<>();
        series.add(1);
        series.add(2);
        series.add(3);
        series.add(4);
        System.out.println(series);
        series.remove(2);
        System.out.println(series);
    }
}

// How to extend an array after initialisation?
class arrayp9{
    public static void main(String args[]){
        int arr[]={1,2,3};
        int extend[]=new int[5];
        extend[3]=4;
        extend[4]=5;
        System.arraycopy(arr, 0, extend, 0, arr.length);
        for (int str :extend){
    System.out.println(str);
        }
    }
}





