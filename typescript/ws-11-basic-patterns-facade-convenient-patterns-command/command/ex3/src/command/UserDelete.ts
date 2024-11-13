import {Command} from '../Command'
import {UserService} from '../service/UserService'
import {User} from '../domain/User'

export class UserDelete implements Command {
    private _userService: UserService = UserService.getInstance()
    execute(args: any[]): void {
        // validate arguments
        // prepare parameters
        const user: User = new User(args[1], args[2])
        // run process parameters
        this._userService.deleteUser(user)
    }
}
