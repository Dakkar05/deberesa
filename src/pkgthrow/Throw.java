package pkgthrow;

import java.util.Scanner;

public class Throw {

    int a = 0, b = 0, r = 0;

    public Throw() {
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void Operacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el primer valor");
        setA(entrada.nextInt());
        System.out.println("ingrese el segundo valor");
        setB(entrada.nextInt());
        if (b == 0) {
            throw new ArithmeticException("no se puede dividir para 0");
        } else {
            setR(getA() / getB());
        }
        System.out.println("la respuesta es "+r);
    }

    public static void main(String[] args) {
        
        }

    }

}
