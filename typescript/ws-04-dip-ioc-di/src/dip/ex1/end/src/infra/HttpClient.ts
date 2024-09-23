// infra/HttpClient.ts
import axios from "axios";
import {ApiClient} from "../domain/ApiClient";
import {User} from "../domain/User";

export function HttpClient(): ApiClient {
  return {
    createUser: (user: User) => {
        console.log("user created... in HttpClient")
    },
    getUserByEmail: (email: string) => {
        console.log("getting user by email... in HttpClient")
        if (email === "bob@bob.com") {
            return new User(email, "a-password")
        } else {
            return undefined
        }
    },
  };
}