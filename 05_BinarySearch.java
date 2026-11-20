public class BinarySearch{
 static int find(int[]a,int l,int r,int x){if(l>r)return -1;int m=l+(r-l)/2;if(a[m]==x)return m;return x<a[m]?find(a,l,m-1,x):find(a,m+1,r,x);}
 public static void main(String[]z){int[]a={10,20,30,40,50,60};int x=40;System.out.println("Element "+x+" at index "+find(a,0,a.length-1,x));
 System.out.println("Time Complexity: Best O(1), average/worst O(log n)");System.out.println("Auxiliary Space Complexity: O(log n) recursive");}
}