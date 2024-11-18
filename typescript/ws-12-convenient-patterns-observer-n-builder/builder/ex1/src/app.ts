class Burger {
    name: string
    cheese: boolean
    bacon: boolean
    lettuce: boolean
    tomato: boolean
    
    constructor(name: string, cheese: boolean, bacon: boolean, lettuce: boolean, tomato: boolean) {
        this.name = name
        this.cheese = cheese
        this.bacon = bacon
        this.lettuce = lettuce
        this.tomato = tomato
    }

    showDetails(): string {
        let details = "This " + this.name  + " Burger has: "
        if (this.cheese) {
            details = details + " Cheese, "
        }
        if (this.bacon) {
            details = details + " Bacon, "
        }
        if (this.lettuce) {
            details = details + " Lettuce, "
        }
        if (this.tomato) {
            details = details + " Tomato "
        }
        return details
    }
}

class BurgerBuilder {
    private name: string
    private cheese: boolean = false
    private bacon: boolean = false
    private lettuce: boolean = false
    private tomato: boolean = false
    
    constructor(name: string) {
        this.name = name
    }
    addCheese(): BurgerBuilder {
        this.cheese = true
        return this
    }
    addBacon(): BurgerBuilder {
        this.bacon = true
        return this
    }
    addLettuce(): BurgerBuilder {
        this.lettuce = true
        return this
    }
    addTomato(): BurgerBuilder {
        this.tomato = true
        return this
    }
    build(): Burger {
        return new Burger(this.name, this.cheese, this.bacon, this.lettuce, this.tomato)
    }
}

// Usage

export function builderClient() {
    const everythingBurgerBuilder = new BurgerBuilder("Everything")
    const everythingBurger = everythingBurgerBuilder.addCheese().addBacon().addLettuce().addTomato().build()
    
    console.log(everythingBurger.showDetails()) 
    const cheeseBurgerBuilder = new BurgerBuilder("Cheese")
    const cheeseBurger = cheeseBurgerBuilder.addCheese().addTomato().build() 
    console.log(cheeseBurger.showDetails())
}


