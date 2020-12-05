package jp.ac.uryukyu.ie.e205738;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    /**attackWithWeponSkillがしっかり150%のダメージになっているのかの確認
     */
    @Test
    void attackWithWeponSkillTest(){
        int enemyHp=15;//攻撃力10の150%のダメージ
        Warrior demoWarrir=new Warrior("デモ戦士", 100, 10);
        Enemy demoenEnemy1=new Enemy("サンドバッグ1", enemyHp, 0);
        Enemy demoenEnemy2=new Enemy("サンドバッグ2", enemyHp, 0);
        Enemy demoenEnemy3=new Enemy("サンドバッグ3", enemyHp, 0); 
        Enemy [] enemies={demoenEnemy1,demoenEnemy2,demoenEnemy3};
        for (Enemy e : enemies){
            demoWarrir.attackWithWeponSkill(e);
        }
        assertEquals(demoenEnemy1.hitPoint,0);
        assertEquals(demoenEnemy2.hitPoint,0);
        assertEquals(demoenEnemy3.hitPoint,0);
    
    }     
}
