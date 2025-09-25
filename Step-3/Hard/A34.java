import java.util.*;

class A34 {
    public List<List<Integer>> mergeOverlap(List<List<Integer>> intervals) {
        if (intervals.size() <= 1) return intervals;

        intervals.sort((a, b) -> a.get(0) - b.get(0));
        List<List<Integer>> merged = new ArrayList<>();
        List<Integer> current = new ArrayList<>(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            List<Integer> next = intervals.get(i);
            if (current.get(1) >= next.get(0)) {
                current.set(1, Math.max(current.get(1), next.get(1)));
            } else {
                merged.add(new ArrayList<>(current));
                current = new ArrayList<>(next);
            }
        }

        merged.add(current);
        return merged;
    }
}
