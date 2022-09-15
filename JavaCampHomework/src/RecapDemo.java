public class RecapDemo {
    public static void main(String[] args) {
        int num1 = 75;
        int num2 = 40;
        int num3 = 25;
        if (num1 > num2 && num1 > num3) {
            System.out.println("Biggest number: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Biggest number: " + num2);
        } else {
            System.out.println("Biggest number: " + num3);
        }
    }
}
