public class CompTester {
    public static void main(String[] args) {

        Dive dive = new Dive();
        dive.generateRandomRoster();
        // dive.printCompDetails();
        // System.out.println();
        // dive.printRoster();

        dive.clearRoster();

        Hero winston = new Hero("Winston", Role.TANK);
        Hero tracer = new Hero("Tracer", Role.DAMAGE);
        Hero genji = new Hero("Genji", Role.DAMAGE);
        Hero ana = new Hero("Ana", Role.SUPPORT);
        Hero lucio = new Hero("Lucio", Role.SUPPORT);

        try {

            dive.addHero(winston);
            dive.addHero(tracer);
            dive.addHero(genji);
            dive.addHero(ana);
            dive.addHero(lucio);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        dive.printRoster();

        // dive.clearRoster();
        // System.out.println("Cleared dive roster!");
        // System.out.println();

        // Brawl brawl = new Brawl();
        // brawl.generateRandomRoster();
        // brawl.printCompDetails();
        // System.out.println();
        // brawl.printRoster();

        // brawl.clearRoster();
        // System.out.println("Cleared brawl roster!");
        // System.out.println();

        // Poke poke = new Poke();
        // poke.generateRandomRoster();
        // poke.printCompDetails();
        // System.out.println();
        // poke.printRoster();

        // poke.clearRoster();
        // System.out.println("Cleared poke roster!");
        // System.out.println();

        // Hero sigma = new Hero("Sigma", Role.TANK);
        // Hero widowmaker = new Hero("Widowmaker", Role.DAMAGE);
        // Hero sojourn = new Hero("Sojourn", Role.DAMAGE);
        // Hero genji = new Hero("Genji", Role.DAMAGE);
        // Hero invalidSojourn = new Hero("Sojourn", Role.SUPPORT);
        // Hero baptiste = new Hero("Baptiste", Role.SUPPORT);
        // Hero zenyatta = new Hero("Zenyatta", Role.SUPPORT);
        // Hero illari = new Hero("Illari", Role.SUPPORT);

        // try {
        // try {
        // poke.addHero(sigma);
        // System.out.println("Added Sigma.");
        // } catch (Exception e) {
        // System.err.println(e.getMessage());
        // }

        // try {
        // poke.addHero(widowmaker);
        // System.out.println("Added Widowmaker.");
        // } catch (Exception e) {
        // System.err.println(e.getMessage());
        // }

        // try {
        // poke.addHero(widowmaker);
        // System.out.println("Added Widowmaker.");
        // } catch (Exception e) {
        // System.err.println(e.getMessage());
        // }

        // try {
        // poke.addHero(invalidSojourn);
        // System.out.println("Added invalidSojourn.");
        // } catch (Exception e) {
        // System.err.println(e.getMessage());
        // }

        // try {
        // poke.addHero(sojourn);
        // System.out.println("Added Sojourn.");
        // } catch (Exception e) {
        // System.err.println(e.getMessage());
        // }

        // try {
        // poke.removeHero(sojourn);
        // System.out.println("Removed Sojourn.");
        // } catch (Exception e) {
        // System.err.println(e.getMessage());
        // }

        // try {
        // poke.removeHero(sojourn);
        // System.out.println("Removed Sojourn.");
        // } catch (Exception e) {
        // System.err.println(e.getMessage());
        // }

        // try {
        // poke.addHero(genji);
        // System.out.println("Added Genji.");
        // } catch (Exception e) {
        // System.err.println(e.getMessage());
        // }

        // try {
        // poke.addHero(baptiste);
        // System.out.println("Added Baptiste.");
        // } catch (Exception e) {
        // System.err.println(e.getMessage());
        // }

        // try {
        // poke.addHero(zenyatta);
        // System.out.println("Added Zenyatta.");
        // } catch (Exception e) {
        // System.err.println(e.getMessage());
        // }

        // try {
        // poke.addHero(illari);
        // System.out.println("Added Illari.");
        // } catch (Exception e) {
        // System.err.println(e.getMessage());
        // }
        // } finally {
        // System.out.println();
        // poke.printRoster();
        // }
    }
}
