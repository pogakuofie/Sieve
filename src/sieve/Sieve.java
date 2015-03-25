/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sieve;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author mark woodrow
 */
public class Sieve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("The Sieve of Eratosthenes");        
        Set aSet = new HashSet<>();
        int i, j, limit, halfLimit;

        limit = 10000;
        halfLimit = limit / 2;
        for (i = 0; i < limit; i++) {
            aSet.add(i);
        }
        
        System.out.println("The initial set is : ");        
        System.out.println(aSet);

        for (j = 2; j < halfLimit; j++) {
            for (i = (2*j); i < limit; i += j) {
                aSet.remove(i);
            }
        }

        System.out.println("The sieved set is : ");
        System.out.println(aSet);
    }
}
