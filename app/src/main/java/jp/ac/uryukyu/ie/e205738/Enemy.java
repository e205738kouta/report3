package jp.ac.uryukyu.ie.e205738;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param hitPoint モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int hitPoint, int attack) {
        super(name ,hitPoint,attack);   
    }
    
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        this.hitPoint -= damage;
        if( this.hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
    /**
     * このファイル外から設定したEnemyクラスの体力値を得るためのメソッド。
     * @return　生成したクラスの体力値
     */
    public int getHitPoint(){
        return this.hitPoint;
    }
}    
    