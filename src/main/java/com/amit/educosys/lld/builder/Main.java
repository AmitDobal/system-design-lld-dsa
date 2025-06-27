package com.amit.educosys.lld.builder;

import com.amit.educosys.lld.builder.email.a.EmailBuilder;
import com.amit.educosys.lld.builder.email.b.Email;

public class Main {
    public static void main(String[] args) {
        Email email = new Email.Builder("abc.1@gmail.com", "xyz.3@gmail.com")
                .subject("Interview Scheduled")
                .body("Hi, interview link given below.")
                .build();
        System.out.println(email);

        com.amit.educosys.lld.builder.email.a.Email email2 = new EmailBuilder("abc.1@gmail.com", "xyz.3@gmail.com")
                .subject("Interview Scheduled")
                .body("Hi, interview link given below.")
                .build();

        System.out.println(email2);
    }
}
