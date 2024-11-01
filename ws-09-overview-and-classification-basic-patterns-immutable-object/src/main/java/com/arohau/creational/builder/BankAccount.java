package com.arohau.creational.builder;

import lombok.Data;

@Data
public class BankAccount {

    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    public BankAccount(BankAccountBuilder bankAccountBuilder) {
        name = bankAccountBuilder.name;
        accountNumber = bankAccountBuilder.accountNumber;
        email = bankAccountBuilder.email;
        newsletter = bankAccountBuilder.newsletter;
    }

    public static class BankAccountBuilder {

        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder wantNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
