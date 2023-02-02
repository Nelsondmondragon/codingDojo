package pluzzles;

public class PluzzleTest {

    public static void main(String[] args) {
        PluzzleUtil appPluzz = new PluzzleUtil();
        appPluzz.getTenRolls();

        System.out.println(appPluzz.getRandomLetter());

        System.out.println(appPluzz.generatePassword(3));

        System.out.println(appPluzz.shuffleArray());
    }

}
