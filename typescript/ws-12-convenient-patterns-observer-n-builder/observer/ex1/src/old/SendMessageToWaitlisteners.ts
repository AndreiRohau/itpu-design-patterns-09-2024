import { Email, Whatsapp, SMS } from '../services'

class SendMessageToWaitlisteners  {
    static createMessage = (consoleName) => `THE BEST CONSOLE EVER HAS COME TO OUR STORE: ${consoleName}`
    constructor(
            private readonly serviceName: string,
            private readonly xboxSubscribersList,
            private readonly playstationList
          ) {
        const xboxMessage = SendMessageToWaitlisteners.createMessage('XBOX')
        const playstatioMessage = SendMessageToWaitlisteners.createMessage('PLAYSTATION')
        for (const contactInfo of xboxSubscribersList) {
            if (serviceName === 'email')
                new Email(contactInfo.email).sendMessage(xboxMessage)
            else if (serviceName === 'whatsapp')
                new Whatsapp(contactInfo.numberPhone).sendMessage(xboxMessage)
            else if (serviceName === 'sms')
                new SMS(contactInfo.numberPhone).sendMessage(xboxMessage)
        }
        for (const contactInfo of playstationList) {
            if (serviceName === 'email')
                new Email(contactInfo.email).sendMessage(playstatioMessage)
            else if (serviceName === 'whatsapp')
                new Whatsapp(contactInfo.numberPhone).sendMessage(playstatioMessage)
            else if (serviceName === 'sms')
                new SMS(contactInfo.numberPhone).sendMessage(playstatioMessage)
        }
    }
}