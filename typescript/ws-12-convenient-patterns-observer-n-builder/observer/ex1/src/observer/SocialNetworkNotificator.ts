import {Observer} from '../Observer'
import {FacebookSDK} from '../service/FacebookSDK'

export class SocialNetworkNotificator implements Observer {
    constructor(
        private readonly facebookSDK: FacebookSDK
    ){}
    public update(currentQuantityInStock: number): void {
        this.facebookSDK.send(`Stock Update! ${currentQuantityInStock} New consoles now available. Grab yours! 🚀 #Restocked`)
    }
}