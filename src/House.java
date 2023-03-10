public final class House extends Black_Dragon {
    private int stealth;


    public House(int speed, ColorEnum colorEnum, int defense, int attack, int stealth) {
        super(speed, colorEnum, defense, attack);
        this.stealth = stealth;
    }
    public int getStealth() {
        return stealth;
    }

    public String getInfo(){
        return super.getInfo() +
                "\nStealth: " + getStealth();
    }
}
