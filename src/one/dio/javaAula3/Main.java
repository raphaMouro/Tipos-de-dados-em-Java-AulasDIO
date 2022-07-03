package one.dio.javaAula3;

/**
 * Classe de exemplo para o exercicio da aula 3 de Variaveis, tipos de dados e operadores aritmeticos
 */

public class Main {

    public static void main (String[] args) {

        System.out.println("Prepo");
        prepos();
        System.out.println("aritmetico");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("precedencia");
        precedencia();

    }

    private static void prepos() {
        int k = 10;
        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);
    }
    private static void aritmetico() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b é igual a: " + r1);
        System.out.println("c-a é igual a: " + r2);
        System.out.println("d*b é igual a: " + r3);
        System.out.println("e/a é igual a: " + r4);
        System.out.println("c%b é igual a: " + r5);

    }

    private static void atribuicao() {
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5F;
        double d = f;

        System.out.println("d:" +d);

        i += 5; // i = i +5
        j -= 3; // j = j - 3
        d /= 2.7d; // d =d / 2.7d
        l += 3; // l = l * 3
        k %= 2; // k = k % 2

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("d:" + d);
        System.out.println("l:" + l);
        System.out.println("k:" + k);

        i = k = j;

        System.out.println("k:" + k);
        System.out.println("i:" +i);

    }

    private static void precedencia() {
        int i = 3;
        int a = 10;
        int b = 5;
        int c = 2;

        int a = --i + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580

        System.out.println("i++ + --j * k: " + a);
        System.out.println("i: " + i); // 11
    }
}
