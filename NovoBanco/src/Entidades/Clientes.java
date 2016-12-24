package Entidades;

import java.util.Date;

/**
 *
 * @author KB-01
 */
public class Clientes extends Pessoa {

    private double rendaMensal;
    private int numConta;

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

}
