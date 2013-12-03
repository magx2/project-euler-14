package pl.grzeslowski.project_euler_14;

import java.util.HashMap;
import java.util.Map;

public class ProjectEuler14Partition implements ProjectEuler14 {

    private final Map<Long, Long> cache = new HashMap<>();

    @Override
    public long getLongestSequence(final long maxNumber) {
        long max = 0;

        for (long i = maxNumber; i > 0; i--) {
            final long chainLength = getChainLength(i);

            if (chainLength > max) {
                max = chainLength;
            }
        }

        return max;
    }

    private final long getChainLength(final long item) {
        if (item == 1L) {
            return 1L;
        } else if (cache.containsKey(item)) {
            return cache.get(item);
        } else {
            final long nextItem = collatzFunction(item);
            final long chainLength = getChainLength(nextItem) + 1;

            cache.put(item, chainLength);

            return chainLength;
        }
    }

    private long collatzFunction(final long item) {
        if (item % 2 == 0) {
            return item / 2L;
        } else {
            return 3L * item + 1L;
        }
    }

}
