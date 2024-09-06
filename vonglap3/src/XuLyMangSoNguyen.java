import java.util.Arrays;
import java.util.Scanner;

public class XuLyMangSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        // Khai báo mảng số nguyên
        int[] mang = new int[n];

        // Nhập các phần tử của mảng từ bàn phím
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }

        // Sắp xếp mảng tăng dần
        Arrays.sort(mang);

        // Xuất mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp:");
        System.out.println(Arrays.toString(mang));

        // Tìm phần tử nhỏ nhất
        int nhoNhat = mang[0]; // Phần tử đầu tiên sau khi sắp xếp là nhỏ nhất

        // Tìm phần tử lớn nhất
        int lonNhat = mang[mang.length - 1]; // Phần tử cuối cùng sau khi sắp xếp là lớn nhất

        // Xuất phần tử nhỏ nhất và lớn nhất
        System.out.println("Phần tử nhỏ nhất: " + nhoNhat);
        System.out.println("Phần tử lớn nhất: " + lonNhat);

        sc.close(); // Đóng Scanner
    }
}
