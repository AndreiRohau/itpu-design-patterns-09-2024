// domain/User.ts
export class User {
    email: string
    password: string

    constructor(email: string, password: string) {
        this.email = email
        this.password = password
    }

    public getEmail() {
        return this.email
    }

    public setEmail(email: string) {
        this.email = email
    }

    public getPassword() {
        return this.password
    }

    public setPassword(password: string) {
        this.password = password
    }
}