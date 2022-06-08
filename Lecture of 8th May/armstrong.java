public class armstrong {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748

        int num = 54747;
        int temp1 = num;
        int temp2 = num;

        int digitsCount = 0;

        while (temp2 != 0) {
            temp2 = temp2 / 10;
            digitsCount++;
        }

        int sum = 0;

        while (temp1 != 0) {
            int lastDig = temp1 % 10;

            int r = 1;

            // int cube = lastDig * lastDig * lastDig;

            for (int i = 1; i <= digitsCount; i++) {
                r = r * lastDig;
            }

            // sum = sum + cube;
            sum = sum + r;

            temp1 = temp1 / 10;
        }

        if (sum == num) {
            System.out.println("It's an armstrong number.");
        } else {
            System.out.println("It's not an armstrong number.");
        }

    }
}