public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        warrior.setHeroDamage(100);
        warrior.setHeroHealth(500);

        Magic magic = new Magic();
        magic.setHeroDamage(90);
        magic.setHeroHealth(400);


        Medic medic = new Medic();
        medic.setHeroDamage(100);
        medic.setHeroHealth(500);

        Hero[] heroes = new Hero[] {magic, medic, warrior};
        for (Hero hero:heroes)
            hero.applySuperAbility();
    }
}





























//        ● В классе Main создать массив из 3х разных героев, затем через цикл применить
//        суперспособность каждого героя.