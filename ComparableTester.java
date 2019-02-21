import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class ComparableTester
{
    public static void main(String[] args)
    {
        // sort bank accounts
        BankAccount[] accounts = 
            {

                new BankAccount(2000.0, "xyz789"),
                new BankAccount(1000.0, "def333"),
                new BankAccount(1000.0, "abc123"),
                new BankAccount(1500.0, "pqr456"),
            };

        Arrays.sort(accounts);

        for(BankAccount b : accounts)
        {
            System.out.println(b.getAccountId());
        }

    }
}
