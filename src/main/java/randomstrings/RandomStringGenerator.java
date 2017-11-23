package randomstrings;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by vvirkkal on 11/23/17.
 */
public class RandomStringGenerator {

    private static final int MIN_ALBHABET = 97;
    private static final int MAX_ALBHABET = 122;

    static String getRandomString(int minLength, int maxLength) {

        int randomStringLength = ThreadLocalRandom.current().nextInt(minLength, maxLength + 1);
        return generateRandomString(randomStringLength);
    }

    static String generateRandomString(int length) {

        StringBuffer randomStringGenerator = new StringBuffer();

        for (int k = 0; k < length; k++) {

            randomStringGenerator.append(generateRandomCharacter());
        }

        return randomStringGenerator.toString();
    }

    static char generateRandomCharacter() {

        return (char) ThreadLocalRandom.current().nextInt(MIN_ALBHABET, MAX_ALBHABET + 1);
    }

    static int[] getAlphabetLimits() {

        return new int[]{MIN_ALBHABET, MAX_ALBHABET};
    }

    static void accumulateAlphabetCounts(int[] alphabetCounts, String randomString) {

        for (int k = 0; k < randomString.length(); k++) {
            alphabetCounts[randomString.charAt(k) - MIN_ALBHABET]++;
        }
    }
}

