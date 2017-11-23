package randomstrings;

import java.util.LinkedList;

/**
 * Created by vvirkkal on 11/23/17.
 */
public class RandomStringStatistics {

    private static final int MIN_LENGTH = 1000;
    private static final int MAX_LENGTH = 10000;

    static LinkedList<String> generateRandomString(long nStrings) {

        LinkedList<String> randomStrings = new LinkedList<String>();
        for(long k = 0; k < nStrings; k++) {
            randomStrings.add(RandomStringGenerator.getRandomString(MIN_LENGTH, MAX_LENGTH));
        }

        return randomStrings;
    }

    static int[] getLengthBounds() {

        return new int[] {MIN_LENGTH, MAX_LENGTH};
    }


    public static void main(String[] args) {

        int[] alphabetBounds = RandomStringGenerator.getAlphabetLimits();
        int[] alphabetCounts = new int[alphabetBounds[1] - alphabetBounds[0] +1];
        LinkedList<String> randomStrings = generateRandomString(10);
        for(String randomString : randomStrings) {
            RandomStringGenerator.accumulateAlphabetCounts(alphabetCounts, randomString);
        }

        for(int k = 0; k < alphabetCounts.length; k++) {
            System.out.println((char)(k + alphabetBounds[0]) + " " + alphabetCounts[k]);
        }
    }
}
