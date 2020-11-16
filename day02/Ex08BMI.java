package day02;
// 사용자로부터 키와 몸무게를 입력 받아서 BMI를 계산하여 출력하는
// 프로그램을 작성하시오
// BMI는 몸무게(kg) / 키(m) / 키(m) 입니다.


import java.util.Scanner;

public class Ex08BMI {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("몸무게: ");
        double weight = scanner.nextDouble();
        
        System.out.print("키: ");
        double height = scanner.nextDouble();
        
        double BMI = weight / height / height;
        
        
        System.out.printf("BMI 수치는 : %.2f입니다 \n", BMI);
        
        scanner.close();
    }

}
