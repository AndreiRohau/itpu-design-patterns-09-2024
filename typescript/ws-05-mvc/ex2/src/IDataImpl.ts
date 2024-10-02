import {IData} from "./IData"

export class IDataImpl implements IData {
    id: number
    private _id: number
    name: string
    private _name: string
    email: string
    private _email: string

    constructor(id: number, name: string, email: string) {
        this.id = id
        this._id = id
        this.name = name
        this._name = name
        this.email = email
        this._email = email
    }

    public getId() {
        return this._id
    }

    public setId(id: number) {
        this._id = id
    }

    public getName() {
        return this._name
    }

    public setName(name: string) {
        this._name = name
    }

    public getEmail() {
        return this._email
    }

    public setEmail(email: string) {
        this._email = email
    }
}