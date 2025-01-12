Design Patterns Implemented

1. Creational Patterns

Singleton

Ensures a single instance of the coffee machine.

Client Example: Use CoffeeMachine.getInstance() to brew coffee.

Factory Method

Dynamically creates different coffee types (e.g., Espresso, Latte).

Client Example: Create a coffee using EspressoFactory or LatteFactory.

Abstract Factory

Creates families of related coffee products (e.g., Coffee and Cups).

Client Example: Use EspressoFactory or LatteFactory to create a coffee and its corresponding cup.

Builder

Constructs complex coffee orders step by step.

Client Example: Build a coffee order with milk and sugar using CoffeeOrder.Builder.

Prototype

Clones an existing coffee order.

Client Example: Clone a coffee order using the clone() method.

2. Structural Patterns

Decorator

Dynamically adds extras (e.g., milk, sugar) to a coffee.

Client Example: Wrap BasicCoffee with MilkDecorator and SugarDecorator.

Adapter

Adapts a new coffee machine to work with an old interface.

Client Example: Use CoffeeMachineAdapter to handle new machine requests.

Composite

Manages a hierarchy of coffee machines or coffee components.

Client Example: Use CoffeeGroup to prepare multiple coffees at once.

Facade

Simplifies the coffee preparation process.

Client Example: Use CoffeeFacade to make coffee with a single method call.

Bridge

Decouples coffee machine abstraction from brewing system implementation.

Client Example: Use AdvancedCoffeeMachine with EspressoSystem or FrenchPressSystem.

Proxy

Controls access to the coffee machine.

Client Example: Use CoffeeMachineProxy to restrict or allow brewing.

3. Behavioral Patterns

Observer

Notifies customers when coffee is ready.

Client Example: Add Customer observers to CoffeeNotifier.

Strategy

Chooses a brewing strategy dynamically.

Client Example: Use EspressoStrategy or FrenchPressStrategy with the coffee machine.

Command

Encapsulates coffee machine operations as commands.

Client Example: Use BrewEspressoCommand or BrewLatteCommand with the coffee machine.

State

Changes coffee machine behavior based on its state.

Client Example: Switch between ReadyState and BrewingState in the coffee machine.

Template Method

Defines a coffee preparation skeleton with customizable steps.

Client Example: Use Espresso or Latte to prepare coffee with specific steps.

Chain of Responsibility

Passes coffee requests through a chain of handlers.

Client Example: Use EspressoHandler and LatteHandler to handle coffee requests.

Contribution

Feel free to contribute by creating pull requests or reporting issues. Follow the standard coding conventions and include tests for any new feature or fix.
