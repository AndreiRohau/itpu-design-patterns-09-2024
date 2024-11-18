export class EmailService {
    public send(message: string, emailList: string[]): void {
        console.log(`EmailService: sending to ${emailList}, the text ${message}`)
    }
}