import {User} from '../domain/User'

// singleton
export class UserRepositoryFake {
    private static instance: UserRepositoryFake
    private _usersStorage: Map<string, User>
    private constructor() {
        this._usersStorage = new Map<string, User>()
    }
    public static getInstance(): UserRepositoryFake {
        // On the first run, create the instance and save it to the static property.
        if (!UserRepositoryFake.instance) {
            UserRepositoryFake.instance = new UserRepositoryFake()
        }
        return UserRepositoryFake.instance
    }

    public printUserStorage(): void {
        this._usersStorage.forEach((value, key) => {
            console.log(`Key: ${key}, Value: ${value}`)
        })
    }

    public createUser(user: User) {
        this._usersStorage.set(user.id, user)
    }

    public getUserById(id: string): User | null {
        let user = null
        if (this._usersStorage.has(id)) {
            user = this._usersStorage.get(id)
            if (user == undefined) {
                user = null
            }
        }
        return user
    }

    public updateUser(user: User) {
        if (this._usersStorage.has(user.id)) {
            this._usersStorage.set(user.id, user)
        } else {
            console.log(`User with id=${user.id} NOT exists (noone is updated)`)
        }
    }

    public deleteUserById(id: string) {
        if (this._usersStorage.has(id)) {
            this._usersStorage.delete(id)
        }
    }
}