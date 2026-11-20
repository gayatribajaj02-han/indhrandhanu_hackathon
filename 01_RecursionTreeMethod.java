public class RecursionTreeMethod {
 static long work=0;
 static void solve(int n){ if(n<=1){work++;return;} work+=n; solve(n/2); solve(n/2); }
 public static void main(String[] x){int n=8;solve(n);
 System.out.println("T(n) = 2T(n/2) + n, n = "+n);
 System.out.println("Illustrative total work = "+work);
 System.out.println("Time Complexity: O(n log n)");
 System.out.println("Auxiliary Space Complexity: O(log n)");}
}