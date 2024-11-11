import {Command} from './Command'
import {UserCreate} from './command/UserCreate'
import {UserRead} from './command/UserRead'
import {UserUpdate} from './command/UserUpdate'
import {UserDelete} from './command/UserDelete'

export class Manager {
    private commands: Map<string, Command>

    public constructor() {
        this.commands = new Map<string, Command>()
        this.commands.set('create', new UserCreate())
        this.commands.set('read', new UserRead())
        this.commands.set('upd', new UserUpdate())
        this.commands.set('del', new UserDelete())
    }

    public process(...args: any) {
        const commandName = args[0]
        let foundCommand = null
        if (this.commands.has(commandName)) {
            foundCommand = this.commands.get(commandName)
        }
        if (foundCommand != null) {
            foundCommand.execute(args)
        } else {
            console.log('NO SUCH COMMAND: ', commandName)
        }
    }
}
