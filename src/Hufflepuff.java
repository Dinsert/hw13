public class Hufflepuff extends Hogwarts {

    private final int hardWork;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(int powerOfMagic, int transgression, String fullName, int hardWork, int loyalty, int honesty) {
        super(powerOfMagic, transgression, fullName);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardWork = " + "FullName " + getFullName() + " Transgression " + getTransgression() + " Magic " + getPowerOfMagic() + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
