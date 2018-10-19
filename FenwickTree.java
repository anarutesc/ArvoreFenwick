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
        value = left.value + right.value;
    }

    @Override
    public String toString() {

        String str = "";
        if (esquerda == null && direita == null) {
            str += "[" + value + ", " + leftsize + "]";
        } else {
            str += "[" + value + ", " + leftsize + ", " + esquerda.toString() + ", " + direita.toString() + "]";
        }
        return str;
    }

    int size() {
        if (this.esquerda == null) {
            return 1;
        }
        return this.leftsize + this.direita.size();
    }

    void increment(int i, int delta) {
        if (esquerda == null && direita == null) {
            value += delta;
        } else {
            value += delta;
            if (i < leftsize) {
                esquerda.increment(i, delta);
            } else {
                direita.increment(i - leftsize, delta);
            }
        }
    }

    int prefixSum(int i) {
        if (i != 0) {
            if (leftsize == 0) {
                return value;
            } else {
                if (i < leftsize) {
                    return esquerda.prefixSum(i);
                } else {
                    return esquerda.value + direita.prefixSum(i - leftsize);
                }
            }
        }
        return 0;
    }

    static FenwickTree allZeros(int n) {
        if (n == 0) {
            return null;
        }
        if (n == 1) {
            return new FenwickTree(0);
        }
        int m = n / 2;
        return new FenwickTree(n - m, allZeros(n - m), allZeros(m));
    }

}
