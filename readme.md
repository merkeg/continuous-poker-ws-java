# Continuous Poker Java Websocket Client
This is the java client for the [dealer](https://github.com/merkeg/continuous-poker-dealer)
## Running the application
1. Clone this repository
2. Setup the application in your IDE
   1. Change the Endpoint, the Game ID, and the Teamname in the `setup`-method in the `Strategy` class (Your instructor informs you about what belongs there)
   2. Write your poker logic in the `decide`-method inside the `Strategy` class
3. Start the application via your IDE
   1. `maven clean install`
   2. Then run the main method inside of the `Main` class