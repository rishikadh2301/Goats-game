package goats;

public class Fighter extends Goats{
    public final static int FIGHTER_MAX_HEALTH=150;

    public Fighter(String name){
        super(name,FIGHTER_MAX_HEALTH,FIGHTER_MAX_HEALTH);
    }
    public Attack attack(){
        int[] hits={25};
        Attack strike= new Attack("cleave", hits, DamageType.Physical);
        return strike;

    }
    public void takeDamage(Attack attack) {
        int totalDamage=0;
        for (int i=0;i<attack.getHits().length;i++){
            totalDamage+=attack.getHits()[i];
        }
        if(attack.getDamageType().equals(DamageType.Physical))
            totalDamage*=0.75;
        if(attack.getDamageType().equals(DamageType.Magical))
            totalDamage*=1.25;

        if(getCurrentHP()>=totalDamage)
            setCurrentHP(getCurrentHP()-totalDamage);
        else
            setCurrentHP(0);
        
    }
    public static void main(String[] args) {
        Fighter mick=new Fighter("mickey roork");
        Fighter nick=new Fighter("nicolas cage");

        Mage mark=new Mage("Marco");


        System.out.println(nick);
        System.out.println(mick);
        System.out.println(mark);

        Attack a=mark.attack();
        nick.takeDamage(a);
        nick.takeDamage(nick.attack());
        mark.takeDamage(nick.attack());

        System.out.println(nick);
        System.out.println(mick);
        System.out.println(mark);

        combatAreena(mark, nick);

        Goats finn=new Fighter("finn");
        Goats jackie=new Fighter("conan");

   }

   public static void combatAreena(Mage m,Fighter f){
    while (m.isConscious() &&f.isConscious()){
        m.takeDamage(f.attack());
        f.takeDamage(m.attack());

    
    }
    if(m.isConscious())
        System.out.println("winner is"+m.getName());
    else if(f.isConscious())
        System.out.println("winner is"+f.getName());

    else
        System.out.println(" no winner");
   }
        
}

