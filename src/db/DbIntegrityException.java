package db;

public class DbIntegrityException extends Exception {


    private static final long serialVersionUID = 1L;


    public DbIntegrityException(String msg)
    {
        super(msg);
    }
}