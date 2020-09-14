package numerosPares;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        int np = 0;

        for (int i = 1; i <= n; i++) {
            np = i % 2;
            if (np == 0) {
                System.out.println(i);
            }
        }
    }
}
