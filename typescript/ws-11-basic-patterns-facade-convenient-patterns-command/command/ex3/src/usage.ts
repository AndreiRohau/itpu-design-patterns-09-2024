console.log("works")

import {UserRepositoryFake} from './dao/UserRepositoryFake'
import {Manager} from './Manager'

const repo: UserRepositoryFake = UserRepositoryFake.getInstance()
function test(repo: UserRepositoryFake) {
    console.log()
    console.log('test starts')
    repo.printUserStorage()
    console.log('test ends')
    console.log()
}

const manager: Manager = new Manager()

test(repo)
manager.process('create', '111', 'Andy')
manager.process('create', '222', 'Bob')
manager.process('create', '333', 'Chloe')
test(repo)
manager.process('read', '222')
test(repo)
manager.process('upd', '333', 'Johny')
test(repo)
manager.process('del', '111')
test(repo)
