import java.util.*;

public class BubbleSort{

    

    public static void bSort(int[] arr){
        System.out.println("The sorted array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {15, 18, 12, 82, 50};

        //Bubble sort

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]> arr[j+1]){
                    //Swaping

                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        bSort(arr);
    }
}