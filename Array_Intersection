import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i=0;
        System.out.println("Enter the array size (consider equal sized arrays)");
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter element 1 arrays");
        for(i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        System.out.println("Enter element 2 arrays");
        for(i=0;i<n;i++){
            b[i] = s.nextInt();
        }
        HashSet<Integer> hash = new HashSet<>();
        for(int num:a){
            hash.add(num);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int a1:b){
            if(hash.contains(a1)){
                al.add(a1);
                hash.remove(a1);
            }
        }
        System.out.println("Intersection elements:");
        for (int i1:al){
            System.out.println(i1+" ");
        }
    }
}
