import {Observer} from '../Observer'
import {SmsService} from '../service/SmsService'

export class PlaystationSmsNotificator implements Observer {
    constructor(
        private readonly smsService: SmsService,
        private readonly numbersPhone: string[]
    ){}
    public update(currentQuantityInStock: number): void {
        const s = `Hey!!! There is ${currentQuantityInStock} PLAYSTATIONS available!! 💁💁`
        this.smsService.send(s, this.numbersPhone)
    }
}