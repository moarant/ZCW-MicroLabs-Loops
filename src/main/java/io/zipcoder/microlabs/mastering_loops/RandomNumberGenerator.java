package io.zipcoder.microlabs.mastering_loops;

import java.util.Random;

/**
 * Created by mollyarant on 5/9/17.
 */
public class RandomNumberGenerator {
    /**
     * @param min - lower bound for the random number
     * @param max - upper bound for the random number
     * @return random number between specified min and max values
     */
    public int randInt(int min, int max) {
        return new Random().nextInt() * (max - min) + min;
    }
}
