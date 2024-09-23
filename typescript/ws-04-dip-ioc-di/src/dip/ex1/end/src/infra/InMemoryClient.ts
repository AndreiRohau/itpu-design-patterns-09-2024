// infra/InMemoryClient.ts
import {ApiClient} from "../domain/ApiClient";
import {User} from "../domain/User";

export function InMemoryClient(): ApiClient {
  const users: User[] = [];

  return {
    createUser: (user: User) => {
        console.log("user created... in InMemoryClient")
        users.push(user);
    },
    getUserByEmail: (email: string) => {
        console.log("getting user by email... in InMemoryClient")
        return users.find((user) => user.email === email);
    },
  };
}