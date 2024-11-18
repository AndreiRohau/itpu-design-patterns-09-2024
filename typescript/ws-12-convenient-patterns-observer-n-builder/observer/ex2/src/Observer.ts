export class Observer {
    subscribers

    constructor(subject) {
        subject.registerObserver(this);
        this.subscribers = [];
    }

    subscribe(subscriber) {
        this.subscribers.push(subscriber);
    }

    notify(data) {
        this.subscribers.forEach(subscriber => subscriber(data));
    }
}