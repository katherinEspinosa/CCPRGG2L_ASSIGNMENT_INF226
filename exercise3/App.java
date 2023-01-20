public class App {
    public static void main(String[] args) {

        Character knight = new Character();
        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.Attack();

        Weapon Sword = new Weapon ();
        Sword.weaponName = "Sword of Leo";
        Sword.damage = 5;
        Sword.rarity = "Warrior";
        Sword.sayWeaponName();
        Sword.sayWeaponDamage();
        Sword.sayWeaponRarity();
        System.out.println();
        Sword.addDamage(5);
        System.out.println (Sword.NameandRarity());


        System.out.println();
        System.out.println();

        Character mage = new Character();
        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.Attack();

        Weapon staff = new Weapon();
        staff.weaponName = "Wanda";
        staff.damage = 10;
        staff.rarity = "Epic";
        staff.sayWeaponName();
        staff.sayWeaponDamage();
        staff.sayWeaponRarity();
        System.out.println();
        staff.addDamage(5);
        System.out.println (staff.NameandRarity());

        System.out.println();
        System.out.println();

        Character thief = new Character();
        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.Attack();

        Weapon Knife = new Weapon();
        Knife.weaponName = "Flash Blade";
        Knife.damage = 7;
        Knife.rarity = "Master";
        Knife.sayWeaponName();
        Knife.sayWeaponDamage();
        Knife.sayWeaponRarity();
        System.out.println();
        Knife.addDamage(3);
        System.out.println (Knife.NameandRarity());


        System.out.println();
        System.out.println();


        Character archer = new Character();
        archer.strength = 10;
        archer.agility = 6;
        archer.intelligence = 7;
        archer.name = "Azura";
        archer.sayMyName();
        archer.Attack();

        Weapon Bow = new Weapon();
        Bow.weaponName = "Winter Bow";
        Bow.damage = 10;
        Bow.rarity = "Legend";
        Bow.sayWeaponName();
        Bow.sayWeaponDamage();
        Bow.sayWeaponRarity();
        System.out.println();
        Bow.addDamage(10);
        System.out.println (Bow.NameandRarity());

        System.out.println();
        System.out.println ("Submitted by: Katherine Espinosa");
    }
}
