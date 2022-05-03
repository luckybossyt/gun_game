package com.lakshya;

public class Main {
    public static void main(String[] args)
    {
        Player1 player = new Player1( "LAKSHYA", "sword",100);
        System.out.println(player.getName());
        System.out.println(player.getHealth());
        System.out.println(player.getWeapon());

         player.damageByGun1();
         player.damageByGun1();
         player.heal();
         player.damageByGun2();

         Player2  Betterpalyer =new Player2("lucky","machine gun",80 ,false);

        System.out.println(player.getName());
        System.out.println(player.getHealth());
        System.out.println(player.getWeapon());
        Betterpalyer.damageByGun1();
        player.heal();
        Betterpalyer.damageByGun2();

    }

}
