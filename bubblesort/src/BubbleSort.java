

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] massiv = {1, 3, 2, 13, 15, 2, 4, 7, 2, 1, 19, 0, 5};
        System.out.println();
        for (int i = 0; i < massiv.length; i++) {
            for (int j = i + 1; j < massiv.length; j++) {
                int current = massiv[i];
                int next = massiv[j];
                if (current > next) {
                    massiv[i] = next;
                    massiv[j] = current;
                }
            }
        }
        for (Integer i : massiv) {
            System.out.println(i);
        }

    }
}
