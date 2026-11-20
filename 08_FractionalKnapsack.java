import java.util.*;
public class FractionalKnapsack{
 static class Item{int w,v;Item(int w,int v){this.w=w;this.v=v;}double ratio(){return (double)v/w;}}
 public static void main(String[]x){Item[]a={new Item(10,60),new Item(20,100),new Item(30,120)};int cap=50;Arrays.sort(a,(p,q)->Double.compare(q.ratio(),p.ratio()));double ans=0;
 for(Item i:a){int take=Math.min(cap,i.w);ans+=take*i.ratio();cap-=take;if(cap==0)break;}System.out.println("Maximum value = "+ans);
 System.out.println("Time Complexity: O(n log n)");System.out.println("Auxiliary Space Complexity: O(1) extra, excluding sort");}
}