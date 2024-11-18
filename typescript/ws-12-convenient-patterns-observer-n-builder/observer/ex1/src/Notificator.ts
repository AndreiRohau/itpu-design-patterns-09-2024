class XboxEmailNotificator implements Observer{
    constructor(
            private readonly emailService,
            private readonly emailList:string[]
        ){}
    update(currentQuantityInStock: number): void {
        this.emailService.send(`Hello, this is an email to let you know about our Xbox stock, we have ${currentQuantityInStock} available!!`,this.emailList)
    }
}
class XboxWhatsappNotificator implements Observer{
    constructor(
        private readonly whatsappService,
        private readonly numbersPhone:string[]
    ){}
    update(currentQuantityInStock: number): void {
        this.whatsappService.send(`Hey buddy 😃, come on to our store there is a lot of ${currentQuantityInStock} xbox available!! 💁💁`, this.numbersPhone)
    }
}
class PlaystationSmsNotificator implements Observer{
    constructor(
        private readonly whatsappService,
        private readonly numbersPhone
    ){}
    update(currentQuantityInStock: number): void {
        this.whatsappService.send(`Hey!!! There is ${currentQuantityInStock} PLAYSTATIONS available!! 💁💁`,this.numbersPhone)
    }
}
class SocialNetworkNotificator implements Observer{
    constructor(
        private readonly facebookSDK
    ){}
    update(currentQuantityInStock: number): void {
        this.facebookSDK.send(`Stock Update! New consoles now available. Grab yours! 🚀 #Restocked`)
    }
}