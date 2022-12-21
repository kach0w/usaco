import java.util.*;
import java.io.*;

public class feedcows {
    public static void main(String args[]) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(r.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String str = r.readLine();
            feed(n, k, str);
        }
    }

    public static void feed(int n, int k, String str) {
        if (k == 0) {
            System.out.println(n);
            System.out.println(str);
        } else {
            int count = 0;
            char[] output = new char[n];
            for(int i=0; i<n; i++){
                output[i] = '.';
            }

            int next = 0;
            for (int i = 0; i < n; i++) {
                if (i+k+1 > k) {
                    next = Math.min(i+k, n-1);
                    if(output[next] != '.')
                        next--;
                    output[next] = str.charAt(i);
                    count++;
                }
            }

            System.out.println(count);
            System.out.println(output);
        }
    }
}
