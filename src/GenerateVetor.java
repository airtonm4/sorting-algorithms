import java.util.Random;

/**
 * GenerateVetor, class to generate the dataset.
 */
public class GenerateVetor {
    public int[] oneThousand = new int[1000];
    public int[] twoThousand = new int[2000];
    public int[] threeThousand = new int[3000];
    public int[] fourThousand = new int[4000];
    public int[] fiveThousand = new int[5000];
    public int[] sixThousand = new int[6000];
    public int[] sevenThousand = new int[7000];
    public int[] eightThousand = new int[8000];
    public int[] nineThousand = new int[9000];
    public int[] tenThousand = new int[10000];
    public int[] big = new int[100000];

    public GenerateVetor() {
        this.generateOneThousand();
        this.generateTwoThousand();
        this.generateThreeThousand();
        this.generateFourThousand();
        this.generateFiveThousand();
        this.generateSixThousand();
        this.generateSevenThousand();
        this.generateEightThousand();
        this.generateNineThousand();
        this.generateTenThousand();
        this.generateBig();
    }

    private void generateOneThousand() {
        Random numberRandom = new Random();

        for (int i = 0; i < oneThousand.length; i++) {
            this.oneThousand[i] = numberRandom.nextInt();
        }

    }

    private void generateTwoThousand() {
        Random numberRandom = new Random();

        for (int i = 0; i < twoThousand.length; i++) {
            this.twoThousand[i] = numberRandom.nextInt();
        }
    }

    private void generateThreeThousand() {
        Random numberRandom = new Random();

        for (int i = 0; i < threeThousand.length; i++) {
            this.threeThousand[i] = numberRandom.nextInt();
        }
    }

    private void generateFourThousand() {
        Random numberRandom = new Random();

        for (int i = 0; i < fourThousand.length; i++) {
            this.fourThousand[i] = numberRandom.nextInt();
        }
    }

    private void generateFiveThousand() {
        Random numberRandom = new Random();

        for (int i = 0; i < fiveThousand.length; i++) {
            this.fiveThousand[i] = numberRandom.nextInt();
        }
    }

    private void generateSixThousand() {
        Random numberRandom = new Random();

        for (int i = 0; i < sixThousand.length; i++) {
            this.sixThousand[i] = numberRandom.nextInt();
        }
    }

    private void generateSevenThousand() {
        Random numberRandom = new Random();

        for (int i = 0; i < sevenThousand.length; i++) {
            this.sevenThousand[i] = numberRandom.nextInt();
        }
    }

    private void generateEightThousand() {
        Random numberRandom = new Random();

        for (int i = 0; i < eightThousand.length; i++) {
            this.eightThousand[i] = numberRandom.nextInt();
        }
    }

    private void generateNineThousand() {
        Random numberRandom = new Random();

        for (int i = 0; i < nineThousand.length; i++) {
            this.nineThousand[i] = numberRandom.nextInt();
        }
    }

    private void generateTenThousand() {
        Random numberRandom = new Random();

        for (int i = 0; i < tenThousand.length; i++) {
            this.tenThousand[i] = numberRandom.nextInt();
        }
    }

    private void generateBig() {
        Random numberRandom = new Random();

        for (int i = 0; i < big.length; i++) {
            this.big[i] = numberRandom.nextInt();
        }

    }
}