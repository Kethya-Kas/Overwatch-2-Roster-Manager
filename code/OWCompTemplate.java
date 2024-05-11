import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class OWCompTemplate implements OWCompInterface {

    public ArrayList<Hero> availableHeroes;
    public Map<Role, ArrayList<Hero>> availableHeroesByRole;
    public HashMap<String, Role> availableHeroesInfoMap;
    private ArrayList<Hero> currentTanks;
    private ArrayList<Hero> currentDamage;
    private ArrayList<Hero> currentSupports;

    public OWCompTemplate() {
        currentTanks = new ArrayList<>();
        currentDamage = new ArrayList<>();
        currentSupports = new ArrayList<>();
        availableHeroes = new ArrayList<>();
        availableHeroesInfoMap = new HashMap<>();
        availableHeroesByRole = new EnumMap<>(Role.class);

        initializePools();
    }

    @Override
    public int getCurrentRosterSize() {
        return currentTanks.size() + currentDamage.size() + currentSupports.size();
    }

    @Override
    public void addHero(Hero hero) throws Exception {

        if (!isValid(hero)) {
            throw new CustomExceptions.InvalidHeroException("Tried to add an invalid Hero");
        }

        ArrayList<Hero> roleRoster = getRosterForRole(hero.getRole());

        if (roleRoster.size() < getMaxSizeForRole(hero.getRole())) {
            if (!roleRoster.contains(hero)) {
                roleRoster.add(hero);
            } else {
                throw new CustomExceptions.HeroDuplicateException("Hero already on roster");
            }
        } else {
            throw new CustomExceptions.RoleFullException("Current role on roster is full");
        }
    }

    @Override
    public void removeHero(Hero hero) throws Exception {

        if (!isValid(hero)) {
            throw new CustomExceptions.InvalidHeroException("Tried to remove an invalid Hero");
        }

        ArrayList<Hero> roleRoster = getRosterForRole(hero.getRole());

        boolean removed = roleRoster.remove(hero);
        if (!removed) {
            throw new CustomExceptions.HeroNotOnRosterException(
                    "Failed to remove Hero from roster since Hero not on current roster");
        }
    }

    @Override
    public void generateRandomRoster() {

        clearRoster();

        Random random = new Random();

        ArrayList<Hero> tankPool = new ArrayList<>(availableHeroesByRole.get(Role.TANK));
        ArrayList<Hero> damagePool = new ArrayList<>(availableHeroesByRole.get(Role.DAMAGE));
        ArrayList<Hero> supportPool = new ArrayList<>(availableHeroesByRole.get(Role.SUPPORT));

        for (int i = 0; i < MAX_TANKS; i++) {
            currentTanks.add(getRandomHero(tankPool, random));
        }

        for (int i = 0; i < MAX_DAMAGE; i++) {
            currentDamage.add(getRandomHero(damagePool, random));
        }

        for (int i = 0; i < MAX_SUPPORTS; i++) {
            currentSupports.add(getRandomHero(supportPool, random));
        }
    }

    @Override
    public void clearRoster() {
        currentTanks.clear();
        currentDamage.clear();
        currentSupports.clear();
    }

    @Override
    public void printRoster() {

        System.out.println("Style: " + this.getClass().getName());
        System.out.print("TANK - ");
        for (Hero hero : currentTanks)
            System.out.print(hero.getName() + " ");

        System.out.println();

        System.out.print("DAMAGE - ");
        for (Hero hero : currentDamage)
            System.out.print(hero.getName() + " ");

        System.out.println();

        System.out.print("SUPPORT - ");
        for (Hero hero : currentSupports)
            System.out.print(hero.getName() + " ");

        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();
    };

    public abstract void printCompDetails();

    public abstract void initializePools();

    public HashMap<String, Role> getAvailableHeroesInfo() {

        for (Hero hero : availableHeroes) {
            availableHeroesInfoMap.put(hero.getName(), hero.getRole());
        }
        return availableHeroesInfoMap;
    }

    private ArrayList<Hero> getRosterForRole(Role role) {

        switch (role) {
            case TANK:
                return currentTanks;
            case DAMAGE:
                return currentDamage;
            case SUPPORT:
                return currentSupports;
            default:
                throw new AssertionError(" Unknown role");
        }
    }

    private int getMaxSizeForRole(Role role) {
        switch (role) {
            case TANK:
                return MAX_TANKS;
            case DAMAGE:
                return MAX_DAMAGE;
            case SUPPORT:
                return MAX_SUPPORTS;
            default:
                throw new AssertionError(" Cannot calculate max size due to unknown role");
        }
    }

    private boolean isValid(Hero hero) {

        if (availableHeroesInfoMap.containsKey(hero.getName())) {
            Role actualRole = availableHeroesInfoMap.get(hero.getName());
            return actualRole == hero.getRole();
        }
        return false;
    }

    private Hero getRandomHero(ArrayList<Hero> pool, Random random) {

        Hero randomHero = pool.get(random.nextInt(pool.size()));
        pool.remove(randomHero);

        return randomHero;
    }
}
