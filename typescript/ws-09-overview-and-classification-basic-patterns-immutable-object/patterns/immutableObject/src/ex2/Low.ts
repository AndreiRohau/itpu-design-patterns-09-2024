export class Low {
    public ms: string = 'low-mutable-string-v1'
    // private readonly. underscore helps with duplication issue while using getters
    private readonly _s: string

    public constructor(s: string) {
        this._s = s
    }

    // getters with deep clone
    public get s() { return this._s }
    // deep clone if need prototype. notice usage of getters now
    public clone(): Low { return new Low(this.s) }

    // not using getters, since I need to generate a string, and no need of clones, if such exist
    public toString() {
        return `Low<_s:string=${this._s}, ms:string=${this.ms}>`
    }

    // no setters
}