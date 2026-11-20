import java.util.Arrays;
public class MergeSort{
 static void sort(int[]a,int l,int r){if(l>=r)return;int m=(l+r)/2;sort(a,l,m);sort(a,m+1,r);int[]t=new int[r-l+1];int i=l,j=m+1,k=0;while(i<=m&&j<=r)t[k++]=a[i]<=a[j]?a[i++]:a[j++];while(i<=m)t[k++]=a[i++];while(j<=r)t[k++]=a[j++];for(i=0;i<t.length;i++)a[l+i]=t[i];}
 public static void main(String[]x){int[]a={38,27,43,3,9,82,10};sort(a,0,a.length-1);System.out.println(Arrays.toString(a));
 System.out.println("Time Complexity: O(n log n) all cases");System.out.println("Auxiliary Space Complexity: O(n)");}
}