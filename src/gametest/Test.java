package gametest;

import gametest.Object.Apple;
import gametest.Object.Meat;
import gametest.Person.Hero;
import gametest.Person.Rat;
import gametest.Weapon.OldBlade;
import gametest.Weapon.Stick;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        System.out.println("Приветствую, касипоша... ");
        Hero hero = new Hero("kosiposha",10,50,0);
        System.out.println("Ты стоишь перед входом в подземелье.");
        System.out.println("1-войти   2-ну его нахуй");

        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();
        if(number1 == 1){
            System.out.println("Ты вошел в подземелье.");
        }else if(number1 == 2){
            System.out.println("Ты убежал.");
            System.exit(0);
        }else{
            System.out.println("end... run program again.");
            System.exit(0);
        }
        System.out.println("Ты видишь на полу дубинку.");
        Stick stick = new Stick("Stick",20);
        System.out.println("1- подобрать дубинку   2- пройти мимо");

        Scanner sc2 = new Scanner(System.in);
        int number2 = sc2.nextInt();
        if(number2 == 1){
            System.out.println("Ты поднял дубинку, не идеально, но лучше чем ничего.");
            Integer damage3 = stick.getWeaponDamage();
            Integer damage4 = hero.getDamage();
            Integer c = damage3 + damage4;
            hero.setDamage(c);
            System.out.println(hero);
        }else if(number2 == 2){
            System.out.println("Ты решил не поднимать дубинку, найдешь чтото получше.");
        }else{
            System.out.println("end... run program again.");
            System.exit(0);
        }

        System.out.println("Чуть дальше по коридору ты видишь крысу.");
        Rat rat = new Rat("Rat",10,20);

        Integer damage1 = hero.getDamage();
        Integer health1 = hero.getHealth();
        Integer damage2 = rat.getDamage();
        Integer health2 = rat.getHealth();
        Integer a = health1 - damage2;
        Integer b = health2 - damage1;

        if(a <= 0){
            System.out.println("Вы проиграли!");
        }else if(b <= 0) {
            System.out.println("Вы победили!");
            hero.setHealth(a);
            hero.setExp(10);
            System.out.println(hero);
        }else{
            System.out.println("Ошибка");
            System.exit(0);
        }
        System.out.println("Ты входишь в следующию комнату.");
        System.out.println("Ты видишь сундук, внутри лежит ");
        if (Math.random() >= 0.5){
            Apple apple = new Apple("Яблоко",10);
            System.out.println(apple.getName());
            Integer health5 = hero.getHealth();
            Integer hill1 = apple.getHealthUp();
            Integer c = health5 +hill1;
            hero.setHealth(c);
            System.out.println("Ты ешь яблоко + 10 hp");
            System.out.println(hero);
        }else if(Math.random() <= 0.5){
            Meat meat = new Meat("Мясо",30);
            System.out.println(meat.getName());
            Integer health5 = hero.getHealth();
            Integer hill1 = meat.getHealthUp();
            Integer d = health5 +hill1;
            hero.setHealth(d);
            System.out.println("Ты ешь мясо + 30 hp");
            System.out.println(hero);
        }else{
            System.out.println("Сундук пуст...");
        }
        System.out.println("Ты проходишь дальше.");
        System.out.println("Возле скелета лежит старый меч.");
        OldBlade oldBlade = new OldBlade("Старый меч",40);
        System.out.println("1-взять меч   2-пройти мимо");

        Scanner sc3 = new Scanner(System.in);
        int number3 = sc3.nextInt();
        if(number3 == 1){
            System.out.println("Ты берешь меч вместо дубинки.");
            Integer damage5 = oldBlade.getWeaponDamage();
            Integer damage6 = stick.getWeaponDamage();
            Integer damage7 = hero.getDamage();
            Integer e = damage7 + damage5 - damage6;
            hero.setDamage(e);
            System.out.println(hero);
        }else if(number3 == 2){
            System.out.println("Ты решил не поднимать меч.");
        }else{
            System.out.println("end... run program again.");
            System.exit(0);
        }

    }
}
