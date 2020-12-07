package jp.ac.uryukyu.ie.e205738;

/**
 * ヒーロークラス。 String name; //敵の名前 int hitPoint; //敵のHP int attack; //敵の攻撃力 boolean
 * dead; //敵の生死状態。true=死亡。 Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * 
     * @param name     ヒーロー名
     * @param hitPoint ヒーローのHP
     * @param attack   ヒーローの攻撃力
     */
    public Hero(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * 
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(double damage) {
        this.hitPoint -= damage;
        if( this.hitPoint <= 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
    
    /**
     * このファイル外から設定したHeroクラスの体力値を得るためのメソッド。
     * @return　生成したクラスの体力値
     */
    public int getHitPoint(){
        return this.hitPoint;
    }
    
}