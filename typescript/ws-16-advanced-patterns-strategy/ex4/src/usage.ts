console.log("works")
console.log("Declarative implementation")

// [CONTEXT]
var Shipping = function () {
    this.company = "";
};

// [CONTEXT]
Shipping.prototype = {
    setStrategy: function (company) {
        this.company = company;
    },

    calculate: function (package) {
        return this.company.calculate(package);
    }
};

// [CONCRETE STRATEGY]
var UPS = function () {
    this.calculate = function (package) {
        // calculations...
        return "$45.95";
    }
};

// [CONCRETE STRATEGY]
var USPS = function () {
    this.calculate = function (package) {
        // calculations...
        return "$39.40";
    }
};

// [CONCRETE STRATEGY]
var Fedex = function () {
    this.calculate = function (package) {
        // calculations...
        return "$43.20";
    }
};

// [CLIENT]
function run() {
    var package = { from: "76712", to: "10012", weigth: "lkg" };

    // the 3 strategies

    var ups = new UPS();
    var usps = new USPS();
    var fedex = new Fedex();

    var shipping = new Shipping(); // context

    shipping.setStrategy(ups);
    console.log("UPS Strategy: " + shipping.calculate(package));
    shipping.setStrategy(usps);
    console.log("USPS Strategy: " + shipping.calculate(package));
    shipping.setStrategy(fedex);
    console.log("Fedex Strategy: " + shipping.calculate(package));
}

run()
