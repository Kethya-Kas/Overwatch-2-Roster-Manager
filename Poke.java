import java.util.ArrayList;

public class Poke extends OWCompTemplate {

    @Override
    protected void initializePools() {

        availableHeroes.add(new Hero("Orisa", Role.TANK));
        availableHeroes.add(new Hero("Sigma", Role.TANK));

        availableHeroes.add(new Hero("Ashe", Role.DAMAGE));
        availableHeroes.add(new Hero("Cassidy", Role.DAMAGE));
        availableHeroes.add(new Hero("Hanzo", Role.DAMAGE));
        availableHeroes.add(new Hero("Sojourn", Role.DAMAGE));
        availableHeroes.add(new Hero("Soldier: 76", Role.DAMAGE));
        availableHeroes.add(new Hero("Torbjorn", Role.DAMAGE));
        availableHeroes.add(new Hero("Tracer", Role.DAMAGE));
        availableHeroes.add(new Hero("Widowmaker", Role.DAMAGE));

        availableHeroes.add(new Hero("Baptiste", Role.SUPPORT));
        availableHeroes.add(new Hero("Brigitte", Role.SUPPORT));
        availableHeroes.add(new Hero("Illari", Role.SUPPORT));
        availableHeroes.add(new Hero("Mercy", Role.SUPPORT));
        availableHeroes.add(new Hero("Zenyatta", Role.SUPPORT));

        getAvailableHeroesInfo();

        for (Hero hero : availableHeroes) {
            availableHeroesByRole.computeIfAbsent(hero.getRole(), k -> new ArrayList<>()).add(hero);
        }
    }

    @Override
    public void printCompDetails() {
        System.out.println(
                "The Poke comp is a long-range team strategy in Overwatch 2, typically consisting of heroes with high damage output and range. It involves maintaining distance from the enemy team while dealing damage from a safe position.");
    }
}
