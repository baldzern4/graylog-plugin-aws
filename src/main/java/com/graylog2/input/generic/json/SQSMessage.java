package com.graylog2.input.generic.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SQSMessage {
    @JsonProperty("Message")
    public String message;
    @JsonProperty("MessageId")
    public String messageId;
}
