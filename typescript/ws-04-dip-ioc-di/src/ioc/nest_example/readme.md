How to use NEST ?

Description:

**main.ts:**
- `This is the entry point of your application. It uses NestFactory to create a Nest application instance and starts listening for incoming requests on port 3000.

**app.module.ts:**
- The root module of the application. It defines the controllers, providers, and imports for the application.

**app.controller.ts:**
- A basic controller that handles a GET request at the root path (/). It injects the AppService to retrieve the "Hello World!" message.

**app.service.ts:**
- A service that provides the "Hello World!" message.

**To run this example:**
- Make sure you have Node.js and npm installed.
- Install the Nest CLI: `npm install -g @nestjs/cli`
- Create a new Nest project: `nest new my-nest-project`
- Replace the contents of the generated files with the code above.
- Start the application: `npm run start`

You can then access the "Hello World!" message by visiting http://localhost:3000/ in your browser.