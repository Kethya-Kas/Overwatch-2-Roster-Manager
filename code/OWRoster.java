public class OWRoster {

    OWCompTemplate roster;

    public OWRoster(Archetype type) {

        switch (type) {
            case DIVE:

                roster = new Dive();
                break;

            case BRAWL:

                roster = new Brawl();
                break;

            case POKE:

                roster = new Poke();
                break;
        }
    }

    public OWCompTemplate getRoster() {
        return roster;
    }

    public int getCurrentRosterSize() {
        return roster.getCurrentRosterSize();
    }

    public void addHero(Hero hero) throws Exception {
        roster.addHero(hero);
    }

    public void removeHero(Hero hero) throws Exception {
        roster.removeHero(hero);
    }

    public void generateRandomRoster() {
        roster.generateRandomRoster();
    }

    public void clearRoster() {
        roster.clearRoster();
    }

    public void printRoster() {
        roster.printRoster();
    }

    public void printCompDetails() {
        roster.printCompDetails();
    }
}