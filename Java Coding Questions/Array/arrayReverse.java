import java.io.*;

class GFG {
	public static void main (String[] args) {
		int n=4;
		int arr[]={7,8,9,0};
		for(int i=0;i<n/2;i++)
		{
		    int t=arr[i];
		    arr[i]=arr[n-i-1];
		    arr[n-i-1]=t;
		}
		for(int k=0;k<n;k++)
		{
		    System.out.println(arr[k]);
		}
	}
}