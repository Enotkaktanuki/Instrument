class Drums implements Instrument {
    double size;

    public Drums(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println(key+"Инструмент Барабан, размер : "+size);
    }
}

 