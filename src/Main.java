import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ID=0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
        ArrayList<Student>data = new ArrayList<>();
        Menu();
        while(flag){
            int chon = sc.nextInt();
            switch(chon){
                case 1 : {
                    ID++;
                    System.out.println("Nhập tên");
                    String Name = ac.nextLine();
                    System.out.println("Nhập tuổi");
                    int Age = sc.nextInt();
                    System.out.println("Nhập địa chỉ");
                    String Address = ac.nextLine();
                    System.out.println("Nhập điểm trung bình");
                    double Gpa = sc.nextDouble();
                    data.add(new Student(ID, Name, Age, Address, Gpa));
                    Menu();
                    break;
                }
                case 2 : {
                    System.out.println("Nhập id bạn muốn sửa");
                    int nhap = sc.nextInt();
                    for(Student value : data){
                        if(nhap == value.ID){
                            System.out.println("Nhập tên muốn sửa");
                            String Name = ac.nextLine();
                            System.out.println("Nhập tuổi muốn sửa");
                            int Age = sc.nextInt();
                            System.out.println("Nhập địa chỉ muốn sửa");
                            String Address = ac.nextLine();
                            System.out.println("Nhập điểm trung bình muốn sửa");
                            double Gpa = sc.nextDouble();
                            value.Name = Name;
                            value.Age = Age;
                            value.Address = Address;
                            value.Gpa = Gpa;
                            Menu();
                        }
                        else {
                            System.out.println("Không tìm thấy id bạn vừa nhập");
                            Menu();
                        }
                    }
                    break;
                }
                case 3 : {
                    System.out.println("Nhập điểm tb của student muốn xoá");
                    double gpa = sc.nextDouble();
                    for(int i =0;i<data.size();i++){
                        if(data.get(i).Gpa == gpa){
                            data.remove(data.get(i));
                            System.out.println("Xoá thành công");
                            Menu();
                        }
                        else {
                            System.out.println("Không tìm thấy gpa này");
                            Menu();
                        }
                    }
                }
                case 4 : {
                    Collections.sort(data);
                    System.out.println("Danh sách sinh viên");
                    for(Student value : data){
                        System.out.println("Tên sv :"+value.Name + " Điểm GPA :" +value.Gpa);
                    }
                    Menu();
                    break;
                }
                case 5 : {
                    for(Student value : data){
                        System.out.println("Tên sv :"+value.Name + " Điểm GPA :" +value.Gpa);
                    }
                    Menu();
                    break;
                }
                case 0 :
                    flag = false;
            }
        }
    }

    private static void Menu() {
        System.out.println("1:Add student");
        System.out.println("2:Edit student by id");
        System.out.println("3:Delete student by gpa");
        System.out.println("4:Sort student by name");
        System.out.println("5:Show student");
        System.out.println("0:Exit");
    }
}