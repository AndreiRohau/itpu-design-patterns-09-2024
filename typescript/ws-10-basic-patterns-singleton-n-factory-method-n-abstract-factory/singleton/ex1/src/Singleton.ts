export class Singleton {
    private static instance: Singleton;

    // The constructor should be private to prevent direct construction calls with the `new` operator.
    private constructor() {
        // Initialization code here
    }

    // This static method controls the access to the singleton instance.
    public static getInstance(): Singleton {
        // On the first run, create the instance and save it to the static property.
        if (!Singleton.instance) {
            Singleton.instance = new Singleton();
        }

        // Return the singleton instance.
        return Singleton.instance;
    }

    public someMethod() {
        // Example method that can be called on the Singleton.
        console.log('Executing some process...');
    }
}
