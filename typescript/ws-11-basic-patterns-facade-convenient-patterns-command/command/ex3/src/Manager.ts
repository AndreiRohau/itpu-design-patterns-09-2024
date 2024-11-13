import {Command} from './Command'
import {UserCreate} from './command/UserCreate'
import {UserRead} from './command/UserRead'
import {UserUpdate} from './command/UserUpdate'
import {UserDelete} from './command/UserDelete'

// DISPATCHER / controller / client / manager
export class Manager {
    private _commands: Map<string, Command>

    public constructor() {
        this._commands = new Map<string, Command>()
        this._commands.set('create', new UserCreate())
        this._commands.set('read', new UserRead())
        this._commands.set('upd', new UserUpdate())
        this._commands.set('del', new UserDelete())
    }

    public process(...args: any) {
                  const commandName = args[0]
                  let foundCommand = null
                  if (this._commands.has(commandName)) {
                      foundCommand = this._commands.get(commandName)
                  }
                  if (foundCommand != null) {
                      foundCommand.execute(args)
                  } else {
                      console.log('NO SUCH COMMAND: ', commandName)
        }
    }
}
