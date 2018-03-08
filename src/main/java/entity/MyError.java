/**
 * Created By Roman Movcheniuk
 */
package entity;

public class MyError {
    private String errmsg;
    private int errno;
    private String field;

    public MyError() {
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
