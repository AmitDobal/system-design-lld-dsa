package com.amit.all.educosys.lld.builder.email.b;

import lombok.ToString;

@ToString
public final class Email {
    private final String to;
    private final String from;
    private final String subject;
    private final String body;

    private Email(Builder builder) {
        this.to = builder.to;
        this.from = builder.from;
        this.subject = builder.subject;
        this.body = builder.body;
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

    public static class Builder {
        private String to;
        private String from;
        private String subject;
        private String body;

        public Builder(String to, String from){
            this.to = to;
            this.from = from;
        }

//        public Builder to(String to) {
//            this.to = to;
//            return this;
//        }
//
//        public Builder from(String from) {
//            this.from = from;
//            return this;
//        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }

}
