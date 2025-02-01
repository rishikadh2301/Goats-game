package Goats;

public class Attack {
    
    private String name;
    private int[] hits;
    private DamageType damageType;
    /**
     * 
     Attack constructor
     * @param name String input for name
     * @param hits int input for hits
     * @param damageType damagetyoe 
     */
    public Attack(String name,int[] hits, DamageType damageType){
        this.name=name;
        this.hits=hits;
        this.damageType=damageType;
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int[] getHits() {
        return hits;
    }
    public void setHits(int[] hits) {
        this.hits = hits;
    }
    public DamageType getDamageType() {
        return damageType;
    }
    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }
    
    
}
