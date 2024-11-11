- [How to Setup a TypeScript + Node.js Project](https://www.youtube.com/watch?v=x-j8OnM15tA)
### Deploy locally and Run app
- deploy \ install project dependencies
  ```shell 
  npm install
  ```
- run usage.ts in command line
  ```shell 
  npm start
  ```
### Init new project in one click:
  ```shell
  mkdir src &
  mkdir build &
  echo console.log("works") > src/usage.ts &
  npm init -y &
  npm i --save-dev typescript @types/express @types/node &
  npx tsc --init &
  echo now update package.json and tsconfig.json files & 
  echo "--------" &
  echo "package -> scripts -\>" &
  echo "start": "npx tsc && node build/usage.js", &
  echo "--------" &
  echo &
  echo tsconfig.json &
  echo "lines: 14 - target - ES2022 | 29 - rootDir - ./src | 60 - outDir - ./build &" &
  echo "--------" &
  echo &
  ```
0. **Update package.json and tsconfig.json manually**


1. **package -> scripts ->**
    ```
    "start": "npx tsc && node build/usage.js",
    ```
2. **tsconfig.json** change value accordingly 

    lines: 14 - target | 29 - rootDir | outDir - 60

   -
        ```
        ES2022
        ```
   -
     ```
     src
     ```
   -
     ```
     build
     ```

___
### Init repo step by step
- create dirs: src and build
  ```shell
  mkdir src
  &
  mkdir build
  ```
- npm init -y
  ```shell 
  npm init -y
  ```
- npm i express
  ```shell 
  npm i express
  ```
- npm i --save-dev typescript @types/express @types/node
  ```shell 
  npm i --save-dev typescript @types/express @types/node
  ```
- npx tsc --init
  ```shell 
  npx tsc --init
  ```
- tsconfig.json --->>> uncomment lines and change its values in accordance
  - "target": "ES2022", (line 14)
  - "rootDir": "src", (line 29)
  - "outDir": "build", (line 60)
  

- npx tsc
  ```shell 
  npx tsc
  ```
- node build/usage.js
  ```shell 
  node build/usage.js
  ```
- package -> scripts ->
  ```
  "start": "npx tsc && node build/usage.js",
  ```
