package consumoCombustivel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int km;
        double totalCombustivel, consumo;

        km = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        totalCombustivel = Double.parseDouble(st.nextToken());
        consumo = km / totalCombustivel;
        System.out.printf("%.3f km/l", consumo);
    }
}
