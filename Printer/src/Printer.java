public class Printer {
    private double tonerLevel = 100.0;
    private int numberOfPagesPrinted = 0;
    private boolean isDuplex;

    public Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    private void fillToner() {
        this.tonerLevel = 100.0;
    }

    private double calculateTonerLevel() {
        //method calculates toner level
        // (((MAX - numberPagesPrinted) / MAX) * 100) - tonerLevel = % left
        int MAX_PAGES = 2000;
        double retVal =  (((double) (MAX_PAGES - this.numberOfPagesPrinted) / MAX_PAGES) * 100);
        this.tonerLevel = retVal;
        return retVal;
    }

    private double calculateTonerLevel(int numPages) {
        //method calculates toner level
        // (((MAX - numberPagesPrinted) / MAX) * 100) - tonerLevel = % left
        int MAX_PAGES = 2000;
        double  retVal = ((double)(MAX_PAGES - ((this.numberOfPagesPrinted) + numPages)) / MAX_PAGES) * 100;
        this.tonerLevel = retVal;
        return retVal;
    }

    public void print(int numPages) {
        System.out.println("STARTING PRINTING PROCESS");
        System.out.println("Current Toner Level: " + calculateTonerLevel() + "%");
        if(calculateTonerLevel(numPages) < 0) {
            System.out.println("Canceling print job.  Refill toner and resubmit print job.");
            fillToner();
        } else {
            System.out.println("You have enough toner for this print job.");
            if (this.isDuplex) {
                System.out.println("Starting your print job in duplex mode...");
            } else {
                System.out.println("Starting your print job...");
            }
            this.numberOfPagesPrinted += numPages;
            System.out.println("Updated Toner Level (after print job): " + calculateTonerLevel() + "%");
        }
    }

    public double getTonerLevel() {
        System.out.println("Current Toner Level: " + this.tonerLevel + "%");
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
        this.numberOfPagesPrinted = numberOfPagesPrinted;
    }
}
