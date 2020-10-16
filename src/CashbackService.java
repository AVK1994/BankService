public class CashbackService {
    int calculate (int expSimple, int expHard, int expSpecial) {
        int simple = 1;
        int simpleCashback = expSimple * simple / 100;
        int hard = 5;
        int hardCashback = expHard * hard / 100;
        int special = 30;
        int specialCashback = expSpecial * special / 100;
        int cashback = simpleCashback + hardCashback + specialCashback;
        int limit = 3000;
        if (cashback > limit) {
            return limit;
        }
        return cashback;
    }
}
