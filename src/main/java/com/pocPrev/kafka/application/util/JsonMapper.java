package com.pocPrev.kafka.application.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class JsonMapper<T> {

    public String objectToJson(T object) {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        try {
            return ow.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new MapperException(e.getMessage());
        }
    }

    public String objectToJsonWithNoBreakLines(T object) {
        return this.objectToJson(object)
                .replaceAll("\\r|\\n", "");
    }
}
