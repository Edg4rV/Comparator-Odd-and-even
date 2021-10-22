import java.util.Comparator;
import java.util.List;

class FilterEvenOdd implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 != 0 && o2 % 2 != 0) {
            return 1;
        } else if (o1 % 2 == 0 && o2 % 2 == 0) {
            return -1;
        } else if (o1 % 2 == 0 && o2 % 2 != 0) {
            return 1;
        } else if (o1 % 2 != 0 && o2 % 2 == 0) {
            return -1;
        } else {
            return o1.compareTo(o2);
        }

    }
}

class Utils {
    public static List<Integer> sortOddEven(List<Integer> numbers) {
        numbers.sort(Comparator.naturalOrder());
        numbers.sort(new FilterEvenOdd());
        return numbers;
    }
}










