package com.amit.educosys.lld.builder.email.a;

import lombok.ToString;

@ToString
public class Email {
    private String to;
    private String from;
    private String subject;
    private String body;

    Email(EmailBuilder builder) {
        this.to = builder.getTo();
        this.from = builder.getFrom();
        this.subject = builder.getSubject();
        this.body = builder.getBody();
    }

    //Getters
    public String getTo() {
        return this.to;
    }

    public String getFrom() {
        return this.from;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getBody() {
        return this.body;
    }

}
