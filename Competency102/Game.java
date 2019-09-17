public class Game{
    public static void main(String args[]){
        System.out.println("********Welcome to my Video Game Cloud ********");

        Character cloud = new Character("Cloud (C)", 5,100,35,5);
        Character barrett = new Character("Barrett (B)", 7,100,40,7);

        //cloud.setName("Cloud (C)");
        //cloud.setAttackPoints(35);
        //cloud.setEnergy(100);
        //cloud.setBonusPoints(5);
        //cloud.setLifePoints(5);

        //System.out.println(cloud.getName());
        //System.out.println(cloud.getLifePoints());
        //System.out.println(cloud.getEnergy());
        //System.out.println(cloud.getBonusPoints());
        //System.out.println(cloud.getAttackPoints());

        cloud.printCharacter();
        barrett.printCharacter();

        cloud.attack(barrett);
    }
}