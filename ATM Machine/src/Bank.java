import java.util.Arrays;
import java.util.List;

class Bank{
    //create a list of accounts;
    public List<Account> accounts = getAccounts();

    public List<Account> getAccounts(){
        //list of accounts from database
        return Arrays.asList(new Account("Hari","hari",100000),
                new Account("HariHaran","HariHaran",1000),
                new Account("Syed","Syed",900));
    }

    public Account selectAccount(String accountName,String accountPassword){
        System.out.print(accounts);
        for (Account account:accounts){
            if(account.isMatching(accountName, accountPassword)){
                System.out.print("Matched, Welcome "+accountName+"Your balance is "+account.balance);
                return account;
            }
        }
        System.out.print("Not Matched");
        return null;
    }
}