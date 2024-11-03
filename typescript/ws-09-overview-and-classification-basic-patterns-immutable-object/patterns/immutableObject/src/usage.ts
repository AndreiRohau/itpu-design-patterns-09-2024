import {ImmutableEx1} from "./ex1/ImmutableEx1";
import {Low} from "./ex2/Low";
import {Mid} from "./ex2/Mid";
import {High} from "./ex2/High";

function print(text:string) {
    console.log('--------')
    console.log(text)
    console.log('--------')
}

// ex 1
var immutableEx1: ImmutableEx1 = new ImmutableEx1()
immutableEx1.run()

// ex 2
var low = new Low('hello') // v1
var mid = new Mid(1991, low)
var high = new High(1, mid)
print(high.toString())

print('########')

var lowClone = mid.low // v2
print('low = ' + low + ' |||| VS |||| ' + 'lowClone = ' +  lowClone)
low.ms = 'v1'
lowClone.ms = 'v2'
print('low = ' + low + ' |||| VS |||| ' + 'lowClone = ' +  lowClone)

print('########')
var midClone = high.mid // v3
var lowCloneClone = midClone.low // v4
midClone.ms = 'v3'
lowCloneClone.ms = 'v4'

print(low.toString())
print(lowClone.toString())
print(midClone.toString())
print(lowCloneClone.toString())
print('')
