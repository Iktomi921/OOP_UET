public class Week4 {
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        return Math.max(a, b);
    }

    public static int minArray(int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static String calculateBMI(double weight, double height) {
        // Tinh BMI
        double BMI = (double) weight / Math.pow(height, 2);
        BMI = Double.parseDouble(String.format("%.1f", BMI));
        if (BMI < 18.5) {
            return "Thiếu cân";
        } else if (BMI <= 22.9) {
            return "Bình thường";
        } else if (BMI <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
