console.log("works")  

//Fake data
const fakeEmails = ['iaan.123@gmail.com','another_guy@123xyz.com',"johndoe@johndoe.com"]
const fakeNumbers = ['+1999999999','+11231111111',"+167145349873648"]

//ConcreteSubjects
const xboxStockConcreteSubject = new XboxStockConcreteSubject()
const playstationStockConcreteSubject = new PlaystationStockConcreteSubject()

//ConcreteObservers
const xboxEmailNotificator = new XboxEmailNotificator(new EmailService(), fakeEmails)
const xboxWhatsappNotificator = new XboxWhatsappNotificator(new WhatsappService(), fakeNumbers)
const playstationSmsNotificator = new PlaystationSmsNotificator(new SmsService(), fakeNumbers)
const socialNetworkNotificator = new SocialNetworkNotificator(new FacebookSDK())

//Registering observers into subject
xboxStockConcreteSubject.addObserver(xboxEmailNotificator)
xboxStockConcreteSubject.addObserver(xboxWhatsappNotificator)
playstationStockConcreteSubject.addObserver(playstationSmsNotificator)

xboxStockConcreteSubject.addObserver(socialNetworkNotificator)
playstationStockConcreteSubject.addObserver(socialNetworkNotificator)


xboxStockConcreteSubject.quantityInStock = 9999
/**
 * Email Sent: Hello, this is an email to let you know about our Xbox stock, we have 9999 available!!
 * Whatsapp Sent: Hey buddy 😃, come on to our store there is a lot of 9999 xbox available!! 💁💁
 * Facebook Post Sent: Stock Update! New consoles now available. Grab yours! 🚀 #Restocked
 */

playstationStockConcreteSubject.quantityInStock = 25
/**
 * Sms Sent: Hey!!! There is 25 PLAYSTATIONS available!! 💁💁
 * Facebook Post Sent: Stock Update! New consoles now available. Grab yours! 🚀 #Restocked
 */

