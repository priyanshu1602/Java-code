import java.io.*;

class selectionSort {
    void sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
           int min_idx=i;
           for(int j=i+1;j<n;j++)
           {
               if(arr[j]<arr[min_idx])
               {
                   min_idx=j;
               }
           }
           int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
	public static void main (String[] args) {
	   int arr[]={5,8,90,1,0,765};
	   int n=arr.length;
	   selectionSort obj=new selectionSort();
	   obj.sort(arr);
	   for(int i=0;i<n;i++)
	   {
	       System.out.println(arr[i]);
	   }
	}
}