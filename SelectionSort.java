import java.util.*;
public class SelectionSort {

    public static void selcArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int a[] = {10, 8,15,24, 30,11};

        //Selection sort

        for(int i=0; i<a.length-1; i++){
            int smallest = i;

            for(int j=i+1; j<a.length; j++){
                if(a[j]<a[smallest]){
                    smallest=j;
                }
            }
            // Swaping

            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        selcArray(a);
    }
}
