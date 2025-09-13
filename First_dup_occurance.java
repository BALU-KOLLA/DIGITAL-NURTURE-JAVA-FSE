import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int n = s.nextInt();
	    System.out.println("Enter the element of array :");
	    int[] a = new int[n];
	    for(int i=0;i<n;i++){
	        a[i] = s.nextInt();
	    }
	    System.out.println(occurance(a));
	}
	public static int occurance(int[] a){
	    int mini = Integer.MAX_VALUE;
	    HashMap<Integer,Integer> m = new HashMap<>();
	    for(int i=0;i<a.length;i++){
	        if(m.containsKey(a[i])){
	            mini = Math.min(m.get(a[i]),mini);
	        }
	        else{
	            m.put(a[i],i);
	        }
	    }
	    return mini;
	}
}
