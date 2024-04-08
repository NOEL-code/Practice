package day04;

import java.util.Scanner;

public class Main {
    static MemberServiceImpl memberService = new MemberServiceImpl();
    static Scanner scanner = new Scanner(System.in);
    static int serviceNum = 1;
    static boolean isLogin = false;

    static Member nowUser;

    public static void main(String[] args) {

        while (serviceNum != 0){

            if(isLogin){
                memberMention();
            }
            else {
                initialMention();
            }

            serviceNum = scanner.nextInt();

            if(serviceNum == 1) {
                join();
            }
            else if(serviceNum == 2) {
                login();
            }
            else if(serviceNum == 3) {
                update();
            }
            else if(serviceNum == 4) {
                leave();
            }
            else if(serviceNum == 5) {
                logout();
            }
            else if(serviceNum == 0) {
                break;
            }
        }


    }

    public static void initialMention() {
        System.out.println("이용하고 싶은 서비스를 입력하세요.");
        System.out.println("1: 회원가입");
        System.out.println("2: 로그인");
        System.out.println("0: 종료");

    }

    public static void memberMention(){
        System.out.println("3: 회원정보 수정");
        System.out.println("4: 탈퇴");
        System.out.println("0: 종료");
    }

    public static void join() {
        Member member = new Member();

        String name;
        Long ID = 0L;
        String PW;

        System.out.println("회원가입 서비스를 선택하셨습니다.");



        while (true) {
            try {
                System.out.print("아이디를 입력해주세요(숫자만 입력가능). :");
                if (scanner.hasNextLong()) {
                    ID = scanner.nextLong();
                    Member checkMember = memberService.findById(ID);
                    if (checkMember == null) {
                        break;
                    }
                    System.out.println("아이디가 중복 되었습니다. 다른 아이디로 입력해주세요");
                } else {
                    System.out.println("아이디에 숫자만 입력해주세요.");
                    scanner.next(); // 잘못된 입력을 제거하고 다음 입력을 받음
                }
            } catch (Exception e) {
                System.out.println("아이디에 숫자만 입력해주세요.");
                scanner.next(); // 잘못된 입력을 제거하고 다음 입력을 받음
            }
        }



        System.out.print("이름을 입력해주세요. :");
        name = scanner.next();
        System.out.print("비밀번호를 입력해주세요. :");
        PW = scanner.next();

        member.setName(name);
        member.setID(ID);
        member.setPassword(PW);

        memberService.join(member);

        System.out.println("회원가입이 완료 되었습니다.");
    }

    public static void login(){
        Long ID;
        String PW;

        System.out.println("로그인 서비스를 선택하셨습니다.");
        System.out.print("아이디를 입력해주세요.(숫자만 입력가능) :");
        ID = scanner.nextLong();
        System.out.print("비밀번호를 입력해주세요. :");
        PW = scanner.next();

        nowUser = memberService.login(ID, PW);

        if(nowUser != null) {
            isLogin = true;
            System.out.println("로그인 성공!");
        }
        else {
            System.out.println("로그인 실패!");
        }
    }

    public static void update(){
        String name;
        String PW;

        System.out.print("변경할 이름을 입력해주세요. :");
        name = scanner.next();
        System.out.print("변경할 비밀번호를 입력해주세요. :");
        PW = scanner.next();

        nowUser.setName(name);
        nowUser.setPassword(PW);

        memberService.update(nowUser);

        System.out.println("회원정보 수정 완료");
    }

    public static void leave(){
        memberService.leave(nowUser);
        isLogin = false;
        System.out.println("회원 탈퇴 완료!");
    }
    public static void logout(){
        isLogin = false;
        nowUser = null;
    }

}
