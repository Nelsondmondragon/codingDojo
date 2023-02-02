package pluzzles;

import java.util.Arrays;
import java.util.Random;

public class PluzzleUtil {
    String[] letter = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z" };

    public int[] getTenRolls() {
        int[] arrayRandom = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) random.nextInt(10) + 1;
        }

        System.out.println(Arrays.toString(arrayRandom));
        return arrayRandom;
    }

    public String getRandomLetter() {
        Random random = new Random();

        return letter[random.nextInt(26) + 1];
    }

    public String generatePassword(int size) {
        String[] characters = new String[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            characters[i] = "";
            for (int j = 0; j < 8; j++) {
                characters[i] += letter[random.nextInt(26)];
            }
        }

        return Arrays.toString(characters);
    }

    public String shuffleArray() {
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int index0 = random.nextInt(26);
            int index1;
            do {
                index1 = random.nextInt(26);

            } while (index1 == index0);

            String temp = letter[index0];
            letter[index0] = letter[index1];
            letter[index1] = temp;
        }

        return Arrays.toString(letter);
    }

}
