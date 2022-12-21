import java.util.*;
import java.io.*;

public class cowcollege {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        long l = input.nextLong();
        int n = (int) l;
        long[] arr = new long[n];

        for(int i=0; i<l; i++){
            arr[i] = input.nextLong();
        }

        long[] dupcounts = new long[n];
        long[] costs = new long[n];

        long[] newarr = arr;
        Arrays.sort(newarr);

        for(int i=0; i<l; i++){
            dupcounts[i] = (l-i) * arr[i];
            costs[i] = (l-i) * arr[i];
        }

        Arrays.sort(costs);
        long finalMoney = costs[n-1];
        ArrayList<Long> matchingPrices = new ArrayList<>();
        for(int i=0; i<l; i++){
            if(dupcounts[i] == finalMoney){
                matchingPrices.add(arr[i]);
            }
        }
        Collections.sort(matchingPrices);

        System.out.println(finalMoney + " " + matchingPrices.get(0));
    }
}

