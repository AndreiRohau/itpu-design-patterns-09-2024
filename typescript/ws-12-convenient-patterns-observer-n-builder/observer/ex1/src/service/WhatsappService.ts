export class WhatsappService {
    public send(message: string, numbersPhone: string[]): void {
        console.log(`WhatsappService: sending to ${numbersPhone}, the text: ${message}`)
    }
}