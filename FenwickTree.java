/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_r
 */
public class FenwickTree {

    private String err = "Deu erro.";
    private String str = "";
    private int sum = 0;
    int value;
    int leftsize;
    FenwickTree direita;
    FenwickTree esquerda;

    FenwickTree(int value) {
        this.value = value;
    }

    FenwickTree(int leftSize, FenwickTree left, FenwickTree right) {
        leftsize = leftSize;
        esquerda = left;
        direita = right;

    }

    @Override
    public String toString() {

        if (esquerda == null && direita == null) {
            str += "[" + value + " " + leftsize + "]";
            return str;
        } else {
            str += "[" + value + " " + leftsize + " ";
            if (leftsize == 0) {
                str += esquerda.toString();
            } else {
                str += direita.toString();
            }
        }
        return str;
    }

    int size(FenwickTree no) {
        if (no.esquerda == null) {
            return 1;
        }
        return no.leftsize + size(no.direita);
    }

    void increment(int i, int delta) {
        if (i < leftsize) {
            esquerda.increment(i, delta);
        } else {
            direita.increment(i - leftsize, delta);
        }
    }

    int prefixSum(int i, FenwickTree t) {
        if (t.leftsize == 0) {
            sum += t.value;
            return sum;
        } else {
            return t.prefixSum(t.leftsize, t.esquerda) + t.prefixSum(i - t.leftsize, t.direita);
        }
    }

}
