console.log("works")  

// // Sub-system class
// abstract class Post {
//     abstract post() : void
// }

class ValidateThePost {
    validate() : void {
        console.log("validating post... post is valid!")
    }
}
class InstagramPost { //extends Post {
    post() : void {
        console.log("Posting to Instagram")
    }
    undoPost() : void {
        console.log("Remove post from Instagram")
    }
}
class TiktokPost { //extends Post {
    post() : void {
        console.log("Posting to Tiktok")
    }
    undoPost() : void {
        console.log("Remove post from Tiktok")
    }
}
class TwitterPost { //extends Post {
    post() : void {
        console.log("Posting to Twitter")
    }
    undoPost() : void {
        console.log("Remove post from Twitter")
    }
}

// Facade
class Publisher {
    private validator = new ValidateThePost()
    private instagram = new InstagramPost()
    private tiktok = new TiktokPost()
    private twitter = new TwitterPost()

    public publish() : void {
        this.validator.validate()
        this.instagram.post()
        this.tiktok.post()
        this.twitter.post()
    }

    public unPublish() {
        this.instagram.undoPost()
        this.tiktok.undoPost()
        this.twitter.undoPost()
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

    public rollbackPublishedPostsFromEverywhere() {
        this._publisher.unPublish()
    }
}

const client: PublisherClient = new PublisherClient()
client.publishEverywhere()
client.rollbackPublishedPostsFromEverywhere()

