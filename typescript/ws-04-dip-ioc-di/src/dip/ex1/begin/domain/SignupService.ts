// domain/SignupService.ts
import HttpClient from "infra/HttpClient"; // ❌ the domain depends on a concretion from the infra package

export async function signup(email: string, password: string) {
  const existingUser = await HttpClient.getUserByEmail(email);

  if (existingUser) {
    throw new Error("Email already used");
  }

  return HttpClient.createUser({ email, password });
}