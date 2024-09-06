import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập một số nguyên từ bàn phím
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();

        // Kiểm tra số nguyên có phải là số nguyên tố hay không
        if (n <= 1) {
            // Nếu n <= 1, thì không phải là số nguyên tố
            System.out.println(n + " không phải là số nguyên tố.");
        } else {
            boolean laNguyenTo = true; // Biến kiểm tra nếu là số nguyên tố

            // Sử dụng vòng lặp để kiểm tra chia hết cho các số từ 2 đến n - 1
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    laNguyenTo = false;
                    break; // Nếu chia hết cho i, không phải là số nguyên tố, thoát vòng lặp
                }
            }

            // In kết quả ra màn hình
            if (laNguyenTo) {
                System.out.println(n + " là số nguyên tố.");
            } else {
                System.out.println(n + " không phải là số nguyên tố.");
            }
        }

        sc.close(); // Đóng đối tượng Scanner
    }
}
