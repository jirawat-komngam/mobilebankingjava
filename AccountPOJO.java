import java.util.Map;

public class AccountPOJO {

    public AccountPOJO(Map<String, String> accountInfo, Double accountBalance) {
        this.accountInfo = accountInfo;
        this.accountBalance = accountBalance;
    }

    private Map<String, String> accountInfo;
    private Double accountBalance;

    public Map<String, String> getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(Map<String, String> accountInfo) {
        this.accountInfo = accountInfo;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

}
