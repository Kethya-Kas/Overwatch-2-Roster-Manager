import java.util.ArrayList;

public class Dive extends OWCompTemplate {

    @Override
    protected void initializePools() {

        availableHeroes.add(new Hero("D.Va", Role.TANK));
        availableHeroes.add(new Hero("Doomfist", Role.TANK));
        availableHeroes.add(new Hero("Winston", Role.TANK));
        availableHeroes.add(new Hero("Wrecking Ball", Role.TANK));

        availableHeroes.add(new Hero("Echo", Role.DAMAGE));
        availableHeroes.add(new Hero("Genji", Role.DAMAGE));
        availableHeroes.add(new Hero("Sojourn", Role.DAMAGE));
        availableHeroes.add(new Hero("Sombra", Role.DAMAGE));
        availableHeroes.add(new Hero("Tracer", Role.DAMAGE));

        availableHeroes.add(new Hero("Ana", Role.SUPPORT));
        availableHeroes.add(new Hero("Brigitte", Role.SUPPORT));
        availableHeroes.add(new Hero("Kiriko", Role.SUPPORT));
        availableHeroes.add(new Hero("Lucio", Role.SUPPORT));
        availableHeroes.add(new Hero("Zenyatta", Role.SUPPORT));

        getAvailableHeroesInfo();

        for (Hero hero : availableHeroes) {
            availableHeroesByRole.computeIfAbsent(hero.getRole(), k -> new ArrayList<>()).add(hero);
        }
    }

    @Override
    public void printCompDetails() {
        System.out.println(
                "The Dive comp is a high-mobility team strategy in Overwatch 2, involving coordinated dives into enemy backlines to quickly eliminate high-value targets.");
    }
}
