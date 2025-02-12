package chapter10_access_modifier;

public class BankAccessModifierMain {
    public static void main(String[] args) {

    BankAccessModifier man =new BankAccessModifier(1234567, "Dks",
                                                    10000, "0112");
//비밀번호는 123456처럼 적어도 오류가 안 생김

    man.showAccountInfo();

    man.deposit(20000,"0112");
    man.deposit(5000,"1112");

    man.withdraw(5000,"0112");


    System.out.println("\n");
//e잔액이 그냥 초기값이랑 똑같게 나옴.//해결함
    man.showAccountInfo();

    }
}
