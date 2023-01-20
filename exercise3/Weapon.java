public class Weapon {

    String weaponName;
    int damage;
    String rarity;
    
    public void sayWeaponName() {
        System.out.println ("My "+ weaponName  +" will lead you to your death");
}
    public void sayWeaponRarity() {
        System.out.print("Rarity: "+ rarity );
}

    public void sayWeaponDamage () {
        System.out.println ("Damage: "+ damage);
    }


    void addDamage (int additionalDamage) {
        int addDamage = this.damage + additionalDamage;
        System.out.println("Weapon damage has increased from "+ this.damage +" to "+ addDamage);
        this.damage = addDamage;
        return;
    }


    String NameandRarity () {
        String nameandrarity = "Weapon Name: "+ this.weaponName +" ," +" Rarity: "+this.rarity;
        return nameandrarity;
    }
    
}

