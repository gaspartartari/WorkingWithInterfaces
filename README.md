# Shape Collection and Sorting

This Java application demonstrates working with a collection of shapes, including rectangles and circles, and sorting circles based on their properties. It also uses functional interfaces and custom interfaces.

## Table of Contents
- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [License](#license)

## Introduction

This Java application showcases object-oriented programming concepts, interfaces, and sorting. The code defines shapes, including rectangles and circles, and provides the ability to add shapes to a collection, remove them, calculate total area and perimeter, and sort circles based on their properties.

## Project Structure

The project is organized into several Java classes and an enumeration:

- `entities.Shape`: An interface defining the shape properties.
- `entities.Circle`: A class representing a circle that implements the `Shape` interface.
- `enumerations.Color`: An enumeration for defining colors.
- `entities.Rectangle`: A class representing a rectangle that implements the `Shape` interface.
- `entities.ShapeCollection`: A class to manage a collection of shapes.
- `entities.Drawable`: An interface for shapes that can be drawn.
- `entities.Calculator`: A functional interface for mathematical calculations.
- `App.java`: The main application that demonstrates the functionality of the classes.

## Features

- Define shapes and implement the necessary interfaces.
- Manage a collection of shapes and perform operations on them.
- Sort circles based on radius and other properties.

## Getting Started

To run this Java application, follow these steps:

1. Clone this repository to your local machine.
2. Make sure you have Java and an Integrated Development Environment (IDE) installed.
3. Open the project in your IDE.
4. Run the `App.java` file to see the application in action.

## Usage

The application demonstrates adding shapes, calculating area and perimeter, and sorting circles by radius.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
