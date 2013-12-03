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
    private final int in;
    private final long out;

    public ProjectEuler14PartitionTest(final int in, final long out) {
        this.in = in;
        this.out = out;
    }

    @Parameters
    public static Collection<Object[]> data() {
        final Object[][] data = new Object[][] { { 1, 4L } };
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
