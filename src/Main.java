public class Main {

    public static void main(String[] args) {

        Gryffindor[] gryffindors = {
                new Gryffindor(11, 55, "Гарри Поттер", 67, 22, 5),
                new Gryffindor(18, 99, "Гермиона Грейнджер", 54, 71, 2),
                new Gryffindor(98, 29, "Рон Уизли", 44, 59, 1)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff(26, 43, "Захария Смит", 76, 15, 87),
                new Hufflepuff(25, 76, "Седрик Диггори", 54, 26, 69),
                new Hufflepuff(46, 59, "Джастин Финч-Флетчли", 29, 39, 25)
        };

        RavenClaw[] ravenClaws = {
                new RavenClaw(25, 43, "Чжоу Чанг", 15, 9, 43, 54),
                new RavenClaw(76, 28, "Падма Патил", 22, 25, 28, 68),
                new RavenClaw(47, 65, "Маркус Белби", 14, 50, 94, 74)
        };

        Slytherin[] slytherins = {
                new Slytherin(88, 67, "Драко Малфой", 50, 78, 43, 68, 76),
                new Slytherin(23, 48, "Грэхэм Монтегю", 90, 98, 22, 35, 89),
                new Slytherin(63, 1, "Грегори Гойл", 70, 99, 87, 98, 13)
        };

        PrintServiceHogwarts.printAllGryffindorStudents(gryffindors);
        PrintServiceHogwarts.printAllHufflepuffStudents(hufflepuffs);
        PrintServiceHogwarts.printAllRavenClawStudents(ravenClaws);
        PrintServiceHogwarts.printAllSlytherinStudents(slytherins);
        PrintServiceHogwarts.printBestStudentByGryffindor(gryffindors[1], gryffindors[2]);
        PrintServiceHogwarts.printBestStudentByHufflepuff(hufflepuffs[1], hufflepuffs[2]);
        PrintServiceHogwarts.printBestStudentByRavenClaw(ravenClaws[1], ravenClaws[2]);
        PrintServiceHogwarts.printBestStudentBySlytherin(slytherins[1], slytherins[2]);
        PrintServiceHogwarts.printStrongestStudentByHogwarts(gryffindors[0], slytherins[0]);

    }

}