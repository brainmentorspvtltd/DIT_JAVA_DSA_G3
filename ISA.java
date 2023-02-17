class Account{
    void deposit(int amount){
        System.out.println("Account Class :: Deposit Amount "+amount);
    }
    void withDraw(int amount){
        System.out.println("Account Class :: WithDraw "+amount);
    }
    void roi(){
        System.out.println("Account Class :: Roi 4%");
    }
}
// extends keyword - via inheritance
class SavingAccount extends Account{
    void limit(){
        System.out.println("Limit of Trans.... in SavingAccount");
    }
}
class CurrentAccount extends Account{
    void odLimit(){
        System.out.println("OD Limit in CurrentAccount");
    }
    /*
     * Overriding - When u do inheritance we get the parent things in child (Code Reuse)
     * but some of the feature for child is outdated so child need it's own version
     * so child will override the parent method.
     * When we do overriding the parent version will be hide.
     */
    // @Override it is an Annotation - It is marking here we do overriding
    @Override
    void roi(){
        System.out.println("ROI PAY 5%... ");
    }
}
class AccountCaller{
    // Polymorphic Fn
    void callAccount(Account account){
        account.deposit(10000);
        account.withDraw(2000);
        account.roi();
        
        if(account instanceof SavingAccount){
            // Downcasting
           ((SavingAccount) account).limit();
        }
        else if (account instanceof CurrentAccount){
            ((CurrentAccount) account).odLimit();
        }
        System.out.println("*************************");
        
    }
}
public class ISA {
    public static void main(String[] args) {
        AccountCaller ac= new AccountCaller();
        ac.callAccount(new SavingAccount()); // Upcast
        ac.callAccount(new CurrentAccount());
        // Account account = new SavingAccount(); // Upcasting (Child Cast to Parent Cast )
        // account.deposit(10000);
        // account.withDraw(2000);
        // account.roi();
        // //account.limit();

        // account = new CurrentAccount();
        //SavingAccount sa = new SavingAccount();
        // sa.deposit(10000);
        // sa.withDraw(2000);
        // sa.roi();
        // sa.limit(); // Specific to SA
        // System.out.println("**************************");
        // CurrentAccount ca = new CurrentAccount();
        // ca.deposit(100000);
        // ca.withDraw(1000);
        // ca.roi();
        // ca.odLimit();
    }
}
