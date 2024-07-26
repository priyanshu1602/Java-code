/*package whatever //do not write package name here */

import java.io.*;

class sieveOfErathenoisis {
    public void sieveOfErathenoisis(int n){
        boolean prime[]=new boolean[n+1];
        int p,i;
        for(i=2;i<=n;i++)
        {
            prime[i]=true;
        }
        for(p=2;p<=n/2;p++)
        {
            if(prime[p]==true)
            {
                for(i=p*p;i<=n;i=i+p)
                {
                    prime[i]=false;
                }
            }
        }
        for(i=2;i<=n;i++)
        {
            if(prime[i]==true)
            {
            System.out.println(i);
            }
        }
    }
	public static void main (String[] args) {
	    int n=41;
	    sieveOfErathenoisis g=new sieveOfErathenoisis();
	    g.sieveOfErathenoisis(n);
	}
}

//If we make sieveOfErathenoisis static then we can call it directly

class SieveOfErathenoisis {
    public static void sieveOfErathenoisis(int n) {
        boolean prime[] = new boolean[n + 1];
        int p, i;
        for (i = 2; i <= n; i++) {
            prime[i] = true;
        }
        for (p = 2; p <= n / 2; p++) {
            if (prime[p] == true) {
                for (i = p * p; i <= n; i = i + p) {
                    prime[i] = false;
                }
            }
        }
        for (i = 2; i <= n; i++) {
            if (prime[i] == true) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 41;
        sieveOfErathenoisis(n); // Direct call without creating an instance
    }
}
