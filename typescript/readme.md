### install guide
- [How to install NVM on Windows 11](https://www.youtube.com/watch?v=E6k6R4PnLV0)
- !!! make sure nvm and node are uninstalled from your PC
- [nvm-windows/releases](https://github.com/coreybutler/nvm-windows/releases)
- [download/1.1.12/nvm-setup.exe](https://github.com/coreybutler/nvm-windows/releases/download/1.1.12/nvm-setup.exe)

### versions
- nvm 1.1.12
- node v22.9.0
- npm 10.8.3

### useful
- nvm list available
- nvm install 
  - latest
  - 22.9.0
- nvm on
- nvm ls
- nvm use 22.9.0
- Set-ExecutionPolicy Unrestricted


# init new prj commands
- [How to Setup a TypeScript + Node.js Project](https://www.youtube.com/watch?v=x-j8OnM15tA)
- npm init -y
- npm i express
- npm i --save-dev typescript @types/express @types/node
- npx tsc --init
- tsconfig.json 
  - "target": "ES2022",
  - "rootDir": "src",
  - "outDir": "build",
- npx tsc
- node build/usage.js
- package -> scripts -> "start": "npx tsc && node build/usage.js",
- npm start