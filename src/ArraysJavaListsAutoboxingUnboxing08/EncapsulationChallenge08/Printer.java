package ArraysJavaListsAutoboxingUnboxing08.EncapsulationChallenge08;

public class Printer{

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;


    public Printer(int tonerLevel, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.duplexPrinter = duplexPrinter;
        this.pagesPrinted = 0;
    }

    public int fillUpToner(int tonerAmount) {
        if (tonerLevel > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int print(int pages) {
        int pagesToPrint = pages;
        if (this.duplexPrinter) {
            pagesToPrint /= (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
