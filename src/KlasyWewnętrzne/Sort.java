package KlasyWewnętrzne;

import java.util.Arrays;

public class Sort{
    public static void main(String[] args) {
        Sortable sortable = new Sortable() {
            @Override
            public int[] sort(int[] tab) {
                int n = tab.length;
                do {
                    for (int i = 0; i < tab.length - 1; ++i) {
                        if (tab[i] > tab[i + 1]) {
                            int a = tab[i];
                            int b = tab[i + 1];
                            tab[i + 1] = a;
                            tab[i] = b;
                        }
                    }
                    n = n - 1;
                } while (n > 1);
                return new int[]{0};
            }
        };
        int[] tab = {9078, 88732549, 281, 67, -123, 6786, 9898, 1000};
        sortable.sort(tab);
        System.out.println(Arrays.toString(tab));
    }
}
