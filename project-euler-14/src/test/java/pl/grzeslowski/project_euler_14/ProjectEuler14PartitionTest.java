package pl.grzeslowski.project_euler_14;

import java.util.Arrays;
import java.util.Collection;

import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ProjectEuler14PartitionTest {
    private final long in;
    private final long out;

    public ProjectEuler14PartitionTest(final long in, final long out) {
        this.in = in;
        this.out = out;
    }

    @Parameters
    public static Collection<Object[]> data() {
        final Object[][] data = new Object[][] { { 1, 1L }, { 3, 8L },
                { 6, 9L }, { 9, 20L }, { 8, 17L }, { 10, 20L }, { 11, 20L },
                { 12, 20L }, { 13, 20L }, { 14, 20L }, { 15, 20L },
                { 16, 20L }, { 17, 20L }, { 18, 21L } };
        return Arrays.asList(data);
    }

    @Test
    public void test_normal_parameters() {

        // given
        final ProjectEuler14 euler = new ProjectEuler14Partition();

        // when
        final long difference = euler.getLongestSequence(in);

        // then
        Assertions.assertThat(difference).isEqualTo(out);
    }
}
