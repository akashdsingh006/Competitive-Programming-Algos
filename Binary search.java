import java.util.*;
    class BinarySearch{  
     public static void binarySearch(int arr[], int first, int last, int key){  
       int mid = (first + last)/2;  
       while( first <= last ){  
          if ( arr[mid] < key ){  
            first = mid + 1;     
          }else if ( arr[mid] == key ){  
            System.out.println("Element is found at index: " + mid);  
            break;  
          }else{  
             last = mid - 1;  
          }  
          mid = (first + last)/2;  
       }  
       if ( first > last ){  
          System.out.println("Element is not found!");  
       }  
     }  
     public static void main(String args[]){ 
     
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter number to be searched');
            int key=in.nextInt(); 
            int last=arr.length-1;  
            binarySearch(arr,0,last,key);     
     }  
    }  
