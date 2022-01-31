public class Prime {
    public Prime() {
        int[] nums = {1, 6, 42, 5, 9, 6, 7, 11, 42, 53, 51, 67, 54, 25};

        for (int i : nums) {
            if (i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.println(i);
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i != 1) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Prime intprime = new Prime();
    }
}