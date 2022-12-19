class Guitar implements Instrument {
    int countString;

    public Guitar(int countString) {
        this.countString = countString;
    }

    @Override
    public void play(){
        System.out.println(key+"Инструмент Гитара, количество струн : "+countString);
    }
}