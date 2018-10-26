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
        FenwickTree T = new FenwickTree(3, new FenwickTree(1, new FenwickTree(4),
                new FenwickTree(1, new FenwickTree(2), new FenwickTree(5))),
                new FenwickTree(1, new FenwickTree(3),
                        new FenwickTree(1, new FenwickTree(6), new FenwickTree(1))));
        System.out.println("Arvore this : " + T);
        System.out.println("Soma das folhas entre lo e hi : ");
        System.out.print(" ");
        for (int lo = 0; lo <= 6; lo++) {
            System.out.print("lo = " + lo + " ");
        }
        System.out.println();
        for (int hi = 0; hi <= 6; hi++) {
            System.out.print("hi = " + hi + " ");
            for (int lo = 0; lo <= hi; lo++) {
                System.out.print(T.between(lo, hi) + " ");
                if (T.between(lo, hi) < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
