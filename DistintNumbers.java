import java.io.*;
import java.util.*;

public class DistintNumbers {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> hs = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++){
            hs.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(hs.size());
    }
}
