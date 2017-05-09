package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mollyarant on 5/9/17.
 */
public class RandomNumberGeneratorTest {

    @Test
    public void testRandInt() {
        // : Given
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int minBound = 0;
        int maxBound = 100;

        // : When
        int randomNumber = rng.randInt(minBound, maxBound);

        // : Then
        boolean outcome = isInRange(randomNumber, minBound, maxBound);
        Assert.assertTrue(outcome);
    }

    boolean isInRange(int randomNumber, int minBound, int maxBound){
        if(randomNumber>= minBound && randomNumber<=maxBound){
            return true;
        }
        else{
            return false;}
        }

    }

