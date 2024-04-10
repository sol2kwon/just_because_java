import enumm.AuthGrade;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();
        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 "+ authGrade.getDescription() +"입니다.");

        System.out.println("===메뉴 목록===");
        if (authGrade.getLevel() > 0){
            System.out.println("- 메인화면");
        }

        if (authGrade.getLevel() > 1){
            System.out.println("- 이메일관리");
        }

        if (authGrade.getLevel() > 2){
            System.out.println("- 관리자화면");
        }
    }
}