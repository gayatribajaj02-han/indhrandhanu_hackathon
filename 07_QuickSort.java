import java.util.Arrays;
public class QuickSort{
 static int part(int[]a,int l,int h){int p=a[h],i=l-1;for(int j=l;j<h;j++)if(a[j]<=p){i++;int t=a[i];a[i]=a[j];a[j]=t;}int t=a[i+1];a[i+1]=a[h];a[h]=t;return i+1;}
 static void sort(int[]a,int l,int h){if(l<h){int p=part(a,l,h);sort(a,l,p-1);sort(a,p+1,h);}}
 public static void main(String[]x){int[]a={10,7,8,9,1,5};sort(a,0,a.length-1);System.out.println(Arrays.toString(a));
 System.out.println("Time Complexity: Best/average O(n log n), worst O(n^2)");System.out.println("Auxiliary Space Complexity: Average O(log n), worst O(n)");}
}