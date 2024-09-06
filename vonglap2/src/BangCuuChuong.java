import java.util.Scanner;

public class BangCuuChuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập một số nguyên bất kỳ từ bàn phím
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();

        // Dùng vòng lặp để in bảng cửu chương của số n
        System.out.println("Bảng cửu chương của " + n + ":");
        for (int i = 1; i <= 10; i++) {
            // In kết quả của từng phép nhân
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }

        sc.close(); // Đóng đối tượng Scanner
    }
}
