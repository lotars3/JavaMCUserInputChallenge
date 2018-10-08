package ArraysJavaListsAutoboxingUnboxing08.EncapsulationChallenge08;

public class main{

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        System.out.println("Initial page count" + printer.getPagesPrinted());
        int pagesPrinted = printer.print(4);
        System.out.println("Pages printed was" + pagesPrinted + " new total print count for printed=" + printer.getPagesPrinted());
        pagesPrinted = printer.print(2);
        System.out.println("Pages printed was" + pagesPrinted + " new total print count for printed=" + printer.getPagesPrinted());

    }
}
