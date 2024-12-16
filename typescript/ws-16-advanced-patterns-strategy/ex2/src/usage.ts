console.log("works")

// [STRATEGY]
abstract class SoundStrategy {
	abstract makeSound(): string
 }
// [CONCRETE_STRATEGY] Cat Sound Strategy
class CatSoundStrategy extends SoundStrategy {
    public makeSound(): string {
        return "Meow"
    }
}
// [CONCRETE_STRATEGY] Dog Sound Strategy
class DogSoundStrategy extends SoundStrategy {
    public makeSound(): string {
        return "Woof"
    }
}

 // [CONTEXT]
class Context {
    private _soundStrategy: SoundStrategy

    public constructor(soundStrategy: SoundStrategy) {
        this._soundStrategy = soundStrategy
    }

    public setSoundStrategy(soundStrategy: SoundStrategy) {
        this._soundStrategy = soundStrategy
    }

    public executeSoundStrategy(): string {
        return this._soundStrategy.makeSound()
    }
}

// [CLIENT]
function run() {
    let catSoundStrategy: SoundStrategy = new CatSoundStrategy()
    let dogSoundStrategy: SoundStrategy = new DogSoundStrategy()

    let context: Context = new Context(catSoundStrategy)
    console.log("Cat sounds like: ", context.executeSoundStrategy())

    context.setSoundStrategy(dogSoundStrategy)
    console.log("Dog sounds like: ", context.executeSoundStrategy())
}

run()