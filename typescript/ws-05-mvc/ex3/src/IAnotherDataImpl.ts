import {IAnotherData} from "./IAnotherData"

export class IAnotherDataImpl implements IAnotherData {
    id: number
    private _id: number
    address: string
    private _address: string

    constructor(id: number, address: string) {
        this.id = id
        this._id = id
        this.address = address
        this._address = address
    }

    public getId() {
        return this._id
    }

    public setId(id: number) {
        this._id = id
    }

    public getAddress() {
        return this._address
    }

    public setAddress(address: string) {
        this._address = address
    }
}