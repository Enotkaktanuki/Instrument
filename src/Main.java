public class Main {
    public static void main(String[] args) {


        Guitar guitar = new Guitar(6);
        Drums drums = new Drums(3);
        Trumpet trumpet = new Trumpet(11);

        Instrument[] instruments = new Instrument[]{guitar,drums,trumpet};

        for (Instrument inst: instruments) {
            inst.play();
        }

    }
}