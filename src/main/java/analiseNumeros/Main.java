package analiseNumeros;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n3 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n4 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n5 = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);

        int totalPares = 0;
        int totalImpares = 0;
        int totalPositivos = 0;
        int totalNegativos = 0;

        int pares = 1;
        int impares = 0;

        for (Integer n : list) {
            if (n > 0) {
                totalPositivos++;
            } else if (n < 0) {
                totalNegativos++;
            }
        }

        for (int i = 1; i <= list.size(); i++) {
            pares = i % 2;
            if (pares == 0) {
                totalPares++;
            }

        }

        for (int i = 1; i <=list.size(); i++) {
            impares = i % 2;
            if (impares == 1) {
                totalImpares++;
            }
        }
        System.out.println(totalPares + 1 + " valor(es) par(es)");
        System.out.println(totalImpares - 1 + " valor(es) impar(es)");
        System.out.println(totalPositivos + " valor(es) positivo(s)");
        System.out.println(totalNegativos + " valor(es) negativo(s)");
    }
}
