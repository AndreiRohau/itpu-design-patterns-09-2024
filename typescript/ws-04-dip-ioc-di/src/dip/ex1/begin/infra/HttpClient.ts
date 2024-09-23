// infra/HttpClient.ts
import axios from "axios";

export default {
  createUser: async (user: User) => {
    return axios.post(/* ... */);
  },
  getUserByEmail: async (email: string) => {
    return axios.get(/* ... */);
  },
};