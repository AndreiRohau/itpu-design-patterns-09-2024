import {User} from '../domain/User'
import {UserRepositoryFake} from '../dao/UserRepositoryFake'

// Singleton
export class UserService {
    private static instance: UserService
    private _userRepository: UserRepositoryFake
    private constructor() {
        this._userRepository = UserRepositoryFake.getInstance()
    }
    public static getInstance(): UserService {
        // On the first run, create the instance and save it to the static property.
        if (!UserService.instance) {
            UserService.instance = new UserService()
        }
        return UserService.instance
    }

    // Business logic begins here
    public saveUser(user: User) {
        console.log(`Saving... ${user}`)
        this._userRepository.createUser(user)
    }

    public readUser(user: User): User | null {
        console.log(`Reading... ${user}`)
        return this._userRepository.getUserById(user.id)
    }

    public updateUser(user: User) {
        console.log(`Updating... ${user}`)
        this._userRepository.updateUser(user)
    }

    public deleteUser(user: User) {
        console.log(`Deleting... ${user}`)
        this._userRepository.deleteUserById(user.id)
    }
}
