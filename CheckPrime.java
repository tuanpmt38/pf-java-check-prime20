public class CheckPrime {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;

        while (count < 20) {
            //dùng while
            boolean check = true;
            int N = (int) Math.sqrt(number);
            for (int i = 2; i <= N; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(+number);
                count++;
            }
            number++;

        }
    }
}
