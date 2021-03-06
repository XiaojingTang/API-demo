package websocket.persistence;

import websocket.objects.Account;
import websocket.objects.FundRecord;
import websocket.objects.TransferRecord;

import java.util.List;

public interface Persister {

    void createTables();

    void clearData();

    void addToAccount(String user, String currency);

    void addToFundRecord(long accountId, String transCurrency, double amount, String date, double conversionRate,
                         double crdhldBillAmt, long bankFee);

    void addToTransferRecord(long fromAccountId, long toAccountId, String transCurrency, double amount, String date, double conversionRate,
                             double crdhldBillAmt, long bankFee);

    Account findById(long accountId);

    void setAccountBalance(long accountId, double amount);

    List<Account> getAllAccounts();

    List<FundRecord> getAllFundRecord();

    List<TransferRecord> getAllTransferRecord();
}
