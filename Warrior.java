package kg.geektech.les8.players;

import java.util.Random;

public class Warrior extends Hero {


    public Warrior(int damage, int health, String name) {
        super(damage, health, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        Random random = new Random();
        int power = random.nextInt(2) * 4;
        this.setDamage(this.getDamage() * power);
        int i = 0;
        if (heroes[i].getAbility() != SuperAbility.CRITICAL_DAMAGE) {
            heroes[i].setDamage(heroes[i].getDamage() * power);


        }
    }
}
