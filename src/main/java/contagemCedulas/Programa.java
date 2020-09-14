package contagemCedulas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Programa {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int saque, troco, cem, cinquenta, vinte, dez, cinco, dois, um;

        saque = Integer.parseInt(st.nextToken());

        cem = saque / 100;
        troco = saque - (cem * 100);
        cinquenta = troco / 50;
        troco = saque - ((cem *100) + (cinquenta * 50));
        vinte = troco / 20;
        troco = saque - ((cem *100) + (cinquenta * 50) + (vinte * 20));
        dez = troco / 10;
        troco = saque - ((cem *100) + (cinquenta * 50) + (vinte * 20) + (dez * 10));
        cinco = troco / 5;
        troco = saque - ((cem *100) + (cinquenta * 50) + (vinte * 20) + (dez * 10) + (cinco * 5));
        dois = troco / 2;
        troco = saque - ((cem *100) + (cinquenta * 50) + (vinte * 20) + (dez * 10) + (cinco * 5) + (dois * 2));
        um = troco / 1;

        System.out.println(saque);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");

    }
}
