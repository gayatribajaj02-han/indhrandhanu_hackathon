import java.util.*;
public class BPlusTree {
 static class N{boolean leaf;ArrayList<Integer> k=new ArrayList<>();ArrayList<N> c=new ArrayList<>();N next;N(boolean l){leaf=l;}}
 N root=new N(true);static final int M=4;
 void split(N p,int i){N y=p.c.get(i),z=new N(y.leaf);int sep;
 if(y.leaf){int mid=y.k.size()/2;z.k.addAll(y.k.subList(mid,y.k.size()));y.k.subList(mid,y.k.size()).clear();z.next=y.next;y.next=z;sep=z.k.get(0);}
 else{int mid=y.k.size()/2;sep=y.k.get(mid);z.k.addAll(y.k.subList(mid+1,y.k.size()));y.k.subList(mid,y.k.size()).clear();z.c.addAll(y.c.subList(mid+1,y.c.size()));y.c.subList(mid+1,y.c.size()).clear();}
 p.k.add(i,sep);p.c.add(i+1,z);}
 void insert(int v){if(root.k.size()==M-1){N s=new N(false);s.c.add(root);split(s,0);root=s;}add(root,v);}
 void add(N x,int v){if(x.leaf){int i=Collections.binarySearch(x.k,v);if(i<0)x.k.add(-i-1,v);return;}
 int i=0;while(i<x.k.size()&&v>=x.k.get(i))i++;if(x.c.get(i).k.size()==M-1){split(x,i);if(v>=x.k.get(i))i++;}add(x.c.get(i),v);}
 boolean search(int v){N x=root;while(!x.leaf){int i=0;while(i<x.k.size()&&v>=x.k.get(i))i++;x=x.c.get(i);}return Collections.binarySearch(x.k,v)>=0;}
 void leaves(){N x=root;while(!x.leaf)x=x.c.get(0);while(x!=null){System.out.print(x.k+" ");x=x.next;}System.out.println();}
 public static void main(String[] a){BPlusTree t=new BPlusTree();for(int v:new int[]{10,20,5,6,12,30,7,17,25})t.insert(v);
 System.out.print("B+ Tree leaves: ");t.leaves();System.out.println("Search 17: "+t.search(17));
 System.out.println("Time Complexity: O(log n) search/insert (fixed order)");System.out.println("Auxiliary Space Complexity: O(log n) insertion recursion");}
}