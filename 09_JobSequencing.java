import java.util.*;
public class JobSequencing{
 static class Job{String id;int d,p;Job(String i,int d,int p){id=i;this.d=d;this.p=p;}}
 public static void main(String[]x){Job[]a={new Job("J1",2,100),new Job("J2",1,19),new Job("J3",2,27),new Job("J4",1,25),new Job("J5",3,15)};
 Arrays.sort(a,(p,q)->q.p-p.p);int d=0;for(Job j:a)d=Math.max(d,j.d);String[]s=new String[d+1];int profit=0;
 for(Job j:a)for(int k=Math.min(d,j.d);k>0;k--)if(s[k]==null){s[k]=j.id;profit+=j.p;break;}
 System.out.print("Scheduled jobs: ");for(int k=1;k<=d;k++)if(s[k]!=null)System.out.print(s[k]+" ");System.out.println("\nTotal profit = "+profit);
 System.out.println("Time Complexity: O(n log n + nD)");System.out.println("Auxiliary Space Complexity: O(D)");}
}