public class Fibonacci {

    public static void main(String[] args) {
        // محاسبه n عدد اول از اعداد فیبوناچی
        int n = 10;

        // ایجاد آرایه ای برای ذخیره اعداد فیبوناچی
        int[] fibs = new int[n];

        // مقداردهی اولیه دو عدد اول
        fibs[0] = 0;
        fibs[1] = 1;

        // محاسبه اعداد بعدی
        for (int i = 2; i < n; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }

        // چاپ اعداد فیبوناچی
        for (int i = 0; i < n; i++) {
            System.out.print(fibs[i] + " ");
        }
    }
}