public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if((this.tonerLevel + tonerAmount) > 100) {
                return -1;
            } else {
                return tonerLevel += tonerAmount;
            }
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if(this.duplex) {
            pagesToPrint = (pages/2) + (pages%2);
//            this.pagesPrinted += pagesToPrint;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

}
