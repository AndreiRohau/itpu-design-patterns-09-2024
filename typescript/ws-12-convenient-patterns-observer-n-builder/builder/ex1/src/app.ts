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
    addCheese(has: boolean): BurgerBuilder {
        this.cheese = has
        return this
    }
    addBacon(has: boolean): BurgerBuilder {
        this.bacon = has
        return this
    }
    addLettuce(has: boolean): BurgerBuilder {
        this.lettuce = has
        return this
    }
    addTomato(has: boolean): BurgerBuilder {
        this.tomato = has
        return this
    }
    build(): Burger {
        return new Burger(this.name, this.cheese, this.bacon, this.lettuce, this.tomato)
    }
}

// Usage

export function builderClient() {
    const everythingBurger: Burger = new BurgerBuilder("Everything")
        .addCheese(true)
        .addBacon(true)
        .addLettuce(true)
        .addTomato(true)
        .build()
    console.log(everythingBurger.showDetails())

    const cheeseBurger: Burger = new BurgerBuilder("Cheese")
        .addBacon(false)
        .addCheese(true)
        .addTomato(true)
        .build()
    console.log(cheeseBurger.showDetails())
}


