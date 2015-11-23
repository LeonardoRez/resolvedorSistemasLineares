/*
 Classe pra lidar com numeros em forma de fração.
 Inicialmente, o objetivo é usá-los em equações de álgebra.
 */
package resolvedorsistemaslineares.model;

public final class Fracao {

    private int numerador, denominador;

    public Fracao() {
        numerador = 0;
        denominador = 1;
    }

    public Fracao(int numerador, int denominador) {
        setNumerador(numerador);
        setDenominador(denominador);
        confereSinal();
    }

    public void setNumerador(int numerador) {
        //testando se numerador é zero
        if (numerador == 0) {
            this.numerador = 0;
            this.denominador = 1;
        } else {
            this.numerador = numerador;
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public void setDenominador(int denominador) {
        //testando se denominador é zero
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero!");
        } else {
            this.denominador = denominador;
        }
    }

    public int getDenominador() {
        return denominador;
    }

    public void confereSinal() {
        //verificando se os dois são negativos
        if (this.numerador < 0 && this.denominador < 0) {
            this.numerador *= (-1);
            this.denominador *= (-1);
        }
    }

    public Fracao simplificar(Fracao f) {
        if (Math.abs(f.numerador) < Math.abs(f.denominador)) {
            for (int i = f.numerador; i > 0; i--) {
                if (f.numerador % i == 0 && f.denominador % i == 0) {
                    return new Fracao(f.numerador / i, f.denominador / i);
                }
            }
        } else {
            for (int i = f.denominador; i > 0; i--) {
                if (f.numerador % i == 0 && f.denominador % i == 0) {
                    return new Fracao(f.numerador / i, f.denominador / i);
                }
            }
        }
        return f;
    }

    public Fracao somarCom(Fracao f2) {
        if (f2.denominador == this.denominador) {
            return new Fracao(this.numerador + f2.numerador, this.denominador);
        } else {
            Fracao resultado = new Fracao();
            resultado.setDenominador(this.denominador * f2.denominador);
            resultado.setNumerador(this.numerador * f2.denominador + f2.numerador * this.denominador);

            return simplificar(resultado);
        }
    }
    public static void main(String[] args) {
        Fracao num = new Fracao(2, 4);
        System.out.println(num.simplificar(num).numerador+"/"+num.simplificar(num).denominador);
    }
}
