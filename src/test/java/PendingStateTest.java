import org.example.Context.Transaction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PendingStateTest {
    Transaction transaction = new Transaction();

    @Test
    public void approveTest() {
        String result = transaction.approve();

        assertEquals("Transação aprovada com sucesso.", result);
        assertNotEquals("mensagem inesperada", result);
    }

    @Test
    public void declineTest() {
        String result = transaction.decline();

        assertEquals("Transação recusada com sucesso.", result);
    }

    @Test
    public void processTest() {
        String result = transaction.process();

        assertEquals("Transação pendente. Aprove ou recuse antes de processar.", result);
        assertNotEquals("Transação processada com sucesso.", result);
    }

    @Test
    public void archiveTest() {
        String result = transaction.archive();

        assertEquals("Transação arquivada com sucesso.", result);
    }
}
