import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

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

        System.out.println();
        System.out.println("graph");
        int[] oo1o1 = Arrays.copyOfRange(arr, 2, 4);
        int[] oo1o2 = Arrays.copyOfRange(arr, 0, 7);
        int[][] oo2o1 = Arrays.copyOfRange(arr2D, 2, 4);
        int[][] oo2o2 = Arrays.copyOfRange(arr2D, 0, 7);
        int[][][] oo3o1 = Arrays.copyOfRange(arr3D, 2, 4);
        int[][][] oo3o2 = Arrays.copyOfRange(arr3D, 0, 7);
        int[][][][] oo4o1 = Arrays.copyOfRange(arr4D, 2, 4);
        int[][][][] oo4o2 = Arrays.copyOfRange(arr4D, 0, 7);

        System.out.println("oo1o1");
        System.out.println();
        for (int i : oo1o1) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
        }
        System.out.println("oo1o2");
        System.out.println();
        for (int i : oo1o2) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
        }
        System.out.println("oo2o1");
        System.out.println();
        for (int[] i2 : oo2o1) {
            if (i2 != null)
                for (int i : i2) {
                    char[] graph = new char[i];
                    Arrays.fill(graph, '*');
                    System.out.println(new String(graph) + i);
                }
        }
        System.out.println("oo2o2");
        System.out.println();
        for (int[] i2 : oo2o2) {
            if (i2 != null)
                for (int i : i2) {
                    char[] graph = new char[i];
                    Arrays.fill(graph, '*');
                    System.out.println(new String(graph) + i);
                }
        }


        System.out.println("oo3o1");
        System.out.println();
        for (int[][] oo3o12 : oo3o1)
            if (oo3o12 != null)
                for (int[] i2 : oo3o12) {
                    if (i2 != null)
                        for (int i : i2) {
                            char[] graph = new char[i];
                            Arrays.fill(graph, '*');
                            System.out.println(new String(graph) + i);
                        }
                }
        System.out.println("oo3o2");
        System.out.println();
        for (int[][] oo3o21 : oo3o1)
            if (oo3o21 != null)
                for (int[] i2 : oo3o21) {
                    if (i2 != null)
                        for (int i : i2) {
                            char[] graph = new char[i];
                            Arrays.fill(graph, '*');
                            System.out.println(new String(graph) + i);
                        }
                }

        String[][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][][] str3D = {{{"aaa", "bbb"}, {"ccc", "ddd"}}, {{"AAA", "BBB"}, {"CCC", "DDD"}}};
        String[][][] str3D2 = {{{"aaa", "bbb"}, {"ccc", "ddd"}}, {{"AAA", "BBB"}, {"CCC", "DDD"}}};

        System.out.println("equals");
        System.out.println();
        System.out.println("2D");
        System.out.println(Arrays.equals(str2D, str2D2));
        System.out.println(Arrays.deepEquals(str2D, str2D2));

        System.out.println();
        System.out.println("3D");
        System.out.println(Arrays.equals(str3D, str3D2));
        System.out.println(Arrays.deepEquals(str3D, str3D2));

        System.out.println();
        System.out.println("binary search");
        char[] charArr = {'A', 'B', 'C', 'D', 'E', 'B', 'A', 'E', 'Z', 'H', 'Y', 'Y', 'A', 'B', 'C'};
        System.out.println("B-Z-E");
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.binarySearch(charArr, 'B'));
        System.out.println(Arrays.binarySearch(charArr, 'Z'));
        System.out.println(Arrays.binarySearch(charArr, 'E'));

        System.out.println();
        System.out.println("after sorting");
        Arrays.sort(charArr);
        System.out.println("B-Z-E");
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.binarySearch(charArr, 'B'));
        System.out.println(Arrays.binarySearch(charArr, 'Z'));
        System.out.println(Arrays.binarySearch(charArr, 'E'));

        System.out.println();
        System.out.println("as list");
        List<Integer> intArr = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        List<Integer> intArr2 = Arrays.asList(1, 2, 3, 4, 5);
//        intArr.add(new Integer[]{1});
//        intArr2.add(3);
        List intArr3 = new ArrayList(Arrays.asList(intArr));
        List intArr4 = new ArrayList(Arrays.asList(intArr2));
        intArr3.add(10);
        intArr3.add(11);
        System.out.println(intArr3);
        System.out.println(intArr4);

        System.out.println();
        System.out.println("paralle xxx");
        Stream stream = intArr3.parallelStream();
        stream.forEach(System.out::println);

        int[][] intArr2D = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[][][] intArr3D = {{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}, {
                {17, 18, 19, 20}, {21, 22, 23, 24}, {25, 26, 27, 28}}, {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}}};
        int[][][][] intArr4D = {{{{1,2,3,4,5}}},{{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}, {
                {17, 18, 19, 20}, {21, 22, 23, 24}, {25, 26, 27, 28}}, {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}}}};
        Arrays.stream(intArr2D).forEach(ints -> System.out.println(Arrays.toString(ints)));
        Arrays.stream(intArr3D).forEach(ints-> System.out.println(Arrays.deepToString(ints)));
        Arrays.stream(intArr4D).forEach(ints-> System.out.println(Arrays.deepToString(ints)));

        System.out.println();
        System.out.println("spliterator");
        Spliterator<int[]> spliterator = Arrays.stream(intArr2D).spliterator();
        System.out.println(spliterator.characteristics());
        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator.getExactSizeIfKnown());

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
