package Exercise3;

import java.util.ArrayList;

public class SegmentUtils {

    public static Segment[] findShortestSegments(Segment[] segments) {
        if (segments.length == 0) return new Segment[0];

        int minLength = segments[0].getLength();

        // minimum length
        for (Segment s : segments) {
            int len = s.getLength();
            if (len < minLength) {
                minLength = len;
            }
        }

        //  all segments with that minimum length
        ArrayList<Segment> result = new ArrayList<>();
        for (Segment s : segments) {
            if (s.getLength() == minLength) {
                result.add(s);
            }
        }

        return result.toArray(new Segment[0]);
    }
}
