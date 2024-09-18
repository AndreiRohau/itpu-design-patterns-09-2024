import { Shape } from './Shape'
import { RectangleImpl } from './RectangleImpl'
import { SquareImpl } from './SquareImpl'

console.log('==========================')
// expected behaviour
var shape1: Shape = new SquareImpl(10) // Can be either a Rectangle or a Square
var shape2: Shape = new RectangleImpl(10, 10) // Can be either a Rectangle or a Square

changeSide(shape1, 33)
changeSide(shape2, 33)

printArea(shape1)
printArea(shape2)

function printArea(shape: Shape) {
    console.log(shape.getArea())
}

function changeSide(shape: Shape, aSide: number) {
    if (shape instanceof SquareImpl) {
        console.log('update side of a SquareImpl')
    } else if (shape instanceof RectangleImpl) {
        console.log('update side of a RectangleImpl')
    } else {
        console.log('is it legal ?!')
    }
}
console.log('==========================')
