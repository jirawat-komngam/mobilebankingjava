import java.util.*;

public class AccountDB {
    public AccountDB(List<AccountPOJO> accountList) {
        this.accountList = accountList;
    }

    private List<AccountPOJO> accountList;

    public List<AccountPOJO> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<AccountPOJO> accountList) {
        this.accountList = accountList;
    }

}
