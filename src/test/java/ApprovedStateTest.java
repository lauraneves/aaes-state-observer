import org.example.Context.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ApprovedStateTest {
    private Transaction setup() {
        Transaction transaction = new Transaction();
        transaction.approve();
        return transaction;
    }
    Transaction transaction = setup();

    @Test
    public void approveTest() {
        String result = transaction.approve();

        assertEquals("Transação já está aprovada.", result);
        assertNotEquals("Transação aprovada com sucesso.", result);
    }

    @Test
    public void declineTest() {
        String result = transaction.decline();

        assertEquals("Transação já aprovada, não pode ser recusada.", result);
        assertNotEquals("Transação recusada com sucesso.", result);
    }

    @Test
    public void processTest() {
        String result = transaction.process();

        assertEquals("Transação processada com sucesso.", result);
    }

    @Test
    public void archiveTest() {
        String result = transaction.archive();

        assertEquals("Transação arquivada com sucesso.", result);
    }
}
