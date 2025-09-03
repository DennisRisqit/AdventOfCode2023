package main.java.com.example.AoD5;

public class SeedMapping {
    private long DestinationRange;
    private long SourceRange;
    private long RangeLength;

    public SeedMapping(long DestinationRange, long SourceRange, long RangeLength){
        this.DestinationRange = DestinationRange;
        this.SourceRange = SourceRange;
        this.RangeLength = RangeLength;
    }
    public long getDestinationRange(){return DestinationRange;}
    public long getSourceRange(){return SourceRange;}
    public long getRangeLength(){return RangeLength;}

    public void PrintSeedMapping(){
        System.out.println("DestinationRange = : " + DestinationRange);
        System.out.println("SourceRange = " + SourceRange);
        System.out.println("RangeLength = " + RangeLength);
    }
}
