package com.arohau.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankAccount {

    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    // getter n setters persist

    public BankAccount(BankAccountBuilder2 bankAccountBuilder) {
        name = bankAccountBuilder.name;
        accountNumber = bankAccountBuilder.accountNumber;
        email = bankAccountBuilder.email;
        newsletter = bankAccountBuilder.newsletter;
    }

    public static class BankAccountBuilder2 {

        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        public BankAccountBuilder2(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder2 withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder2 wantNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
