import java.util.*;
import java.io.*;

public class Q2798 {
    public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
            StringTokenizer st = new StringTokenizer(br.readLine());
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            for (int i = 0 ; i< n-2; i++){
                for(int j = i+1; j < n-1; j++){
                    for(int k = j+1; k < n; k++){
                        if (sum < arr[i] + arr[j] + arr[k] && arr[i] + arr[j] + arr[k] <= m ){
                            sum = arr[i] + arr[j] + arr[k];
                        }
                    }
            }
        }
            
            bw.write(String.valueOf(sum));
            bw.flush();
            bw.close();
    } 
 }
