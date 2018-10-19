/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_r
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Verificacao de correcao da funcao...");
        FenwickTree T = new FenwickTree(3, new FenwickTree(1, new FenwickTree(4),
        new FenwickTree(1, new FenwickTree(2), new FenwickTree(5))),
        new FenwickTree(1, new FenwickTree(3),
        new FenwickTree(1, new FenwickTree(6), new FenwickTree(1))));
        
        System.out.println("Arvore this : " + T);
        System.out.println("Soma das primeiras folhas : ");
        for (int upto = 0; upto <= 6; upto++) {
            System.out.println("prefixSum(" + upto + ") : " + T.prefixSum(upto));
        }
    }

}
