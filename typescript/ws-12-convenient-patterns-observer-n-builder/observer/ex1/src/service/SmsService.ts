export class SmsService {
    public send(message: string, numbersPhone: string[]): void {
        console.log(`SmsService: sending to ${numbersPhone}, the text: ${message}`)
    }
}