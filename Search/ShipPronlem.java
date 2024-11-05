package Search;

public class ShipPronlem {
public int shipWithinDays(int[] weights, int days) {
    int lo = 0;
    int hi = 0;
    for (int weight : weights) {
        lo = Math.max(lo, weight);
        hi += weight;
    }

    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        int requiredDays = 1;
        int currentCapacity = 0;

        for (int weight : weights) {
            if (currentCapacity + weight > mid) {
                requiredDays++;
                currentCapacity = 0;
            }
            currentCapacity += weight;
        }

        if (requiredDays > days) {
            lo = mid + 1;
        } else {
            hi = mid;
        }
    }

    return lo;
}
}
