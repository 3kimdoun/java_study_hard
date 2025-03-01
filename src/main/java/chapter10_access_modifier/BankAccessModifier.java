package chapter10_access_modifier;
/*
    접근 지정자(Access Modifier) :
        클래스, 메서드, (필드) 변수 등에 대한 접근 권한을 제어하는 데
        사용되는 명령어
    종류 :
        1) public : 모든 클래스에서 접근 가능 -> setter / getter 자동 생성 때 public으로 만들어진 이유
        2) protected : 같은 패키지 내의 클래스 및 이 클래스를 상속 받은
            자식 클래스에서 접근 가능(상속 개념은 추후 설명 예정)
        3) default(package-private) : 접근 지정자를 명시하지 않으면
            default로 간주되며, 같은 패키지 내의 클래스에서만 접근 가능
        4) private : 같은 클래스 내에서만 접근 가능

    작성 가이드 라인
        1. BankAccessModifier
            1) 필드
                accountNumber(계좌번호, 정수)
                accountHolder(예금주 이름, 문자열)
                balance(잔액, 정수)
                pinNumber(비밀번호, 4자리 정수)

            2) 생성자
                기본 생성자
                계좌 번호만 받는 생성자
                계좌 번호와 예금주를 받는 생성자
                계좌 번호, 예금주, 초기 잔액을 받는 생성자
                계좌 번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자

            3) 메서드
                Setter / Getter
                    특히 Setter의 경우에는 유효성 검증 로직을 삽입해야 함.
                        -> 잔액은 음수일 수 없음
                        -> 비밀번호는 0000 ~ 9999까지만 가능  -> 실패하면 "불가능한 비밀번호입니다."
                입출금 메서드
                    deposit(int amount, int inputPin) -> 입금
                        - 올바른 비밀번호인지 확인
                        - 유효한 금액인지 검증(0보다 큰 값) -> 실패하면 "불가능한 입력 금액입니다."
                        - 콘솔창에
                            입금 성공! 현재 잔액 : 100000원
                    withdraw(int amount, int inputPin) -> 출금
                        - 올바른 비밀번호인지 확인
                        - 유효한 금액인지 검증(0보다 큰 값) -> 실패하면 "불가능한 입력 금액입니다."
                        - 출금 후 잔액이 0 이상인지 확인 -> 실패하면 "출금 불가입니다."
                        - 콘솔창에 출금 성공! 현재 잔액 : 40000원
                    showAccountInfo()
                        - 콘솔창에
                            안근수 님의 계좌 번호는 1234567이며, 현재 잔액은 100000원입니다.

        작성 중에 여러분 나름대로 BankAccessModifierMain에 객체 생성해보고 되는지 안되는지 다 검증할 것.
        저는 여러분들이 작성 다 끝나고 나면 객체 이런 방식으로 만들어서 특정 메서드 실행해보세요. -> 그때 통과 되는지 확인할 예정
 */
public class BankAccessModifier {

    private int accountNumber ;
    private String accountHolder ;
    private long balance;
    private String pinNumber;
    //
    public BankAccessModifier(){
    }
    public BankAccessModifier( int accountNumber){
        this.accountNumber = accountNumber;
    }
    public BankAccessModifier(int accountNumber,String accountHolder){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
    public BankAccessModifier(int accountNumber,String accountHolder,long balance){
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
    public BankAccessModifier(int accountNumber,String accountHolder,long balance,String pinNumber){
        this.pinNumber = pinNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

//
    public void setPinNumber(String pinNumber) {
        if (pinNumber.length()!=4 ) {
            System.out.println("불가능한 비밀번호 입니다.");
            return;
        }else {
            this.pinNumber = pinNumber;
        }

    }
    public void setBalance(long balance) {
        if (balance < 0){
            System.out.println("불가능한 입력금액 입니다.");
            return;
        }else {
            //
            this.balance = balance;
        }
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    //


    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }

    public long getBalance() {
        return balance;
    }
    public String getPinNumber() {
        return pinNumber;
    }
    //
    public void showAccountInfo() {
        System.out.println(this.accountHolder + "님의 계좌 번호는 " + this.accountNumber + "이며, 현재 잔액은 " + this.balance + "원입니다.");
    }

        public void deposit(long account, String inputPin) {
            if(pinNumber == inputPin){
                if (account > 0){
                    balance += account;
                    System.out.println("입금 성공! 현재 잔액 :"+ (balance)+"원");
                }else {
                    System.out.println("금액을 다시확인 ㄱㄱ");
                }
            }else {
                System.out.println("비밀번호 오류");
            }
            return;
    //        // 비밀번호가 맞는지 확인할 것
    //        // 입금 금액이 양수일 것
        }
    //
    //    // 출금 메서드
        public void withdraw(long account, String inputPin) {
            if(pinNumber == inputPin){
                if (account > 0 && account <= balance){
                    balance -= account;
                    System.out.println("출금 성공! 현재 잔액 :"+ (balance)+"원");
                }else {
                    System.out.println("출금 불가. 잔액부족 ");
                 }
            }else{
                System.out.println("비밀번호 오류");
            }
            return;

    //        // 비밀번호가 맞는지 확인할 것
    //        // 출금 금액이 양수일 것
    //        // 출금 후 잔액이 0원 이상일 것
        }





}