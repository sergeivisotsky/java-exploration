package org.sergei.jdbc;

/**
 * @author Sergei Visotsky
 */
public class JdbcRuntimeException extends RuntimeException {

    private static final long serialVersionUID = -596880183916575504L;

    public JdbcRuntimeException() {
        super();
    }

    public JdbcRuntimeException(String message) {
        super(message);
    }

    public JdbcRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public JdbcRuntimeException(Throwable cause) {
        super(cause);
    }

    protected JdbcRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
