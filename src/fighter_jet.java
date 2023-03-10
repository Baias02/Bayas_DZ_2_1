public class fighter_jet {
    private int speed;
    private ColorEnum colorEnum;

    public fighter_jet(int speed, ColorEnum colorEnum) {
        this.speed = speed;
        this.colorEnum = colorEnum;
    }

    public int getSpeed() {
        return speed;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }
}

