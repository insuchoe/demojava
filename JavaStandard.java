import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class JavaStandard {
    @Test
    public void ArraysEx() {


        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};
        int[][][] arr3D = {{{111, 112, 113}, {221, 222, 223}, {331, 332, 333}},
                {{999, 998, 997}, {888, 887, 886}}};
        int[][][][] arr4D = {{{{1111, 1112, 1113}, {2221, 2222, 2223}}
                , {{3331, 3332, 3333}, {4441, 4442, 4443}}
                , {{5551, 5552, 5553}, {6661, 6662, 6663}}}
                , {{{9991, 9992, 9993}, {8881, 8882, 8883}}
                , {{7771, 7772, 7773}, {6661, 6662, 6663}}}};
        System.out.println("arr is " + Arrays.toString(arr));
        System.out.println("arr2D is " + Arrays.deepToString(arr2D));
//        System.out.println("arr3D is " + Arrays.toString(arr3D));
        System.out.println("arr3D is " + Arrays.deepToString(arr3D));
        System.out.println("arr4D is " + Arrays.deepToString(arr4D));

        System.out.println();
        System.out.println("copy of");

        int[] o = Arrays.copyOf(arr, arr.length);
        System.out.println(o);
        System.out.println(Arrays.toString(o));
        int[][] o1 = Arrays.copyOf(arr2D, arr2D.length);
        System.out.println(o1);
        System.out.println(Arrays.deepToString(o1));
        int[][][] o2 = Arrays.copyOf(arr3D, arr3D.length);
        System.out.println(o2);
        System.out.println(Arrays.deepToString(o2));
        int[][][][] o3 = Arrays.copyOf(arr4D, arr4D.length);
        System.out.println(o3);
        System.out.println(Arrays.deepToString(o3));

        System.out.println();
        System.out.println("copy of range");
        int[] o1o1 = Arrays.copyOfRange(arr, 2, 4);
        int[] o1o2 = Arrays.copyOfRange(arr, 0, 7);
        int[][] o2o1 = Arrays.copyOfRange(arr2D, 2, 4);
        int[][] o2o2 = Arrays.copyOfRange(arr2D, 0, 7);
        int[][][] o3o1 = Arrays.copyOfRange(arr3D, 2, 4);
        int[][][] o3o2 = Arrays.copyOfRange(arr3D, 0, 7);
        int[][][][] o4o1 = Arrays.copyOfRange(arr4D, 2, 4);
        int[][][][] o4o2 = Arrays.copyOfRange(arr4D, 0, 7);

        System.out.println("o1o1 is " + Arrays.toString(o1o1));
        System.out.println("o1o2 is " + Arrays.toString(o1o2));
        System.out.println("o2o1 is " + Arrays.toString(o2o1));
        System.out.println("o2o2 is " + Arrays.toString(o2o2));
        System.out.println("o3o1 is " + Arrays.toString(o3o1));
        System.out.println("o3o2 is " + Arrays.toString(o3o2));
        System.out.println("o4o1 is " + Arrays.toString(o4o1));
        System.out.println("o4o2 is " + Arrays.toString(o4o2));

        System.out.println();
        System.out.println("fill");
        Arrays.fill(o1o1, 9);
        Arrays.fill(o1o2, 9);
        Arrays.fill(o2o1, new int[]{9});
        Arrays.fill(o2o2, new int[]{9});
        Arrays.fill(o3o1, new int[][]{{9}, {8}});
        Arrays.fill(o3o2, new int[][]{{9}, {8}});
        Arrays.fill(o4o1, new int[][][]{{{9}, {8}}, {{7}, {6}}, {{5}, {4}}});
        Arrays.fill(o4o2, new int[][][]{{{9}, {8}}, {{7}, {6}}, {{5}, {4}}});
        System.out.println("o1o1 is " + Arrays.toString(o1o1));
        System.out.println("o1o2 is " + Arrays.toString(o1o2));
        System.out.println("o2o1 is " + Arrays.toString(o2o1));
        System.out.println("o2o2 is " + Arrays.toString(o2o2));
        System.out.println("o3o1 is " + Arrays.toString(o3o1));
        System.out.println("o3o2 is " + Arrays.toString(o3o2));
        System.out.println("o4o1 is " + Arrays.toString(o4o1));
        System.out.println("o4o2 is " + Arrays.toString(o4o2));

        System.out.println();
        System.out.println("set all");
        int[] oo = Arrays.copyOf(arr, arr.length);
        Arrays.setAll(oo, i -> getAnInt(oo.length));
        int[][] oo2D = Arrays.copyOf(arr2D, arr2D.length);
        Arrays.setAll(oo2D, i -> new int[]{getAnInt(oo2D.length)});
        System.out.println(Arrays.deepToString(oo2D));
        int[][][] oo3D = Arrays.copyOf(arr3D, arr3D.length);
        Arrays.setAll(oo3D, i -> new int[][]{{getAnInt(oo3D.length)},
                {getAnInt(oo3D.length)}});
        System.out.println(Arrays.deepToString(oo3D));
        int[][][][] oo4D = Arrays.copyOf(arr4D, arr4D.length);
        Arrays.setAll(oo4D, i -> new int[][][]{{{getAnInt(oo3D.length)},
                {getAnInt(oo3D.length)},
                {getAnInt(oo3D.length)},
                {getAnInt(oo3D.length)}}});
        System.out.println(Arrays.deepToString(oo4D));


    }

    private static int getAnInt(int oo) {
        return (int) (Math.random() * oo) + 1;
    }

    @Test
    public void ComparatorExTest() {
        ComparatorEx comparator = new ComparatorEx();
        System.out.println("print");
        comparator.print();
        System.out.println();

        System.out.println("after sort");
//        comparator.sort();
        comparator.print();
        System.out.println();

        System.out.println("case insensitive order sort");
//        comparator.sort(String.CASE_INSENSITIVE_ORDER);
//        comparator.sort();
        comparator.print();
        System.out.println();

        System.out.println("sort by descending");
        comparator.sortByDescending();
        comparator.print();
        System.out.println();
    }

    class ComparatorEx {
        String[] strArr = {
                "lion", "tiger", "bear", "elephant", "giraffe",
                "monkey", "zebra", "kangaroo", "penguin", "cheetah",
                "koala", "hippopotamus", "gorilla", "panda", "polar Bear",
                "leopard", "rhinoceros", "dolphin", "hhale", "jaguar",
                "ostrich", "alligator", "chimpanzee", "koala", "hedgehog",
                "ocelot", "kookaburra", "antelope", "armadillo", "bison",
                "Cobra", "Dingo", "Eagle", "Frog", "Gazelle",
                "Hawk", "Iguana", "Jackal", "Lynx", "Mongoose",
                "Nightingale", "Ocelot", "Pangolin", "Quokka", "Raccoon",
                "Squirrel", "Toucan", "Umbrellabird", "Vulture", "Wallaby",
                "X-ray Tetra", "Yak", "Zonkey", "Aardvark", "Baboon",
                "Capuchin Monkey", "Dalmatian", "Emu", "Fennec Fox", "Gecko",
                "Horse", "Ibex", "Jellyfish", "Kingfisher", "Lemur",
                "Manatee", "Nudibranch", "Orangutan", "Pangolin", "Quetzal",
                "Rattlesnake", "Salamander", "Tarsier", "Uakari", "Vervet Monkey",
                "Wombat", "Xerus", "Yellow-Eyed Penguin", "Zorse"
        };

        public void sort() {
            Arrays.sort(this.strArr);
        }

        public void sort(Comparator comparator) {
            Arrays.sort(this.strArr, comparator);
        }

        public void sortByDescending() {
            Comparator<Object> comparator = new Comparator<Object>() {
                @Override
                public int compare(Object o1, Object o2) {
                    if (o1 instanceof Comparable && o2 instanceof Comparable) {
                        Comparable co1 = (Comparable) o1;
                        Comparable co2 = (Comparable) o2;
                        return co1.compareTo(co2);
                    }
                    return -1;
                }

                @Override
                public boolean equals(Object o) {
                    return o.hashCode() == this.hashCode();
                }
            };
            Arrays.sort(this.strArr, comparator);
        }

        private void print() {
            System.out.println(Arrays.toString(strArr));
        }
    }
}
