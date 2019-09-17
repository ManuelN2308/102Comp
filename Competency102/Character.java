public class Character{
    //attributes
    private int lifePoints;
    private int energy;
    private int attackPoints;
    private int bonusPoints;
    private String name;

    public void setLifePoints(int lifePoints){
        this.lifePoints=lifePoints;
    }
    public int getLifePoints(){
        return lifePoints;
    }
    public void setEnergy(int energy){
        this.energy=energy;
    }
    public int getEnergy(){
        return energy;
    }
    public void setAttackPoints(int attackPoints){
        this.attackPoints=attackPoints;
    }
    public int getAttackPoints(){
        return attackPoints;
    }
    public void setBonusPoints(int bonusPoints){
        this.bonusPoints=bonusPoints;
    }
    public int getBonusPoints(){
        return bonusPoints;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void printCharacter(){
        System.out.println(name + " \n Life Points: " + lifePoints + " \n Energy: " + energy + " \n Attack points:" + attackPoints);
    }

    public Character(String name, int lifePoints, int energy, int attackPoints, int bonusPoints){
        this.name=name;
        this.lifePoints=lifePoints;
        this.energy=energy;
        this.attackPoints=attackPoints;
        this.bonusPoints=bonusPoints;
    }
    public void attack(Character opponent){
        //int lp;
        //int newlp;
        int opponentLP = opponent.getLifePoints();
        int attackP = getAttackPoints();

        System.out.println(name + " is attacking ... " + opponent.getName());

        int newEnergy= opponent.getEnergy() - getAttackPoints();
        opponent.setEnergy(newEnergy);
        opponent.printCharacter();

        if(opponent.getEnergy()<=0){
        //System.out.println(name + "Kills.." + opponent.getName());

        int newLP= opponent.getLifePoints()-1;
        opponent.setLifePoints(newLP);
        opponent.setEnergy(100);
        opponent.printCharacter();
            }
            if(LifePoitns == 0){
                System.out.println(name + "Wins! " + "Game Over");
            }
        
    }
}