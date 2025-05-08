package br.com.ws;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAdapter extends TypeAdapter<LocalDateTime> {

    private static final DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    @Override
    public void write(JsonWriter out, LocalDateTime value) throws IOException {
        if (value == null) {
            out.nullValue();
        } else {
            out.value(value.format(formater));
        }
    }

    @Override
    public LocalDateTime read(JsonReader jsonReader) throws IOException {
        String txt = jsonReader.nextString();
        return LocalDateTime.parse(txt, formater);
    }
}
