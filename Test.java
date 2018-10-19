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
        System.out.println("Construcao de FenwickTree(3) : " + new FenwickTree(3));
        System.out.println("Construcao da arvore da figura : "
                + new FenwickTree(3, new FenwickTree(1, new FenwickTree(4),
                        new FenwickTree(1, new FenwickTree(2), new FenwickTree(5))),
                        new FenwickTree(1, new FenwickTree(3),
                        new FenwickTree(1, new FenwickTree(6), new FenwickTree(1)))));
    }

}
