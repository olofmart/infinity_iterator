package ru.olofmart;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    Integer randomInt;

    public Randoms(int min, int max) {
        random = new Random();
        randomInt = random.ints(min,(max+1)).findFirst().getAsInt();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return randomInt++;
            }
        };
    }

}
