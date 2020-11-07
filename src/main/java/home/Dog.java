package home;

public class Dog extends Animal{

    private final String cutenessLevel;

    public Dog() {
        this.setBlana(true);
        this.setNrPicior(4);
        this.setFeatures("none");
        this.setLungimeBlana("short");
        this.setPenaj(false);
        this.cutenessLevel = "Over 9000";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nrPicior=" + this.getNrPicior() +
                ", blana=" + this.isBlana() +
                ", lungimeBlana='" + this.getLungimeBlana() + '\'' +
                ", penaj=" + this.isPenaj() +
                ", features='" + this.getFeatures() + '\'' +
                ", cutenessLevel='" + cutenessLevel + '\'' +
                '}';
    }
}
