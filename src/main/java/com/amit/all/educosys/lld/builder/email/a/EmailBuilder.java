package com.amit.all.educosys.lld.builder.email.a;

import lombok.Getter;

@Getter
public class EmailBuilder {
    private String to;
    private String from;
    private String subject;
    private String body;

    public EmailBuilder(String to, String from){
        this.to = to;
        this.from = from;
    }

    public EmailBuilder subject(String subject) {
        this.subject = subject;
        return this;
    }

    public EmailBuilder body(String body) {
        this.body = body;
        return this;
    }

    public Email build() {
        return new Email(this);
    }
}
