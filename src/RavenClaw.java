public class RavenClaw extends Hogwarts {

    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creation;

    public RavenClaw(int powerOfMagic, int transgression, String fullName, int mind, int wisdom, int wit, int creation) {
        super(powerOfMagic, transgression, fullName);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return "RavenClaw{" +
                "mind = " + "FullName " + getFullName() + " Transgression " + getTransgression() + " Magic " + getPowerOfMagic() + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }
}
