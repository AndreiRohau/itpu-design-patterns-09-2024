import { Rectangle } from './Rectangle';
import { Square } from './Square';

console.log('==========================');
// expected behaviour
var rect: Rectangle = new Square(10); // Can be either a Rectangle or a Square
//rect = new Rectangle(10, 10); // Can be either a Rectangle or a Square
rect.setWidth(20);
printArea(rect);

function printArea(rect: Rectangle) {
        console.log('rect.getArea() == 200 is ' + (rect.getArea() == 200))
}
function printAreaV2(rect: Rectangle) {
    if (rect instanceof Square) {
        console.log('rect.getArea() == 400 is ' + (rect.getArea() == 400))
    } else {
        console.log('rect.getArea() == 200 is ' + (rect.getArea() == 200))
    }
}
// Rectangle assumes an area of 200. Square breaks that behavior by expecting an area of 400. Therefore, Rectangle and Square are not substitutable.

console.log('==========================');
