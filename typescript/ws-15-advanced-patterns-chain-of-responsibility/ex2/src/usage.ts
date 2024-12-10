console.log("works")  

interface DiscountHandler {
  setNext(handler: DiscountHandler): DiscountHandler;
  applyDiscount(products: string[], originalPrice: number): number;
}

abstract class AbstractDiscountHandler implements DiscountHandler {
  private nextHandler: DiscountHandler;

  public setNext(handler: DiscountHandler): DiscountHandler {
    this.nextHandler = handler;
    return handler;
  }

  public applyDiscount(products: string[], originalPrice: number): number {
    if (this.canHandle(products)) {
      return this.handleDiscount(originalPrice);
    } else if (this.nextHandler) {
      return this.nextHandler.applyDiscount(products, originalPrice);
    } else {
      return originalPrice;
    }
  }

  protected abstract canHandle(products: string[]): boolean;
  protected abstract handleDiscount(originalPrice: number): number;
}

class ElectronicsDiscountHandler extends AbstractDiscountHandler {
  protected canHandle(products: string[]): boolean {
    return products.some(p => p === 'Electronics');
  }

  protected handleDiscount(originalPrice: number): number {
    return originalPrice * 0.9;
  }
}

class BooksDiscountHandler extends AbstractDiscountHandler {
  protected canHandle(products: string[]): boolean {
    return products.some(p => p === 'Books');
  }

  protected handleDiscount(originalPrice: number): number {
    return originalPrice * 0.85;
  }
}

class ClothingDiscountHandler extends AbstractDiscountHandler {
  protected canHandle(products: string[]): boolean {
    return products.some(p => p === 'Clothing');
  }

  protected handleDiscount(originalPrice: number): number {
    return originalPrice * 0.8;
  }
}

class ToysDiscountHandler extends AbstractDiscountHandler {
  protected canHandle(products: string[]): boolean {
    return products.some(p => p === 'Toys');
  }

  protected handleDiscount(originalPrice: number): number {
    return originalPrice;
  }
}

class DiscountCalculator {
  private discountHandler: DiscountHandler;

  constructor() {
    const electronicsHandler = new ElectronicsDiscountHandler();
    const booksHandler = new BooksDiscountHandler();
    const clothingHandler = new ClothingDiscountHandler();
    const toysHandler = new ToysDiscountHandler();

    electronicsHandler.setNext(booksHandler).setNext(clothingHandler).setNext(toysHandler);

    this.discountHandler = electronicsHandler;
  }

  public calculateDiscount(products: string[], originalPrice: number): number {
    return this.discountHandler.applyDiscount(products, originalPrice);
  }
}

// summarizing discounts
class DiscountCalculatorV2 {
  private discountHandlers: Array<DiscountHandler> = [];

  constructor() {
    const electronicsHandler = new ElectronicsDiscountHandler();
    const booksHandler = new BooksDiscountHandler();
    const clothingHandler = new ClothingDiscountHandler();
    const toysHandler = new ToysDiscountHandler();
    this.addFirst(electronicsHandler)
    this.addLast(booksHandler)
    this.addLast(clothingHandler)
    this.addLast(toysHandler)
  }

  public calculateDiscount(products: string[], originalPrice: number): number {
      let finalPrice = originalPrice;
      for (let discountHandler of this.discountHandlers) {
          finalPrice = discountHandler.applyDiscount(products, finalPrice);
      }
      return finalPrice;
  }

  public addFirst(discountHandler: DiscountHandler) {
      this.discountHandlers.unshift(discountHandler)
  }

  public addLast(discountHandler: DiscountHandler) {
      this.discountHandlers.push(discountHandler)
  }

}

// electronics==10% books==15% clothing==20% toys==0%
const calculator = new DiscountCalculator();
const calculator2 = new DiscountCalculatorV2(); // summarizing discounts

console.log(calculator.calculateDiscount(['Electronics', 'Clothing'], 100)); // Output: 90
console.log(calculator.calculateDiscount(['Books'], 100)); // Output: 85
console.log(calculator.calculateDiscount(['Toys'], 100)); // Output: 100
console.log(calculator.calculateDiscount(['Books', 'Clothing'], 100)); // Output: 85
console.log('--------')
console.log(calculator2.calculateDiscount(['Electronics', 'Clothing'], 100)); // Output: 72
console.log(calculator2.calculateDiscount(['Books'], 100)); // Output: 85
console.log(calculator2.calculateDiscount(['Toys'], 100)); // Output: 100
console.log(calculator2.calculateDiscount(['Books', 'Clothing'], 100)); // Output: 68 (64)
