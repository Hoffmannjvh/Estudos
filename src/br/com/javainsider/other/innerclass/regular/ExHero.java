package br.com.javainsider.other.innerclass.regular;

import br.com.javainsider.other.innerclass.regular.Hero.Weapon;

public class ExHero {

    public static void main(String[] args) {
        Hero hero = new Hero(20);
        Weapon weapon = hero.new Weapon();

        weapon.shoot();
        weapon.shoot();
        weapon.shoot();

        System.out.println(hero.getAmmo());
    }

}
