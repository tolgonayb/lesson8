package kg.geektech.les8.players;

public class Hunter extends Hero {

    public Hunter(int damage, int health, String name) {
        super(damage, health, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        this.setDamage(boss.getDamage() + this.getDamage());
      boss.setHealth(boss.getHealth()+(2)/this.getDamage());




    }
}
