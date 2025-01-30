import org.example.Context.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ArchivedStateTest {
    private Transaction setup() {
        Transaction transaction = new Transaction();
        transaction.archive();
        return transaction;
    }
    Transaction transaction = setup();

    @Test
    public void approveTest() {
        String result = transaction.approve();

        assertEquals("Não é possível alterar estado de uma transação arquivada.", result);
        assertNotEquals("Transação aprovada com sucesso.", result);
    }

    @Test
    public void declineTest() {
        String result = transaction.decline();

        assertEquals("Não é possível alterar estado de uma transação arquivada.", result);
        assertNotEquals("Transação recusada com sucesso.", result);
    }

    @Test
    public void processTest() {
        String result = transaction.process();

        assertEquals("Não é possível alterar estado de uma transação arquivada.", result);
        assertNotEquals("Transação processada com sucesso.", result);
    }

    @Test
    public void archiveTest() {
        String result = transaction.archive();

        assertEquals("Transação já foi arquivada.", result);
    }
}
