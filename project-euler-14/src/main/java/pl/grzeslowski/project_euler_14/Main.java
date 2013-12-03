package pl.grzeslowski.project_euler_14;

public final class Main {

    public static void main(final String[] args) {
        final long maxNumber = 999_999L;

        final ProjectEuler14 euler = new ProjectEuler14Partition();

        System.out.println(euler.getLongestSequence(maxNumber));
    }

}
