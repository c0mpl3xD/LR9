/*
Ієрархія має містити класи: "Тварина", "Заєць", "Їжак" та
"Кінь". Врахувати, що тварини бувають різних видів та родів, хижі та
травоїдні. Класи мають містити всі необхідні конструктори set-та get-
методи, та метод "харчуватися", що відбиває процес харчування
конкретної тварини рослинною чи тваринною їжею (якщо
знадобиться, додати в модель класи, що не обумовленні завданням).
*/

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("біляк", "Заєць","травоїдна");
        System.out.println("Створено тварину \"" + rabbit.print() + "\" і він " + rabbit.getTypeOfFood() + " тварина");
        Rabbit rabbit1 = new Rabbit("русак", "Заєць","травоїдна");
        System.out.println("Створено тварину \"" + rabbit1.print() +"\" і він " + rabbit.getTypeOfFood() + " тварина");

        Hedgehog hedgehog = new Hedgehog("європейський", "Їжак","всеїдна");
        System.out.println("Створено тварину \"" + hedgehog.print() +"\" і він " + hedgehog.getTypeOfFood() + " тварина");
        Hedgehog hedgehog1 = new Hedgehog("білочеревий", "Їжак","всеїдна");
        System.out.println("Створено тварину \"" + hedgehog1.print() +"\" і він " + hedgehog.getTypeOfFood() + " тварина");

        Horse horse = new Horse("норійський", "Кінь","травоїдна");
        System.out.println("Створено тварину \"" + horse.print() +"\" і він " + horse.getTypeOfFood() + " тварина");
        Horse horse1 = new Horse("східний", "Кінь","травоїдна");
        System.out.println("Створено тварину \"" + horse1.print() +"\" і він " + horse.getTypeOfFood() + " тварина");

        Lion lion = new Lion("азіатський", "Лев","хижацька");
        System.out.println("Створено тварину \"" + lion.print() +"\" і він " + lion.getTypeOfFood() + " тварина");
        Lion lion1 = new Lion("африканський", "Лев","хижацька");
        System.out.println("Створено тварину \"" + lion1.print() +"\" і він " + lion.getTypeOfFood() + " тварина");

        System.out.println("");

        rabbit.feed("травою");
        rabbit1.feed("травою");
        hedgehog.feed("комахами");
        hedgehog1.feed("комахами");
        horse.feed("травою");
        horse1.feed("травою");
        lion.feed("м'ясом");
        lion1.feed("м'ясом");
    }
}