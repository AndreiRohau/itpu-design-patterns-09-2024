// Observer interface
abstract class Observer {
    abstract update(mediaFiles: string[]): void
 }
 
// Subject  interface
abstract class Subject {
    abstract attach(observer: Observer): void
    abstract detach(observer: Observer): void
    abstract notify(mediaFiles: string[]): void
}

// Concrete Observer
export class MediaPlayer extends Observer {
    update(mediaFiles: string[]): void {
        console.log("Observer: Playing Media file: %s", mediaFiles[mediaFiles.length-1])
    }
}

// Concrete Subject
export class MediaLibrary extends Subject  {
    observers: Observer[] = []
    mediaFiles: string[] = []

    addMedia(media: string) {
        this.mediaFiles.push(media)
        this.notify()
    }

    attach(observer: Observer) {
        console.log('Subject: Attached an observer.')
        this.observers.push(observer)
    }
    detach(observer: Observer) {
        const index = this.observers.indexOf(observer)
        if (index === -1) {
            return console.log('Observer does not exist')
        }
        this.observers.splice(index, 1);
        console.log('Subject: Detached  observer.')
    }
    notify(): void {
        this.observers.forEach(observer => observer.update(this.mediaFiles))
    }
}

