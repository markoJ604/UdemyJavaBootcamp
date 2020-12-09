package Section4;

public class Hello {
    public static void main(String[] args) {
        int ageOfClient = 17;
        String isEighteenOrOver = ageOfClient > 20 ? "Yes" : "No";
        System.out.println(isEighteenOrOver);

        double broj = 20.00;
        double broj2 = 80.00;
        double rez1 = (broj + broj2) * 100.00d;
        double ostalo = rez1 % 40.00d;
        boolean jelJe = ostalo == 0;
        System.out.println(jelJe);
        if (!jelJe) System.out.println("Got some remainder.");

        displayHighScorePosition("Marko", calculateHighScorePosition(400));

    }

    public static void displayHighScorePosition (String playersName, int position){
        System.out.println(playersName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition (int playersScore) {
        int position = 4;
        if(playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500){
            position = 2;
        } else if (playersScore > 100){
            position = 3;
        }
        return position;
    }
}
