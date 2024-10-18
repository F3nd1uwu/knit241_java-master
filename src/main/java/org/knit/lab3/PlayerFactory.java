package org.knit.lab3;

public class PlayerFactory {
    public Mage createMage(String name) {
        if (name.contains("огр")) {
            Mage mage = new Mage();
            mage.setName(name);
            mage.setMaxHealth(100);
            mage.setNowHealth(100);
            mage.setDmg(25);
            mage.setArmor(5);
            return mage;
        } else {
            Mage mage = new Mage();
            mage.setName(name);
            mage.setMaxHealth(90);
            mage.setNowHealth(90);
            mage.setDmg(20);
            mage.setArmor(5);
            return mage;
        }
    }

    public Warrior createWarrior(String name) {
        if (name.contains("огр")) {
            Warrior warrior = new Warrior();
            warrior.setName(name);
            warrior.setMaxHealth(180);
            warrior.setNowHealth(180);
            warrior.setDmg(20);
            warrior.setArmor(15);
            return warrior;
        } else {
            Warrior warrior = new Warrior();
            warrior.setName(name);
            warrior.setMaxHealth(120);
            warrior.setNowHealth(120);
            warrior.setDmg(15);
            warrior.setArmor(10);
            return warrior;
        }
    }

    public Priest createPriest(String name) {
        if (name.contains("огр")) {
            Priest priest = new Priest();
            priest.setName(name);
            priest.setMaxHealth(120);
            priest.setNowHealth(120);
            priest.setDmg(15);
            priest.setArmor(8);
            return priest;
        } else {
            Priest priest = new Priest();
            priest.setName(name);
            priest.setMaxHealth(100);
            priest.setNowHealth(100);
            priest.setDmg(10);
            priest.setArmor(3);
            return priest;
        }
    }
}
