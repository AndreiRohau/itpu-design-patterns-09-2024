console.log("works")  

// Sub-system class
abstract class Post {
    abstract post() : void
}

class InstagramPost extends Post {
    post() : void {
        console.log("Posting to Instagram")
    }
}
class TiktokPost extends Post {
    post() : void {
        console.log("Posting to Tiktok")
    }
}
class TwitterPost extends Post {
    post() : void {
        console.log("Posting to Twitter")
    }
}

// Facade
class Publisher {
    private instagram = new InstagramPost()
    private tiktok = new TiktokPost()
    private twitter = new TwitterPost()

    public publish() : void {
        this.instagram.post()
        this.tiktok.post()
        this.twitter.post()
    }
}

// Client
class PublisherClient {
    private _publisher: Publisher

    public constructor() {
        this._publisher = new Publisher()
    }

    public publishEverywhere() {
        this._publisher.publish()
    }
}

const client: PublisherClient = new PublisherClient()
client.publishEverywhere()

