public class LCS{
 public static void main(String[]x){String a="AGGTAB",b="GXTXAYB";int m=a.length(),n=b.length();int[][]d=new int[m+1][n+1];
 for(int i=1;i<=m;i++)for(int j=1;j<=n;j++)d[i][j]=a.charAt(i-1)==b.charAt(j-1)?1+d[i-1][j-1]:Math.max(d[i-1][j],d[i][j-1]);
 StringBuilder s=new StringBuilder();int i=m,j=n;while(i>0&&j>0)if(a.charAt(i-1)==b.charAt(j-1)){s.append(a.charAt(i-1));i--;j--;}else if(d[i-1][j]>=d[i][j-1])i--;else j--;
 System.out.println("LCS = "+s.reverse()+", length = "+d[m][n]);System.out.println("Time Complexity: O(mn)");System.out.println("Auxiliary Space Complexity: O(mn)");}
}