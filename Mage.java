package goats;

public class Mage extends Goats{

    
    public Mage(String name) {
        super(name,100,100);
     }
    

    public Attack attack(){ 
        String name="Magic Missiles";
        int[]hits={9,9,9,9};
        DamageType damage=DamageType.Magical;
        Attack strikes=new Attack(name,hits,damage);
        return strikes;
    }

    public void takeDamage(Attack attack){
        
            int hitsToalDamage=0;

            for(int i=0; i<attack.getHits().length;i++){
                hitsToalDamage+=attack.getHits()[i];

            } 
            if (attack.getDamageType()==DamageType.Magical){
                hitsToalDamage*=0.75;
            }
            if(attack.getDamageType()==DamageType.Physical)
            {
                hitsToalDamage*=1.25;
            }


        }
    }




    

