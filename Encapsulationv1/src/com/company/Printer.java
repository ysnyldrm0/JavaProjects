package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer( int tonerLovel, boolean duplex) {
        if(tonerLevel < 0)
            this.tonerLevel = -1;
        else
            this.tonerLevel = tonerLovel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }


    public int printPages(int pages){

        int pagesToPrint = pages;

        if( duplex == true){
            if (pagesToPrint % 2 != 0)
                pagesToPrint = pagesToPrint/2 + 1;
            else {
                System.out.println("Printing in duplex mode");
                pagesToPrint /= 2;
            }
            pagesPrinted += pagesToPrint;
        }
        else{
            pagesPrinted += pagesToPrint;
        }

        return pagesToPrint;
    }

    public int addToner(int tonerAmount){
        if ( tonerAmount > 0 && tonerAmount <= 100){
            if ( tonerAmount + tonerLevel > 100)
                return -1;
            else {
                tonerLevel += tonerAmount;
                return  tonerLevel;
            }
        }
        return -1;
    }

}
