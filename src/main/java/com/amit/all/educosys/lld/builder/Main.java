package com.amit.all.educosys.lld.builder;

import com.amit.all.educosys.lld.builder.email.a.Email;
import com.amit.all.educosys.lld.builder.email.a.EmailBuilder;

public class Main {
    public static void main(String[] args) {
        com.amit.all.educosys.lld.builder.email.b.Email email = new com.amit.all.educosys.lld.builder.email.b.Email.Builder("abc.1@gmail.com", "xyz.3@gmail.com")
                .subject("Interview Scheduled")
                .body("Hi, interview link given below.")
                .build();
        System.out.println(email);

        Email email2 = new EmailBuilder("abc.1@gmail.com", "xyz.3@gmail.com")
                .subject("Interview Scheduled")
                .body("Hi, interview link given below.")
                .build();

        System.out.println(email2);
    }
}
