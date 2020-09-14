package qtdeNumerosPositivos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Início");

        List<Double> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double n1 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double n2 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double n3 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double n4 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double n5 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double n6 = Double.parseDouble(st.nextToken());

        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);
        list.add(n6);

        int total = 0;

        for (Double n : list) {
            if (n >= 0) {
                total++;
            }
        }

        System.out.println(total + " valores positivos");

        }
    }

