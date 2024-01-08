package se.iths;

public class Runner {
    double heightincm;
    double weightinkg;

    public Runner(double heightincm, double weightinkg) {
        this.heightincm = heightincm;
        this.weightinkg = weightinkg;
    }
    public double calculateBmi() {
        double heightInMeter = heightincm/100.0;
        return weightinkg / (heightInMeter*heightInMeter);
    }
}