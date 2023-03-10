public class Main {
    public static void main(String[] args) {
        Black_Dragon blackDragon = new Black_Dragon(1000,ColorEnum.BLACK,500,100);
        System.out.println(blackDragon.getInfo());
        Black_Dragon blackDragon1 = new Black_Dragon(1500,ColorEnum.SILVER,300,150);
        System.out.println(blackDragon1.getInfo1());
        House house = new House(2500,ColorEnum.GOLD,200,100,100);
        System.out.println(house.getInfo());
    }
}