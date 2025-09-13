/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int n = s.nextInt();
	    System.out.println("enter the required sum");
	    int k = s.nextInt();
	    System.out.println("Enter the element of array :");
	    int[] a = new int[n];
	    for(int i=0;i<n;i++){
	        a[i] = s.nextInt();
	    }
	    System.out.println("Sum pairs with the value "+k+" are "+Pair(a,k));
	}
	public static int Pair(int[] a,int v){
	    int paircount = 0;
	    for(int i=0;i<a.length-1;i++){
	        int p = a[i];
	        for(int j=i;j<a.length;j++){
	            if(p+a[j]==v){
	                paircount++;
	            }
	        }
	    }
	    return paircount;
	}
}
