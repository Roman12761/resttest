/**
 * Created By Roman Movcheniuk
 */
package jsonresponses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import entity.MyError;

import java.util.List;

public class GeneralResponse{
    @JsonIgnore
    private int responseCode;


    private List<MyError> errors;
    private List<Object> data;
    private int count;

    public GeneralResponse() {
    }

    @Override
    public String toString() {
        return "GeneralResponse{" +
                "responseCode=" + responseCode +
                ", errors=" + errors +
                ", data=" + data +
                ", count=" + count +
                '}';
    }

    public List<MyError> getErrors() {
        return errors;
    }

    public void setErrors(List<MyError> errors) {
        this.errors = errors;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> body) {
        this.data = body;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @JsonIgnore
    public int getResponseCode() {
        return responseCode;
    }

    @JsonProperty
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
}
