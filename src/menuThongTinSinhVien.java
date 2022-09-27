import java.util.Calendar;
import java.util.Scanner;

public class menuThongTinSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("*************MENU*****************");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Tính tuổi sinh viên");
            System.out.println("4. Thoát");
            System.out.println("Sự lựa chọn của bạn là: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập mã sinh viên: ");
                    String studentId = scanner.nextLine();
                    System.out.println("Nhập tên sinh viên: ");
                    String studentName = scanner.nextLine();
                    System.out.println("Nhập năm sinh: ");
                    int studentYearBirth = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập giới tính: ");
                    String gender = scanner.nextLine();
                    System.out.println("Nhập số điện thoại: ");
                    String phone = scanner.nextLine();
                    System.out.println("Nhập email: ");
                    String email = scanner.nextLine();
                    System.out.println("Nhập địa chỉ: ");
                    String address = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("----------THÔNG TIN SINH VIÊN---------");
                    System.out.printf("%-15s%-15s%-20s%-30s%-15s%-15d\n","Mã sinh viên: ",studentId,"Tên sinh viên: ",studentName,"Năm sinh: ",studentYearBirth);
                    System.out.printf("%-15s%-15s%-20s%-30s%-15s%-15s\n","Giới tính: ",gender,"Email: ",email,"Số điện thoại: ",phone);
                    System.out.printf("%-15s%-100s\n", "Địa chỉ", address);
                    break;
                case 3:
                    Calendar instance = Calendar.getInstance();
                    int year = instance.get(Calendar.YEAR);
                    int tuoiSinhVien = year - studentYearBirth;
                    System.out.printf("Tuổi của sinh vin là: %d",tuoiSinhVien);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn số từ 1-3");
            }
        } while (true);
    }
}
