package main.java.com.example.AoD4;

public class ScratschCardResult<N,K,V> {
    private final N name;
    private final K WinningNumbers;
    private final V Amount;

    public ScratschCardResult(N name,K WinningNumbers ,V Amount) {
        this.name = name;
        this.WinningNumbers = WinningNumbers;
        this.Amount = Amount;
    }
    public N getFirst() {
        return this.name;
    }

    public K getSecond() {
        return this.WinningNumbers;
    }

    public V getThird() {
        return this.Amount;
    }
}
