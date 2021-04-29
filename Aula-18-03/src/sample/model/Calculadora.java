package sample.model;

public class Calculadora {

    //Atributos
    private double a;
    private double b;
    private double c;
    private double resultado;

    //Construtor
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void somar(double a, double b){
        this.resultado = (a+ b) ;
        this.a = a;
        this.b = b;
    }
    public void somar(double a, double b, double c){
        this.resultado = (a+ b+c) ;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void subtrair(double a, double b){
        this.resultado = (a- b) ;
        this.a = a;
        this.b = b;
    }
    public void subtrair(double a, double b, double c){
        this.resultado = (a-b-c) ;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void multiplicar(double a, double b){
        this.resultado = (a* b) ;
        this.a = a;
        this.b = b;
    }
    public void multiplicar(double a, double b, double c){
        this.resultado = (a* b*c) ;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void dividir(double a, double b){
        this.resultado = (a/ b) ;
        this.a = a;
        this.b = b;
    }
    public void dividir(double a, double b, double c){
        this.resultado = (a/ b/c) ;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Calculadora"+
                ((a == 0)? "":"\na = "+a)+
                ((b == 0)? "":"\nb = "+b)+
                ((c == 0)? "":"\nc = "+c)+
                "\nResultado: " + resultado+"\n\n"
                ;
    }
}
