# Simulation of virus propagation

## Simulation programming language : Kotlin
[what's koltin](https://kotlinlang.org/)

### Go to the file config.properties
change the values of the simulation
Be careful ! Percentages are numbers between 0 and 1. 

```python
# number of person in this world
world.number = 120000
# number of people, a person meets when they go out
world.meeting = 2
# probability to infected someone
world.probability = 0.4

# percentage of contacts ( before on containment )
world.percentageOutside = 0.05
# percentage , reduce contacts
world.percentageReduceOutside = 0.95

# number of days without containment
world.daysWithoutContainment = 3
# containment day number
world.days = 14


# number of people leaving
world.outPerson = 120

```
