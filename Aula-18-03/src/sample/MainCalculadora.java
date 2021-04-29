package sample;
import sample.model.Calculadora;

public class MainCalculadora {

    public static void main(String[] args) {
            Calculadora soma1 = new Calculadora();
            soma1.somar(5,5);
            System.out.println(soma1);

            Calculadora soma2 = new Calculadora();
            soma2.somar(3,7,21);
            System.out.println(soma2);

            Calculadora sub1 = new Calculadora();
            sub1.subtrair(10,50);
            System.out.println(sub1);

            Calculadora sub2 = new Calculadora();
            sub2.subtrair(10,20,30);
            System.out.println(sub2);

            Calculadora mult1 = new Calculadora();
            mult1.multiplicar(5,3);
            System.out.println(mult1);

            Calculadora mult2 = new Calculadora();
            mult2.multiplicar(2,3,4);
            System.out.println(mult2);

            Calculadora div1 = new Calculadora();
            div1.dividir(2,5);
            System.out.println(div1);

            Calculadora div2 = new Calculadora();
            div2.dividir(16,5,2);
            System.out.println(div2);

    }
}
