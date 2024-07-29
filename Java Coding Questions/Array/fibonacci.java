import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int n=10,sum=0,i=0;
	    int firstNo=0;
	    int secondNo=1;
	    while(i<n)
	    {
	    sum=firstNo+secondNo;
	    firstNo=secondNo;
	    secondNo=sum;
	    i++;
	    }
		System.out.println(sum);
	}
}