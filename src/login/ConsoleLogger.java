package login;

public class ConsoleLogger implements ILogger{
    @Override
    public void write(long value) {
        System.out.println(value);
    }

    @Override
    public void write(String value) {
        System.out.println(value);
    }

    @Override
    public void write(Object... values) {
        StringBuilder builder = new StringBuilder();
        for (Object value : values) {
            builder.append(value);
            builder.append(" ");
        }
        System.out.println(builder.toString().trim());
    }

    @Override
    public void close() {
        /* Nothing to close for console logger */
    }
}
