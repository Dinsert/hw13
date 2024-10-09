public class PrintServiceHogwarts {

    private PrintServiceHogwarts() {
    }

    public static void printAllSlytherinStudents(Slytherin[] slytherins) {
        for (Slytherin slytherin : slytherins) {
            System.out.println(slytherin);
        }
    }

    public static void printAllRavenClawStudents(RavenClaw[] ravenClaws) {
        for (RavenClaw ravenClaw : ravenClaws) {
            System.out.println(ravenClaw);
        }
    }

    public static void printAllHufflepuffStudents(Hufflepuff[] hufflepuffs) {
        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println(hufflepuff);
        }
    }

    public static void printAllGryffindorStudents(Gryffindor[] gryffindors) {
        for (Gryffindor gryffindor : gryffindors) {
            System.out.println(gryffindor);
        }
    }

    public static void printBestStudentByGryffindor(Gryffindor student1, Gryffindor student2) {
        if (student1.getHonor() + student1.getNobility() + student1.getBravery() > student2.getHonor() + student2.getNobility() + student2.getBravery()) {
            System.out.println(student1.getFullName() + " лучший Гриффиндорец, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший Гриффиндорец, чем " + student1.getFullName());
        }
    }

    public static void printBestStudentByHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        if (student1.getHardWork() + student1.getHonesty() + student1.getLoyalty() > student2.getHardWork() + student2.getHonesty() + student2.getLoyalty()) {
            System.out.println(student1.getFullName() + " лучший Пуффендуец, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший Пуффендуец, чем " + student1.getFullName());
        }
    }

    public static void printBestStudentByRavenClaw(RavenClaw student1, RavenClaw student2) {
        if (student1.getCreation() + student1.getMind() + student1.getWisdom() + student1.getWit()
                > student2.getCreation() + student2.getMind() + student2.getWisdom() + student2.getWit()) {
            System.out.println(student1.getFullName() + " лучший Когтевранец, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший Когтевранец, чем " + student1.getFullName());
        }
    }

    public static void printBestStudentBySlytherin(Slytherin student1, Slytherin student2) {
        if (student1.getAmbition() + student1.getCunning() + student1.getDetermination() + student1.getLustForPower() + student1.getResourcefulness()
                > student2.getAmbition() + student2.getCunning() + student2.getDetermination() + student2.getLustForPower() + student2.getResourcefulness()) {
            System.out.println(student1.getFullName() + " лучший Слизеринец, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший Слизеринец, чем " + student1.getFullName());
        }
    }

    public static void printStrongestStudentByHogwarts(Hogwarts student1, Hogwarts student2) {
        if (student1.getPowerOfMagic() + student1.getTransgression() > student2.getPowerOfMagic() + student2.getTransgression()) {
            System.out.println(student1.getFullName() + " обладает бОльшей мощностью магии, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " обладает бОльшей мощностью магии, чем " + student1.getFullName());
        }
    }
}
