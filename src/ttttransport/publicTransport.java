package ttttransport;

public interface publicTransport {
    default void info() {
        System.out.println("Это общественный транспорт");
    }

    void farePayment();
}
