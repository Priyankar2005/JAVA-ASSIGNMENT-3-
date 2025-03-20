interface ArraySum {
    double sum(int[] arr);
}

class Convert {
    public static void main(String[] args) {
        ArraySum arraySum = (arr) -> {
            double sum = 0;
            for (int num : arr) sum += num;
            return sum;
        };

        System.out.println(arraySum.sum(new int[]{1, 2, 3, 4, 5}));
    }
}
