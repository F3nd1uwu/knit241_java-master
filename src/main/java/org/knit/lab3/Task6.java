package org.knit.lab3;
import java.util.Scanner;

public class Task6 {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        PlayerFactory playerFactory = new PlayerFactory();

        System.out.println("Главное меню.");
        // Главные герои
        System.out.print("Введите имя воина... ");
        Warrior warrior = playerFactory.createWarrior(scanner.nextLine());
        System.out.print("Введите имя мага... ");
        Mage mage = playerFactory.createMage(scanner.nextLine());
        System.out.print("Введите имя священника... ");
        Priest priest = playerFactory.createPriest(scanner.nextLine());
        // Враги
        Warrior enemyWarrior1 = playerFactory.createWarrior("огр-воин");
        Warrior enemyWarrior2 = playerFactory.createWarrior("огр-воин");
        Mage enemyMage = playerFactory.createMage("огр-маг");

        System.out.println("Начало игры. \n Правила игры: каждый персонаж может совершить 1 действие за 1 ход.");
        System.out.println("Характеристики ваших персонажей:");
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(priest);
        System.out.println("Введите любой символ для продолжения... ");
        scanner.nextLine();

        System.out.println("Начало истории. Первый бой.");
        System.out.println("На пути ваших героев встретились: 1 огр-маг и 2 огра-воина.");
        System.out.println("Они вражески смотрели на вас, ярость так и виднелась в их глазах.");
        System.out.println(warrior.getName() + " с помощью способности *** Провидиние *** раскрыл характеристики противников.");
        System.out.println("Характеристики ваших врагов:");
        System.out.println(enemyWarrior1);
        System.out.println(enemyWarrior2);
        System.out.println(enemyMage);
        System.out.println("Огр-воин издал пронзительный и устрашающий рык. Похоже битва вот-вот начнется...");
        System.out.println("Введите любой символ для продолжения... ");
        scanner.nextLine();

        System.out.println("Раунд 1.");
        System.out.println(
                "1. Маг атакует Огра-Мага\n" +
                "2. Огр-Воин 1 атакует Воина\n" +
                "3. Священник исцеляет Воина\n" +
                "4. Огр-Воин 2 атакует Священника\n" +
                "5. Воин атакует Огра-Воин 1\n" +
                "6. Огр-Маг атакует Мага\n");
        mage.attack(enemyMage);
        enemyWarrior1.attack(warrior);
        priest.heal(warrior);
        enemyWarrior2.attack(priest);
        warrior.attack(enemyWarrior1);
        enemyMage.attack(mage);
        System.out.println("Конец 1 раунда.");
        System.out.println("Характеристики ваших персонажей:");
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(priest);
        System.out.println("Характеристики ваших врагов:");
        System.out.println(enemyWarrior1);
        System.out.println(enemyWarrior2);
        System.out.println(enemyMage);
        System.out.println("Введите любой символ для продолжения... ");
        scanner.nextLine();

        System.out.println("Дальше чтобы не писать длинный сюжет представим, что маг раскастовал ветра, санстрайк, метеор, бласт и тд...");
        enemyWarrior1.setNowHealth(0);
        enemyWarrior1.setArmor(0);
        enemyWarrior1.setStatus(false);
        enemyWarrior2.setNowHealth(0);
        enemyWarrior2.setArmor(0);
        enemyWarrior2.setStatus(false);
        enemyMage.setNowHealth(0);
        enemyMage.setArmor(0);
        enemyMage.setStatus(false);

        System.out.println("Бой был трудный для ваших героев, но все живы благодаря командной работе.");
        System.out.println("Дальше их ждет еще больше испытаний и трудностей.");
        System.out.println("Конец игры. Введите любой символ для продолжения... ");
        scanner.nextLine();
    }
}
