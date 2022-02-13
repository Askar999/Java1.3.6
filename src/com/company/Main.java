package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(50);
        boss.weapons.setWeaponsType("massive");
        boss.weapons.setWeaponsName("bomb");
        System.out.println(boss.Info());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(300);
        skeleton1.setDamage(20);
        skeleton1.weapons.setWeaponsType("distance");
        skeleton1.weapons.setWeaponsName("Fire");
        skeleton1.setArrow(25);
        System.out.println(skeleton1.Info());

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(320);
        skeleton2.setDamage(25);
        skeleton2.weapons.setWeaponsType("distance");
        skeleton2.weapons.setWeaponsName("SuperFire");
        skeleton2.setArrow(30);
        System.out.println(skeleton2.Info());
    }
}
//ДЗ:
//        ● В Main распечатать информацию о Боссе с помощью метода printInfo, также
//        создать 2 экземпляра скелета и заполнить данными) затем распечатать всю
//        информацию о скелетах.