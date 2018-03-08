package serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;

/**
 * Created by Roman on 02.01.2018.
 */


public class JSONSerialization<T> {
    private ObjectMapper getObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        return objectMapper;
    }


    public void toFile(T t, String fileName) throws IOException {

        getObjectMapper().writeValue(new File(fileName), t);
    }

    public T fromFile(Class<T> tClass, String content) throws IOException {
        return getObjectMapper().readValue(content, tClass);
    }


}


