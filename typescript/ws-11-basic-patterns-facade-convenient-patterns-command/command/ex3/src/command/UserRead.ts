import {Command} from '../Command'
import {UserService} from '../service/UserService'
import {User} from '../domain/User'

export class UserRead implements Command {
    private _userService: UserService = UserService.getInstance()
    execute(args: any[]): void {
        // validate arguments
        // prepare parameters
        const user: User = new User(args[1], args[2])
        // run process parameters
        const foundUser: User | null = this._userService.readUser(user)
        if (foundUser != null) {
            console.log(`foundUser is ${foundUser}`)
        } else {
            console.log(`User with id=${user.id} NOT exists`)
        }
    }
}
