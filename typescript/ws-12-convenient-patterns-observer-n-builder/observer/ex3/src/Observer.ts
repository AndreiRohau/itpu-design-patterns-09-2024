class Observer {
  constructor(state) {
    this.state = state;

    this.subscribers = [];
  }

  get() {
    return this.state;
  }

  set(state) {
    this.state = state;

    this.broadcast(state);
  }

  subscribeMany(fnArray = []) {
    return fnArray.map(fn => this.subscribe(fn));
  }

  subscribe(fn) {
    if (Array.isArray(fn)) {
      return this.subscribeMany(fn);
    }

    this.subscribers.push(fn);

    return () =>
      (this.subscribers = this.subscribers.filter(
        subscriber => subscriber !== fn
      ));
  }

  broadcast(data) {
    this.subscribers.forEach(subscriber => subscriber(data));

    return data;
  }
}