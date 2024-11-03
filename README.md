# AnimalSanctuaryProject
By Erin Hermanson

## Overview
- This project is for an animal sanctuary game of sorts where you run an animal sanctuary.
- - It has a set of enclosures for animals, which you get to decide the initial size of, with a minimum of 1.
- - - If we try to add an animal but the sanctuary is full, we double the size of the sanctuary.
- - It has an attendant, which we can have go out and tend the animals.  Doing so will feed the animals a random amount of their favorite food.
- - At this time, the sanctuary only takes care of cows, ducks, and lions.  This could be expanded.

## Topics/Technologies Used
This project uses:
- While, for, and foreach loops
- Arrays of objects
- A scanner
- Object instantiation and assignment
- Math.random
- Standard output
- Basic error handling methodologies
- Abstract classes
- Polymorphism
- Inheritance
- Encapsulation


## Lessons Learned
I actually created an endless loop in my addAnimal for the case where the sanctuary was of size 0.
- This is because in expandSanctuary I blindly multiplied the size by 2, which would still be 0 if it was 0 beforehand.
- I'm guarding against this by making sure that it cannot be of size zero or less when initializing it, though I could have put an if statement to catch it before doubling the size.