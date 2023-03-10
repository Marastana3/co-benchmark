package login;

public interface ILogger {
    void write(long value);
    void write(String value);
    void write(Object ... values);
    void close();
}
