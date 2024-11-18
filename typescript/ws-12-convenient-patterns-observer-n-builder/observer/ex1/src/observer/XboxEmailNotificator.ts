import {Observer} from '../Observer'
import {EmailService} from '../service/EmailService'

export class XboxEmailNotificator implements Observer {
    constructor(
            private readonly emailService: EmailService,
            private readonly emailList: string[]
        ){}
    public update(currentQuantityInStock: number): void {
        const s = `Hello, this is an email to let you know about our Xbox stock, we have ${currentQuantityInStock} available!!`
        this.emailService.send(s, this.emailList)
    }
}