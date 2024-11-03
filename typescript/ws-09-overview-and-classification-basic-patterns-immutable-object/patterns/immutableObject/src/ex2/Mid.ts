import {Low} from "./Low";

export class Mid {
    public ms: string = 'mid-mutable-string-v1'
    // private readonly. underscore helps with duplication issue while using getters
    private readonly _x: number
    private readonly _low: Low

    public constructor(x: number, low: Low) {
        this._x = x
        // create a copy of provided param to protect against external modifications
        this._low = low.clone()
    }

    // getters with deep clone
    public get x() { return this._x }
    public get low() { return this._low.clone() }
    // deep clone if need prototype. notice usage of getters now
    public clone() { return new Mid(this.x, this.low) }

    // not using getters, since I need to generate a string, and no need of clones, if such exist
    public toString() {
        return `Mid<_x:number=${this._x}, _low:Low=${this._low.toString()}, ms:string=${this.ms}>`
    }

    // no setters
}