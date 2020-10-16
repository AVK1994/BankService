public class Main {
    public static void main(String[] args) {
        CashbackService service = new CashbackService();
        int result = service.calculate(5000,4500,16000);
        System.out.println(result);
    }
}
