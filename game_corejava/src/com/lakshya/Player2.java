package com.lakshya;

public class Player2 extends Player1 {
    private int health;
    private boolean armor;

    public Player2(String name, String weapon, int health,  boolean armor) {
        super(name, weapon, health);
        this.health = health;
        this.armor = armor;
    }

    @Override
    public void damageByGun1() {
        if(armor)
        {
            this.health -=20;
            if(this.health <=0) this.health =0;
            System.out.println("armor is in .got hit by gun1.health is reduced by 20"+"new health is"+this.health);

        }
        if(!armor)
        {
            this.health -=30;
            if(this.health <=0) this.health =0;
            System.out.println("armor is off .got hit by gun1.health is reduced by 30"+"new health is"+this.health);

        }
        if(this.health ==0)
        {
            System.out.println(getName() +"is dead");
        }
    }

    @Override
    public void damageByGun2() {
        if(armor)
        {
            this.health -=40;
            if(this.health <=0) this.health =0;
            System.out.println("armor is in .got hit by gun1.health is reduced by 40"+"nw health is"+this.health);

        }
        if(!armor)
        {
            this.health -=50;
            if(this.health <=0) this.health =0;
            System.out.println("armor is off .got hit by gun1.health is reduced by 50"+"nw health is"+this.health);

        }
        if(this.health ==0)
        {
            System.out.println(getName() +"is dead");
        }

    }

    @Override
    public void heal() {
        super.heal();
    }
}
