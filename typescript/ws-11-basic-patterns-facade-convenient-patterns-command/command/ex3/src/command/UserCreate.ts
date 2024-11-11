import {Command} from '../Command'
import {UserService} from '../service/UserService'
import {User} from '../domain/User'

export class UserCreate implements Command {
    private _userService: UserService = UserService.getInstance()
    execute(args: any[]): void {
        const user: User = new User(args[1], args[2])
        this._userService.saveUser(user)
    }
}
