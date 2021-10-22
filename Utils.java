class Utils {

    public static List<Integer> sortOddEven(List<Integer> numbers) {
        Comparator<Integer> comparator = (o1, o2) -> {
            if (o1 % 2 == 0 && o2 % 2 == 0) {
                return Integer.compare(o1, o2) * -1;
            }
            if (o1 % 2 == 0) {
                return 1;
            }
            if (o2 % 2 == 0) {
                return -1;
            }
            return Integer.compare(o1, o2);
        };
        numbers.sort(comparator);
        return numbers;
    }
}
