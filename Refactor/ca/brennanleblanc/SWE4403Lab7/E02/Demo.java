package ca.brennanleblanc.SWE4403Lab7.E02;

public class Demo {
    public static void main(String[] args) {
        int[] array = {1, 6, 12, -6, 3, 8};
        MinMax minMax = new MinMax(array);

        System.out.printf("Maximum: %d\n", minMax.getMax());
        System.out.printf("Minimum: %d\n", minMax.getMin());
    }
}
