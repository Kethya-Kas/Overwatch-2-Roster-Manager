public interface OWCompInterface {

    int MAX_TANKS = 1;
    int MAX_DPS = 2;
    int MAX_SUPPORTS = 2;

    public abstract int getCurrentRosterSize();

    public abstract void addHero(Hero hero) throws Exception;

    public abstract void removeHero(Hero hero) throws Exception;

    public abstract void generateRandomRoster();

    public abstract void clearRoster();

    public abstract void printRoster();
}