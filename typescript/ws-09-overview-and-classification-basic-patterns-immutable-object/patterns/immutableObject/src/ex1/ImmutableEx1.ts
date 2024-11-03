// same
/*
type TUser = {
    readonly name: string
    readonly email: string
    readonly password: string
};
*/
type TUser = Readonly<{
    name: string
    email: string
    password: string
}>;

const Component = (user: TUser) => {
    return `            <div>
                <h1>${user.name}</h1>
                <h2>${user.email}</h2>
                <h3>${user.password}</h3>
            </div>`
}

const App = () => {
  const user: TUser = {
    name: "John Doe",
    email: "test@test.com",
    password: "123456",
  };
  // next line produces error
//   user.name = 'new name'
  return Component(user)
}

export class ImmutableEx1 {
    run() {
        console.log(App())
    }
}
