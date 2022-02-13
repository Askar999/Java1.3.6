package com.company;

public class Boss extends GameEntity {
    Weapon weapons = new Weapon();

    public Weapon getWeapon() {
        return weapons;
    }

    public void setWeapon(Weapon weapon) {
        this.weapons = weapon;
    }

    public String Info() {
        return "Health of boss:"+getHealth() + " Damage of boss:"+getDamage()+
                " WeaponsType:"+ this.weapons.getWeaponsType() + " WeaponsName:"+
                this.weapons.getWeaponsName();
    }
}
