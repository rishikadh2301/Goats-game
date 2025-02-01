package Goats;

public abstract class Goats{
    private String name;
    private int maxHP;
    private int currentHP;

    public Goats(String name,int maxHP,int currentHP){
        this.name=name;
        this.maxHP=maxHP;
        this.currentHP=currentHP;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public boolean isConscious(){
        return currentHP>0;
    }
/**
 * increases current HP, heals goat up to max health allowed.
 * @param amount to heal:int
 */
    public void heal(int amount){
        if(currentHP+amount>maxHP){
            currentHP=maxHP;
        }
        else{
            currentHP+=amount;
        }
    }

@Override
public String toString() {
    return "Goats [name=" + name + ", max health power=" + maxHP + ", current Health power=" + currentHP + "]";
}
abstract public Attack attack();
abstract public void takeDamage(Attack attack);

}