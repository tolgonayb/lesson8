package kg.geektech.les8.players;

import java.util.Random;

public class Thor extends Hero {
    public Thor(int damage, int health, String name) {
        super(damage, health, SuperAbility.SUPERHUMAN_STRENGTH, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

            for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getAbility() != SuperAbility.SUPERHUMAN_STRENGTH) {
                heroes[i].setDamage(heroes[i].getDamage());
            }


                }

            }


        }

        

