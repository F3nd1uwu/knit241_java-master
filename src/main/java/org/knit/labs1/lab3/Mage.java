package org.knit.labs1.lab3;

public class Mage extends Player {
    private double healPower = 0;
    private double dmgPower = 1.5;

    @Override
    public void increaseHealth(double healPower) {
        double nowHealth = getNowHealth();
        double maxHealth = getMaxHealth();
        if (nowHealth + healPower <= maxHealth) {
            nowHealth += healPower;
        } else {
            nowHealth = maxHealth;
        }
        setNowHealth(nowHealth);
    }

    @Override
    public void decreaseHealth(double dmgPower) {
        double nowHealth = getNowHealth();
        double dmg = getDmg();
        double armor = getArmor();
        boolean status = isStatus();
        if (nowHealth - (dmg * dmgPower - (armor * 0.2)) <= 0) {
            nowHealth = 0;
            status = false;
            System.out.println("Воин погиб.");
        } else {
            nowHealth -= dmg * dmgPower - (armor * 0.2);
            armor = ((armor <= 1) ? 0 : armor - dmg * dmgPower * 0.1);
        }
        setNowHealth(nowHealth);
        setArmor(armor);
        setStatus(status);
    }

    public void attack(Player player) {
        boolean status = isStatus();
        if (status) {
            player.decreaseHealth(dmgPower);
        } else {
            System.out.println("Вы мертвы.");
        }
    }

    public void heal(Player player) {
        boolean status = isStatus();
        if (status) {
            player.increaseHealth(healPower);
        } else {
            System.out.println("Вы мертвы.");
        }
    }
}
