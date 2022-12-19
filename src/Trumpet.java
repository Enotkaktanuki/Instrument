class Trumpet implements Instrument {
    double diameter;

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println(key+"Инструмент Труба, диаметр : "+diameter);
    }
}