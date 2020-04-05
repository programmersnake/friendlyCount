package friendly_counts;

import java.util.HashMap;
import java.util.Scanner;

public class Friends_Counts {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap();
        Scanner scan = new Scanner(System.in);
        int firstCount=scan.nextInt();
        int secondCount=scan.nextInt();
        for(int i=firstCount;i<secondCount;i++)
            for(int j=firstCount+1;j<=secondCount;j++)
                if(sumDelit(i,j)&&sumDelit(j,i))
                    if(i!=j)
                        map.put(i, j);
        if(!map.isEmpty())
            System.out.println(map);
        else
            System.out.println("Absent");
    }
    
    static boolean sumDelit(int f, int s){
        int sum=0;
        for(int i=(f-1);i>0;i--)
            if((f%i)==0)
                sum+=i; 
        return sum==s;
    }
}
