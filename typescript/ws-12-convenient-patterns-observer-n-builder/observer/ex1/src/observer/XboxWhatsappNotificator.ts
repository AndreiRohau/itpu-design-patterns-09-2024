import {Observer} from '../Observer'
import {WhatsappService} from '../service/WhatsappService'

export class XboxWhatsappNotificator implements Observer {
    constructor(
        private readonly whatsappService: WhatsappService,
        private readonly numbersPhone: string[]
    ){}
    public update(currentQuantityInStock: number): void {
        const s = `Hey buddy 😃, come on to our store there is a lot of ${currentQuantityInStock} xbox available!! 💁💁`
        this.whatsappService.send(s, this.numbersPhone)
    }
}