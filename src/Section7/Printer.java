package Section7;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>-1&&tonerLevel<=100){
        this.tonerLevel = tonerLevel;
        } else this.tonerLevel = -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0&&tonerAmount<=100){
            if((tonerLevel+tonerAmount)>100){
                return -1;
            } else {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        } else return -1;
    }

    public int printPages(int pages){
        int pagesToPrint;
        if(duplex){
            System.out.println("Printing in duplex mode");
            if(pages%2==0){
                pagesToPrint = pages/2;
            } else {
                pagesToPrint = (pages / 2) + 1;
            }
        } else {
            pagesToPrint = pages;
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
