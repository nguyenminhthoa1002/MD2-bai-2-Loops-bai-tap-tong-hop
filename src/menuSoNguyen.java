import java.util.Scanner;

public class menuSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên n bất kỳ: ");
        int number = scanner.nextInt();
        do {
            System.out.println("**************MENU***************");
            System.out.println("1. In ra các số chẵn và tính tổng trong khoảng 0...n");
            System.out.println("2. In ra các số lẻ và tính tổng trong khoảng 0...n");
            System.out.println("3. Kiểm tra n có phải số nguyên tố không");
            System.out.println("4. Kiểm tra n có phải số hoàn hảo không");
            System.out.println("5. In ra các số nguyên tố trong khoảng 0...n");
            System.out.println("6. In ra các ước số của n và tính tổng");
            System.out.println("7. Thoát");

            System.out.println("Sự lựa chọn của bạn là: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int i = 0; i < number; i++) {
                        if (i%2==0){
                            System.out.printf("Các số chẵn trong khoảng từ 0- %d là: %d\n",number,i);
                            sum +=i;
                        }
                    }
                    System.out.printf("Tổng các số chẵn trong khoảng từ 0- %d là: %d\n",number,sum);
                    break;
                case 2:
                    int sumLe = 0;
                    for (int i = 0; i < number; i++) {
                        if (i%2!=0) {
                            System.out.printf("Các số lẻ trong khoảng từ 0- %d là: %d\n",number,i);
                            sumLe +=i;
                        }
                    }
                    System.out.printf("Tổng các số lẻ trong khoảng từ 0- %d là: %d\n",number,sumLe);
                    break;
                case 3:
                    if (number>=2){
                        boolean check = false;
                        for (int i = 2; i < Math.sqrt(number); i++) {
                            if (number % i==0) {
                                check = true;
                                break;
                            }
                        }
                        if (check) {
                            System.out.printf("%d không phải là số nguyên tố\n",number);
                        } else {
                            System.out.printf("%d là số nguyên tố\n",number);
                        }
                    } else {
                        System.out.printf("%d không phải là số nguyên tố\n",number);
                    }
                    break;
                case 4:
                    int sumUoc = 0;
                    for (int i = 1; i < number; i++) {
                        if (number%i == 0) {
                            sumUoc +=i;
                        }
                    }
                    if (sumUoc==number) {
                        System.out.printf("Số %d là số hoàn hảo\n",number);
                    } else {
                        System.out.printf("Số %d không phải là số hoàn hảo\n",number);
                    }
                    break;
                case 5:
                    if (number>=2) {
                        System.out.printf("Các số nguyên tố từ 0 đến %d là: \n",number);
                        for (int i = 2; i < number; i++) {
                            boolean check = false;
                            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                                if (i%j==0) {
                                    check = true;
                                    break;
                                }
                            }
                            if (!check) {
                                System.out.printf("%d\t",i);
                            }
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 6:
                    int sumUocSo = 0;
                    System.out.printf("Các ước số của %d là: \n",number);
                    for (int i = 1; i <= number; i++) {
                        if (number%i==0) {
                            System.out.printf("%d\t",i);
                            sumUocSo += i;
                        }
                    }
                    System.out.printf("\nTổng các ước của %d là: %d\n",number,sumUocSo);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn số từ 1-6");
            }
        } while (true);
    }
}
