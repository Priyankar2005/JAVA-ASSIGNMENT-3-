interface MaxAndAvg {
    void find(int a, int b);
}

class Execute {
    public static void main(String[] args) {
        MaxAndAvg maxAndAvg = (a, b) -> {
            int max = a > b ? a : b;
            double avg = (a + b) / 2.0;
            System.out.println("Max: " + max + ", Avg of the two: " + avg);
        };
        maxAndAvg.find(10, 20);
    }
}