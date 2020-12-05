package jp.ac.uryukyu.ie.e205738;

public class Warrior extends Hero {
    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        double skillDamage=1.5*attack;
        if (this.dead == false) {
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%.1fのダメージを与えた！！", name, opponent.getName(), skillDamage);
            opponent.wounded(skillDamage);
        }

    }
}
