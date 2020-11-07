package home;

import java.util.Objects;

public class Animal {

    private int nrPicior;
    private boolean blana;
    private String lungimeBlana;
    private boolean penaj;
    private String features;

    public Animal(int nrPicior, boolean blana, String lungimeBlana, boolean penaj, String features) {
        this.nrPicior = nrPicior;
        this.blana = blana;
        this.lungimeBlana = lungimeBlana;
        this.penaj = penaj;
        this.features = features;
    }

    public Animal() {
        this.nrPicior = 4;
    }

    public boolean isBlana() {
        return blana;
    }

    public String getLungimeBlana() {
        return lungimeBlana;
    }

    public void setLungimeBlana(String lungimeBlana) {
        this.lungimeBlana = lungimeBlana;
    }

    public boolean isPenaj() {
        return penaj;
    }

    public void setPenaj(boolean penaj) {
        this.penaj = penaj;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public int getNrPicior() {
        return this.nrPicior;
    }

    public void setNrPicior(int nrPicior) {
        this.nrPicior = nrPicior;
    }

    public void setBlana(boolean blana) {
        this.blana = blana;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nrPicior=" + nrPicior +
                ", blana=" + blana +
                ", lungimeBlana='" + lungimeBlana + '\'' +
                ", penaj=" + penaj +
                ", features='" + features + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return nrPicior == animal.nrPicior &&
                blana == animal.blana &&
                penaj == animal.penaj &&
                Objects.equals(lungimeBlana, animal.lungimeBlana) &&
                Objects.equals(features, animal.features);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrPicior, blana, lungimeBlana, penaj, features);
    }

    public static int someMethod() {
        return 1;
    }
}
