import org.example.Context.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DeclinedStateTest {
    private Transaction setup() {
        Transaction transaction = new Transaction();
        transaction.decline();
        return transaction;
    }
    Transaction transaction = setup();

    @Test
    public void approveTest() {
        String result = transaction.approve();

        assertEquals("Transação está recusada, não pode ser aprovada.", result);
        assertNotEquals("Transação aprovada com sucesso.", result);
    }

    @Test
    public void declineTest() {
        String result = transaction.decline();

        assertEquals("Transação já foi recusada.", result);
        assertNotEquals("Transação recusada com sucesso.", result);
    }

    @Test
    public void processTest() {
        String result = transaction.process();

        assertEquals("Transação está recusada, não pode ser processada.", result);
        assertNotEquals("Transação processada com sucesso.", result);
    }

    @Test
    public void archiveTest() {
        String result = transaction.archive();
        assertEquals("Transação arquivada com sucesso.", result);
    }
}
