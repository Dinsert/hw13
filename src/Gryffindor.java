public class Gryffindor extends Hogwarts {

    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(int powerOfMagic, int transgression, String fullName, int nobility, int honor, int bravery) {
        super(powerOfMagic, transgression, fullName);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility = " + "FullName " + getFullName() + " Transgression " + getTransgression() + " Magic " + getPowerOfMagic() + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
