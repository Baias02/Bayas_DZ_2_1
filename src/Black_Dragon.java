public class Black_Dragon extends fighter_jet {
    private int defense;
    private int attack;

    public Black_Dragon(int speed, ColorEnum colorEnum, int defense, int attack) {
        super(speed, colorEnum);
        this.defense = defense;
        this.attack = attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getAttack() {
        return attack;
    }
    public String getInfo(){
        return "Speed: " + getSpeed() +
                "\nColor: " + getColorEnum() +
                "\nDefense: " + getDefense() +
                "\nAttack: " + getAttack();
    }
    public final String getInfo1(){
        return "Speed: " + getSpeed() +
                "\nColor: " + getColorEnum() +
                "\nDefense: " + getDefense() +
                "\nAttack: " + getAttack();
    }

}