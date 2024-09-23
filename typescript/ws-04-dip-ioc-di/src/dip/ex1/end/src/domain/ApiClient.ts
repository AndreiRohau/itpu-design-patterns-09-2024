// domain/ApiClient.ts
import {User} from "./User";

export interface ApiClient {
  createUser: (user: User) => void;
  getUserByEmail: (email: string) => User | undefined
  // ...
}