package cards;

/**
 * Created with IntelliJ IDEA.
 * User: PerkinsE
 * Date: 8/15/13
 * Time: 10:36 AM
 * To change this template use File | Settings | File Templates.
 */

public class Unit extends Card {

    String alliance;
    int attack;
    int defense;
    int health;
    int damageTaken;
    int damage;

    Unit (String alli, int atk, int def, int h, int atkDam)
    {
        alliance = alli;
        attack = atk;
        defense = def;
        health = h;
        damageTaken = atkDam;
        damage = 0;
    }

    public String getAlliance()
    {
        return alliance;
    }


    public int getHealth()
    {
        return health;
    }

    public int getAttack()
    {
        return attack;
    }

    public int getDefense()
    {
        return defense;
    }

    public int getDamageTaken()
    {
        return damageTaken;
    }

    public int getCurrentHealth()
    {
        int currentHealth;
        currentHealth =health - damageTaken;
        return currentHealth;
    }
}
