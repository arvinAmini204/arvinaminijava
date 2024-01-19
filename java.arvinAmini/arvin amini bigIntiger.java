public class BigIntegerOperations {

    public static void main(String[] args) {
        // ایجاد دو بیگ اینتیجر
        int[] firstNumber = new int[100];
        int[] secondNumber = new int[100];

        for (int i = 0; i < 100; i++) {
            firstNumber[i] = i;
            secondNumber[i] = 99 - i;
        }

        // جمع دو بیگ اینتیجر
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < 100; i++) {
            sum = sum.add(new BigInteger("" + firstNumber[i] + secondNumber[i]));
        }
        System.out.println("جمع دو بیگ اینتیجر: " + sum);

        // ضرب دو بیگ اینتیجر
        BigInteger product = new BigInteger("1");
        for (int i = 0; i < 100; i++) {
            product = product.multiply(new BigInteger("" + firstNumber[i] + secondNumber[i]));
        }
        System.out.println("ضرب دو بیگ اینتیجر: " + product);
    }
}