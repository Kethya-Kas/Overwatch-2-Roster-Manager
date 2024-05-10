import java.util.ArrayList;

public class Brawl extends OWCompTemplate {

    @Override
    public void initializePools() {

        availableHeroes.add(new Hero("Junker Queen", Role.TANK));
        availableHeroes.add(new Hero("Mauga", Role.TANK));
        availableHeroes.add(new Hero("Orisa", Role.TANK));
        availableHeroes.add(new Hero("Ramattra", Role.TANK));
        availableHeroes.add(new Hero("Reinhardt", Role.TANK));
        availableHeroes.add(new Hero("Zarya", Role.TANK));

        availableHeroes.add(new Hero("Bastion", Role.DAMAGE));
        availableHeroes.add(new Hero("Cassidy", Role.DAMAGE));
        availableHeroes.add(new Hero("Mei", Role.DAMAGE));
        availableHeroes.add(new Hero("Reaper", Role.DAMAGE));
        availableHeroes.add(new Hero("Sojourn", Role.DAMAGE));
        availableHeroes.add(new Hero("Symmetra", Role.DAMAGE));
        availableHeroes.add(new Hero("Tracer", Role.DAMAGE));

        availableHeroes.add(new Hero("Ana", Role.SUPPORT));
        availableHeroes.add(new Hero("Baptiste", Role.SUPPORT));
        availableHeroes.add(new Hero("Kiriko", Role.SUPPORT));
        availableHeroes.add(new Hero("Lucio", Role.SUPPORT));
        availableHeroes.add(new Hero("Moira", Role.SUPPORT));

        getAvailableHeroesInfo();

        for (Hero hero : availableHeroes) {
            availableHeroesByRole.computeIfAbsent(hero.getRole(), k -> new ArrayList<>()).add(hero);
        }
    }

    @Override
    public void printCompDetails() {
        System.out.println(
                "The Brawl comp is a close-range team strategy in Overwatch 2, typically consisting of heroes with high health pools, high damage output, and strong crowd control abilities. It involves engaging the enemy team in close-quarters combat and using the team's strengths to overpower the enemy.");
        System.out.println();
    }
}
