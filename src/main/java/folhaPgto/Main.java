package folhaPgto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int id = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int horasTrabalhadas = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valorPorHora = Double.parseDouble(st.nextToken());

        double salary = horasTrabalhadas * valorPorHora; // Altere o valor da variável com o cálculo esperado
        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f", salary);
    }
}
