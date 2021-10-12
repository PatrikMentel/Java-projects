/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamecharacters;

/**
 *
 * @author Patko
 */
abstract class Character {
    protected String classOfHero;
    protected String saying;
    
    Character(){
        classOfHero = "Unkown";
    }
    
    void getClassOfHero(){
        System.out.println("Class: " + classOfHero);
    }
    void herosSaying(){
        System.out.println(saying);
    }
    
    int maxHealth;
    int health;
    int damage;
    String attackRange;
    
    abstract void attack(Character ch);
    abstract void heal(Character ch);
}

class Warrior extends Character{
    
    Warrior(){
        this.classOfHero = "Warrior";
        this.saying = "Attack!";
        this.maxHealth = 10;
        this.health = 10;
        this.damage = 2;
        this.attackRange = "short";
    }
    
    @Override
    void attack(Character ch){
        System.out.println(this.saying);
        System.out.println("Attack => -" + this.damage);
        ch.health -= this.damage;
        if(ch.health > 0)
        {
            System.out.println("____________________________________");
            System.out.println("Warrior's health: " + this.health);
            System.out.println("Mage's health: " + ch.health);
            System.out.println("____________________________________");
        } else{
            System.out.println("____________________________________");
            System.out.println("Warrior won!");
            System.out.println("____________________________________");
            GameCharacters.endGame = false;
        }
    }
    @Override
    void heal(Character ch){
        if(this.health < this.maxHealth){
            this.health += 4;
            System.out.println("____________________________________");
            System.out.println("HEALING!");
            System.out.println("Warrior HP: " + this.health);
            System.out.println("____________________________________");
        }
        else{
            System.out.println("____________________________________");
            System.out.println("You have max health!");
            System.out.println("____________________________________");
            attack(ch);
        }
    }
}
class Mage extends Character{
    
    Mage(){
        this.classOfHero = "Mage";
        this.saying = "Fireball!";
        this.maxHealth = 6;
        this.health = 6;
        this.damage = 4;
        this.attackRange = "long";
    }

    @Override
    void attack(Character ch){
        System.out.println(this.saying);
        System.out.println("Attack => -" + this.damage);
        ch.health -= this.damage;
        if(ch.health > 0)
        {
            System.out.println("____________________________________");
            System.out.println("Mage's health: " + this.health);
            System.out.println("Warrior's health: " + ch.health);
            System.out.println("____________________________________");
        } else{
            System.out.println("____________________________________");
            System.out.println("Mage won!");
            System.out.println("____________________________________");
        }
    }
    @Override
    void heal(Character ch){
        if(this.health < this.maxHealth){
            this.health += 2;
            System.out.println("____________________________________");
            System.out.println("HEALING!");
            System.out.println("Mage HP: " + this.health);
            System.out.println("____________________________________");
        }
        else{
            System.out.println("____________________________________");
            System.out.println("You have max health!");
            attack(ch);
        }
    }
}
