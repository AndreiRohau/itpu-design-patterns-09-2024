console.log("works")  

// just a function like static one, can be treated like lambdas
function add(x: number, y: number): number { return x + y; }
function sub(x: number, y: number): number { return x - y; }
function mul(x: number, y: number): number { return x * y; }
function div(x: number, y: number): number { return x / y; }

class Command {
    execute: (x: number, y: number) => number
    undo: (x: number, y: number) => number
    value: number

    constructor(execute: (x: number, y: number) => number,
                undo: (x: number, y: number) => number,
                value: number) {
        this.execute = execute;
        this.undo = undo;
        this.value = value;
    }
}

class AddCommand extends Command {
    constructor(value: number) {
        super(add, sub, value); } }

class SubCommand extends Command {
    constructor(value: number) {
        super(sub, add, value); } }

class MulCommand extends Command {
    constructor(value: number) {
        super(mul, div, value); } }

class DivCommand extends Command {
    constructor(value: number) {
        super(div, mul, value); } }

class Calculator {
    private current: number = 0;
    private commands: Command[] = [];

    execute(command: Command): void {
        this.current = command.execute(this.current, command.value);
        this.commands.push(command);
        console.log(`${this.action(command)}: ${command.value}`);
    }

    undo(): void {
        const command = this.commands.pop();
        if (command) {
            this.current = command.undo(this.current, command.value);
            console.log(`Undo ${this.action(command)}: ${command.value}`);
        }
    }

    getCurrentValue(): number {
        return this.current;
    }

    private action(command: Command): string {
        const name = command.execute.toString().substring(9, 12);
        return name.charAt(0).toUpperCase() + name.slice(1);
    }
}


const calculator = new Calculator();
console.log(`Start value : ${calculator.getCurrentValue()}`);
calculator.getCurrentValue()
// Issue commands
calculator.execute(new AddCommand(100));
calculator.execute(new SubCommand(24));
calculator.execute(new MulCommand(6));
calculator.execute(new DivCommand(2));
// Reverse last two commands
calculator.undo();
calculator.undo();

console.log(`\nValue: ${calculator.getCurrentValue()}`);

