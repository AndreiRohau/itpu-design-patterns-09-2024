export class User {
    private _id: string
    private _name: string

    public constructor(id: string, name: string) {
        this._id = id
        this._name = name
    }

    public get id() {
        return this._id
    }

    public get name() {
        return this._name
    }

    public toString() {
        return `User<id=${this._id}, name=${this._name}>`
    }
}
