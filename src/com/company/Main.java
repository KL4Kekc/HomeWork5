package com.company;

public class Main {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.health = 500;
        hero.damage = 30;
        hero.specialAttack = hero.damage * 5;
        System.out.println(hero.damage + " " + hero.health + " " + hero.specialAttack);

        Boss boss = new Boss();
        boss.setBossHealth(1500);
        boss.setBossDamage(80);
        boss.setBossDefence(25);
        System.out.println(boss.getBossHealth() + " " + boss.getBossDamage() + " " + boss.getBossDefence());
        boss.changeBossDefence();

    }
}
