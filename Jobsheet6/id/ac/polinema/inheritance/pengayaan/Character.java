package Jobsheet6.id.ac.polinema.inheritance.pengayaan;

public class Character {
    protected String name;
    protected int level;
    protected int health;

    public Character(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public void attack(Character target) {
        target.health -= 10;
    }

    public void showStatus() {
        System.out.println("Name: " + name + " | Level: " + level + " | Health: " + health);
    }
}