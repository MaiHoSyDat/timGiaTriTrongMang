import java.util.Scanner;

public class timGiaTriTrongMang {
    public static void main(String[] args) {
        String[] str = {"Hương","Hòa","Lan","Tiến","Đạt"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(name)){
                System.out.println("Trong danh sách có bạn tên " + name + " ở vị trí " + i);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Trong danh sách không tìm thấy bạn tên " + name);
        }
    }
}
