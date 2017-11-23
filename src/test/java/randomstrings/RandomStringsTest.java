package randomstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vvirkkal on 11/23/17.
 */
public class RandomStringsTest {

    @Test
    public void testRandomStringOnlyAlpha() {

        int[] lengthBounds = RandomStringStatistics.getLengthBounds();
        String randomString = RandomStringGenerator.getRandomString(lengthBounds[0], lengthBounds[1]);
        Assert.assertTrue(randomString.matches("[a-z]+"));
    }

    @Test
    public void testRandomStringLength() {

        int[] lengthBounds = RandomStringStatistics.getLengthBounds();
        String randomString = RandomStringGenerator.getRandomString(lengthBounds[0], lengthBounds[1]);
        Assert.assertTrue(randomString.length() >= lengthBounds[0] && randomString.length() <= lengthBounds[1]);
    }
}
