import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double pl = 0;
        for (int index = 0; index < 1285; index++) {
            if (index % 30 == 0) {
                pl = pl + 0.35D;
                double result = Math.ceil(pl);
                System.out.println("Время движения автобуса = " + index + " " + "секунд");
                System.out.println("Пройденное расстояние = " + result + " " + "км");
            }

        }
        System.out.println("Общее время движения автобуса 21.5 минута");

        int[] num = new int[]{12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21};
        int[] num2 = new int[7];
        int j = num.length;
        int index = 0;
        for (int i = 0; i < j; i++) {
            if (num[i] % 2 != 0) {
                num2[index] = num[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(num2));
        int max = num2[0];
        for (int i = 1; i < num2.length; i++) {
            max = Math.max(max, num2[i]);
        }
        System.out.println(max);
    }
}
