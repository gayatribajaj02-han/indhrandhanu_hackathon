public class BTree {
 static class Node { int n=0; int[] k=new int[3]; Node[] c=new Node[4]; boolean leaf=true; }
 Node root=new Node();
 void split(Node p,int i,Node y){Node z=new Node();z.leaf=y.leaf;z.n=1;z.k[0]=y.k[2];
 if(!y.leaf){z.c[0]=y.c[2];z.c[1]=y.c[3];}
 y.n=1;for(int j=p.n;j>=i+1;j--)p.c[j+1]=p.c[j];p.c[i+1]=z;
 for(int j=p.n-1;j>=i;j--)p.k[j+1]=p.k[j];p.k[i]=y.k[1];p.n++;}
 void insert(int v){Node r=root;if(r.n==3){Node s=new Node();s.leaf=false;s.c[0]=r;root=s;split(s,0,r);add(s,v);}else add(r,v);}
 void add(Node x,int v){int i=x.n-1;if(x.leaf){while(i>=0&&v<x.k[i]){x.k[i+1]=x.k[i];i--;}x.k[i+1]=v;x.n++;}
 else{while(i>=0&&v<x.k[i])i--;i++;if(x.c[i].n==3){split(x,i,x.c[i]);if(v>x.k[i])i++;}add(x.c[i],v);}}
 boolean search(Node x,int v){int i=0;while(i<x.n&&v>x.k[i])i++;if(i<x.n&&v==x.k[i])return true;return !x.leaf&&search(x.c[i],v);}
 void show(Node x){int i;for(i=0;i<x.n;i++){if(!x.leaf)show(x.c[i]);System.out.print(x.k[i]+" ");}if(!x.leaf)show(x.c[i]);}
 public static void main(String[] a){BTree t=new BTree();for(int v:new int[]{10,20,5,6,12,30,7,17})t.insert(v);
 System.out.print("B-Tree traversal: ");t.show(t.root);System.out.println("\nSearch 12: "+t.search(t.root,12));
 System.out.println("Time Complexity: O(log n) search/insert (fixed degree)");System.out.println("Auxiliary Space Complexity: O(log n) recursive search");}
}