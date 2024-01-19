public class Bingo {

    private int[] numbers;

    public Bingo(int n) {
        this.numbers = new int[n];
        for (int i = 0; i < n; i++) {
            this.numbers[i] = i + 1;
        }
    }

    public void printNumbers() {
        for (int i = 0; i < this.numbers.length; i++) {
            System.out.print(this.numbers[i] + " ");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        // تعداد اعداد بینگو
        int n = 25;

        // ایجاد یک شیء از کلاس Bingo
        Bingo bingo = new Bingo(n);

        // چاپ اعداد بینگو
        bingo.printNumbers();
    }
}
