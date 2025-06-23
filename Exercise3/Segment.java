package Exercise3;

public class Segment {
    private int start;
    private int end;

    public Segment(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getLength() {
        return Math.abs(end - start);
    }

    public String toString() {
        return "Segment(" + start + ", " + end + ")";
    }
}

