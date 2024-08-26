package behavioral.iterator;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 26, 2024
 */
public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        ListImpl<Integer> integerList = new ListImpl<>(integers);
        Iterator<Integer> integerIterator = integerList.iterator();
        while (integerIterator.hasNext()) {
            Integer i = integerIterator.next();
            System.out.print(i + ", ");
        }

        System.out.println();

        String[] strings = {"a", "b", "c", "d", "e"};
        ListImpl<String> stringList = new ListImpl<>(strings);
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            String s = stringIterator.next();
            System.out.print(s + ", ");
        }
    }
}
