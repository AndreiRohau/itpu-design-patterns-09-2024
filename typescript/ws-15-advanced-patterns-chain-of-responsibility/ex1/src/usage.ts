console.log("works")  

class AtmWithdrawalRequest {
    private amount: number
    private _result = new Map<string, number>()

    constructor(amount: number) {
        this.amount = amount
        console.log(`Requested: $${amount}\n`)
    }

    get(bill: number): AtmWithdrawalRequest {
        const count = Math.floor(this.amount / bill)
        this.amount -= count * bill
//         console.log(`Prepare ${count} piece(s) of $${bill} bills, left: ${this.amount}`)
        if (count != 0) {
            this.result.set("$" + bill, count)
        }
        return this
    }

    get result() {
        return this._result
    }
}

function run() {
    let request = new AtmWithdrawalRequest(378)
    // predefined flow
    const result = request.get(100).get(50).get(20).get(10).get(5).get(1).result

    console.log()
    console.log(`ATM preparing`)
    for (let [type, amount] of result) {
        console.log(`${type} in ${amount} piece(s).`);
    }
}

run()