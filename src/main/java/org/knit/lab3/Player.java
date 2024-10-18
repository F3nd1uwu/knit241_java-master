package org.knit.lab3;

public abstract class Player {
    private String name;
    private double nowHealth;
    private double maxHealth;
    private boolean status = true;
    private int posX;
    private int posY;
    private double dmg;
    private double armor;

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getNowHealth() {
        return nowHealth;
    }

    public void setNowHealth(double nowHealth) {
        this.nowHealth = nowHealth;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void increaseHealth(double healPower);

    protected abstract void decreaseHealth(double dmgPower);

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "* Имя = '" + name + '\'' +
                ", Текущее здоровье = " + nowHealth +
                ", Максимальное здоровье = " + maxHealth +
                ", Урон = " + dmg +
                ", Броня = " + armor + " *";
    }
}
