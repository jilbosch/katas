package katas;

public class Character {
    public static final int MaxHEALTH = 1000;
    public int MaxRange;

    public void setLevel(int num){
        this.level= num;
    };
    private int health = MaxHEALTH;
    private int level = 1;
    private boolean alive= true;

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public boolean isAlive() {
        return alive;
    }
    public int getMaxRange () {
        return MaxRange;
    }
    public void attacksOther (Character victim,int damage){
        if (this==victim)return;

        if (this.level- victim.level>=5){
            victim.damage(victim,damage*2);
            return;
        }
        if (victim.level- this.level>=5){
            victim.damage(victim,damage/2);
            return;
        }
        victim.damage(victim,damage);
    }

    private void damage(Character victim,int damage){
        if (this.health-damage <=0){
            this.alive= false;
            this.health = 0;
            return;
        }
        this.health -= damage;
    }


    public void healOther(Character character, int heal) {
        character.heal(heal);
    }

    private void heal(int heal) {
        if (!this.alive)return;
        this.health += heal;
        int maxhealth = 1000;
        if (this.health> maxhealth)this.health = maxhealth;
    }


    public void range(int i) {
    }
}
