import jdk.jfr.internal.tool.Main;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class JavaStandard {
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

    @Test
    public void comparable() {
        Person insoo = new Person("insoo", 31);
        Person yongsoo = new Person("yongsoo", 25);
        int isBrother = insoo.compareTo(yongsoo);
        Assert.assertEquals(1, isBrother);
    }
    @Test
    public void comparator(){
        AnotherPerson p=new AnotherPerson();
        Person p1 = new Person("insoo",31);
        Person p2 = new Person("yongsoo",25);

        Assert.assertEquals(1,p1.compareTo(p2));

    }


    @Test
    public void comparatorAndComparable(){
        Person insoo = new Person("insoo", 31);
        Person yongsoo = new Person("yongsoo", 26);

        TheOtherPerson geunhee = new TheOtherPerson("geunhee",55);
        TheOtherPerson geunheeFriend = new TheOtherPerson("geunhee",55);
        Assert.assertEquals(1,geunhee.compare(insoo,yongsoo));
        Assert.assertEquals(1,geunhee.compareTo(insoo));
        Assert.assertEquals(1,geunhee.compareTo(yongsoo));
        Assert.assertEquals(-1,insoo.compareTo(geunhee));
        Assert.assertEquals(-1,yongsoo.compareTo(geunhee));
        Assert.assertEquals(0,geunheeFriend.compareTo(geunhee));

    }
    class TheOtherPerson extends Person implements Comparator{

        public TheOtherPerson(String name, int age) {
            super(name, age);
        }

        @Override
        public int compare(Object o1, Object o2) {
            if (!(o1 instanceof Person && o2 instanceof Person)) throw new IllegalArgumentException("Person Type Only");
            Person o11 = (Person) o1;
            Person o12 = (Person) o2;
            return o11.age> o12.age ? 1: o11.age< o12.age ? -1 :0;
        }
    }
    class AnotherPerson implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {

            if (!(o1 instanceof Person && o2 instanceof Person)) throw new IllegalArgumentException("Person Type Only");
            Person o11 = (Person) o1;
            Person o12 = (Person) o2;
            return o11.age> o12.age ? 1: o11.age< o12.age ? -1 :0;
        }
    }

    class Person implements Comparable {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Object o) {
            if (!(o instanceof Person))
                throw new IllegalArgumentException("Parameter Type Only is Possible Person Type");
            return Integer.compare(this.age, ((Person) o).age);
        }
    }

}
