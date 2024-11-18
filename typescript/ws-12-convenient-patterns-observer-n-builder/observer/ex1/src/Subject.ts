import {Observer} from './Observer'

export interface Subject {
    addObserver(observer: Observer): void
    removeObserver(observer: Observer): void
    notifyAll(): void
}