// usage.ts
import {SignupService} from "./domain/SignupService";
import {HttpClient} from "./infra/HttpClient";
import {InMemoryClient} from "./infra/InMemoryClient";

// using inmemory
console.log(" : ")
console.log("HttpClient: ")

const signup1 = SignupService(HttpClient());

signup1("bob@bob.com", "pwd123");

// using inmemory
console.log(" : ")
console.log("InMemoryClient: ")

const signup2 = SignupService(InMemoryClient());

signup2("bob@bob.com", "pwd123");
signup2("bob@bob.com", "pwd123");
signup2("bob@bob.com1", "pwd123");
signup2("bob@bob.com1", "pwd123");