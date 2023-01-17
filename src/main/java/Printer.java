public class Printer {

    private int paperCount;
    private int printCount;

    private int tonerCount;

    public Printer(int paperCount, int tonerCount) {
        this.paperCount = paperCount;
        this.tonerCount = tonerCount;
    }

    public int getPaperCount() {
        return this.paperCount;
    }

    public int printVolume(int pages, int copies){
       this.printCount = pages * copies;
        return this.printCount;

    }

    public int validPrintJob(int pages, int copies){
        int volume = printVolume(pages, copies);
        if(volume <= this.paperCount){
            this.paperCount -= volume;
            this.tonerCount -= volume;
        }
        return tonerCount;
    }
}
