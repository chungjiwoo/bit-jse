package day09;

import java.util.ArrayList;
import java.util.Scanner;

import day06.Student;
import util.ScannerUtil;

//학생관리 프로그램
// ArrayList를 사용하여
// 작성하시오

public class StudentViewer02 {

    private Scanner scanner;
    private ArrayList<Student> list;
    private int id = 1;
    
    public StudentViewer02() {
        scanner = new Scanner(System.in);
        list = new ArrayList<>();

    }
    
    
    public void showMenu() {
        
        while(true) {
            
            String message = "1. 입력 2. 출력 3. 종료\n";
            message+="> ";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            
            if(userChoice == 1) {
                addStudent();
            
            }else if(userChoice == 2) {
                printList();
            
            }else if(userChoice == 3) {
                
                System.out.println("사용해주셔서 감사합니다.");
                break;
               
            }
            
        }
    }

    private void addStudent() {
        Student s = new Student();
        
        s.setId(id++);

        System.out.println("이름: ");
        s.setName(ScannerUtil.nextLine(scanner));
        
        s.setKorean(ScannerUtil.nextInt(scanner, "국어: ", 0, 100));
        s.setEnglish(ScannerUtil.nextInt(scanner, "영어: ", 0, 100));
        s.setMath(ScannerUtil.nextInt(scanner, "수학: ", 0, 100)); 
        
        list.add(s);
    }
    
    private void printList() {
        if(list.size()==0) {
            System.out.println("아직 작성된 글이 없습니다.");
            
        }else {
            for(int i = 0; i < list.size(); i++) {
                System.out.printf("%d번 %s\n",i+1,list.get(i).getName());
            }
            String message = "상세보기 할 학생의 번호를 입력해주세요(0은 뒤로가기)\n";
            message += ">";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, list.size())-1;
            if(userChoice != -1) {
                printOne(userChoice);
            }
            
        }
    }
    
    private void printOne(int index) {
        Student s = list.get(index);
        s.printinfo();
        
        String message = "1. 수정 2. 삭제 3. 목록으로\n";
        message += ">";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
        
        if(userChoice == 1) {
            updateStudent(index);
            
        }else if (userChoice == 2) {
            deleteStudent(index);
            
        }else if (userChoice == 3) {
            printList();
        }
        
    }
    
    private void updateStudent(int index){
        list.get(index).setKorean(ScannerUtil.nextInt(scanner, "국어:" , 0, 100));
        list.get(index).setEnglish(ScannerUtil.nextInt(scanner, "영어:" , 0, 100));
        list.get(index).setMath(ScannerUtil.nextInt(scanner, "수학:" , 0, 100));
        
        printOne(index);
    }
    
    private void deleteStudent(int index) {
        System.out.print("정말로 삭제 하시겠습니까? y/n\n");
        String agree = ScannerUtil.nextLine(scanner);
        if(agree.toLowerCase().equals("y")) {
            list.remove(index);
            printList();
        }else {
            printOne(index);
        }
        
    }
}
