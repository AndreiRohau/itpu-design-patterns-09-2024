interface Subject {
    addObserver(observer: Observer): void;
    removeObserver(observer: Observer): void;
    notifyAll(): void;
}