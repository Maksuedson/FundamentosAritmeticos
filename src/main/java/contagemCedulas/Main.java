package contagemCedulas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        int valor, troco, cem , cinquenta , vinte , dez , cinco , dois , um;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        valor = Integer.parseInt(st.nextToken());

        troco = valor;

        cem = troco / 100;

        troco = troco - (cem *100);

        cinquenta = troco / 50;

        troco = troco - (cinquenta * 50);

        vinte = troco / 20;

        troco = troco - (vinte * 20);

        dez = troco /10;

        troco = troco -(dez * 10);

        cinco = troco / 5;

        troco = troco - (cinco * 5);

        dois = troco / 2;

        troco = troco - (dois * 2);

        // valor,troco, cem , cinquenta , vinte , dez , cinco , dois , um
        System.out.println("Valor = " + valor);
        System.out.println("Cem = " + cem);
        System.out.println("Cinquenta = " + cinquenta);
        System.out.println("Vinte = " + vinte);
        System.out.println("Dez = " + dez);
        System.out.println("Cinco = " + cinco);
        System.out.println("Dois = " + dois);
        System.out.println("Um = " + troco);
    }
}
