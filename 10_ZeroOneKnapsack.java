public class ZeroOneKnapsack{
 public static void main(String[]x){int[]w={1,3,4,5},v={1,4,5,7};int W=7,n=w.length;int[][]dp=new int[n+1][W+1];
 for(int i=1;i<=n;i++)for(int c=0;c<=W;c++)dp[i][c]=w[i-1]<=c?Math.max(v[i-1]+dp[i-1][c-w[i-1]],dp[i-1][c]):dp[i-1][c];
 System.out.println("Maximum value = "+dp[n][W]);System.out.println("Time Complexity: O(nW)");System.out.println("Auxiliary Space Complexity: O(nW)");}
}