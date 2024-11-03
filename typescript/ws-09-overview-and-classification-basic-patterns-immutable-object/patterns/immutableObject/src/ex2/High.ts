import {Mid} from "./Mid";

export class High {
    public ms: string = 'high-mutable-string-v1'
    // private readonly. underscore helps with duplication issue while using getters
    private readonly _version: number
    private readonly _mid: Mid

    public constructor(version: number, mid: Mid) {
        this._version = version
        // create a copy of provided param to protect against external modifications
        this._mid = mid.clone()
    }

    // getters with deep clone
    public get version() { return this._version }
    public get mid() { return this._mid.clone() }

    // not using getters, since I need to generate a string, and no need of clones, if such exist
    public toString() {
        return `High<_version:number=${this._version}, _mid:Mid=${this._mid.toString()}, ms:string=${this.ms}>`
    }

    // no setters
}