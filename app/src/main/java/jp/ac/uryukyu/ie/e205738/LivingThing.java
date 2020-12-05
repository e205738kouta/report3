package jp.ac.uryukyu.ie.e205738;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing (String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }
    public boolean isDead(){
        return this.dead;
    }
    public String getName(){
        return this.name;
    }
    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if (this.dead==false){
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(double damage){
        this.hitPoint -= damage;
        if( this.hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }


}
