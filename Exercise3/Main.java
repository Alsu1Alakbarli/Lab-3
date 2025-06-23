package Exercise3;

public class Main {
    public static void main(String[] args) {
        Segment[] array = {
            new Segment(0, 5),
            new Segment(3, 7),
            new Segment(10, 13),
            new Segment(4, 9),
            new Segment(100, 103) // length = 3 (min)
        };

        Segment[] shortest = SegmentUtils.findShortestSegments(array);

        System.out.println("Shortest segments:");
        for (Segment s : shortest) {
            System.out.println(s + " with length " + s.getLength());
        }
    }
}
