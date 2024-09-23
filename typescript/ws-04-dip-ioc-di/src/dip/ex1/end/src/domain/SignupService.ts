// domain/SignupService.ts
import {ApiClient} from "./ApiClient"; // ✅ the domain depends on an abstraction of the infra
import {User} from "./User";

export function SignupService(client: ApiClient) {
  return (email: string, password: string) => {
    const existingUser = client.getUserByEmail(email)

    if (existingUser) {
        console.log("Email already used...")
    } else {
        return client.createUser(new User(email, password))
    }
  };
}