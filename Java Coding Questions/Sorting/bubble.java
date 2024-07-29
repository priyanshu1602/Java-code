/*package whatever //do not write package name here */

import java.io.*;

class bubbleSort {
    public static void sort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
           int min_idx=i;
           for(int j=0;j<n-i-1;j++)
           {
               if(arr[j]>arr[j+1])
               {
                    int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
               }
           }
          
        }
    }
	public static void main (String[] args) {
	   int arr[]={5,8,90,1,0,765};
	   int n=arr.length;
	   sort(arr,n);
	   for(int i=0;i<n;i++)
	   {
	       System.out.println(arr[i]);
	   }
	}
}