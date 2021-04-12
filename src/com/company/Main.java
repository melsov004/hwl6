package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(90);
        Weapon weapon = new Weapon();
        weapon.setNameOfWeapon("AK-47");
        weapon.setTypeOfWeapon("FireArms");
        boss.setWeapon(weapon);

        Skeleton skeleton = new Skeleton();
        skeleton.setQuantityOfArrows(50);
        skeleton.setHealth(200);
        skeleton.setDamage(60);
        Weapon weapon1 = new Weapon();
        weapon1.setTypeOfWeapon("SmallArms");
        weapon1.setNameOfWeapon("Bow");
        skeleton.setWeapon(weapon1);


        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(190);
        skeleton1.setDamage(20);
        skeleton1.setQuantityOfArrows(30);
        Weapon weapon2 = new Weapon();
        weapon2.setTypeOfWeapon("SmallArms");
        weapon2.setNameOfWeapon("Arbalet");
        skeleton1.setWeapon(weapon2);

        System.out.println("Boss\n"+boss.printInfo() +"\nSkeleton\n" + skeleton.printInfo() + "\nSkeleton2\n "  + skeleton1.printInfo());
    }
}
