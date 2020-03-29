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
### Literal explanation of the configuration file 
here's my configuration, in my simulation of the world at 120,000 people.
Of the 120 000 people, 5% are in contact with 2 people (6000 people). And the propagation will last 3 days.  Then there will be 14 days of confinement. That is to say that the percentage of contact will be reduced by 0.95% (300 people).

### Resulat 
```bash
Start simulation
number of infected : 1
The world is init
number of infected : 2346
number of infected : 4670
number of infected : 6997
The world is confined
number of infected : 7112
number of infected : 7218
number of infected : 7348
number of infected : 7450
number of infected : 7565
number of infected : 7686
number of infected : 7796
number of infected : 7909
number of infected : 8017
number of infected : 8135
number of infected : 8255
number of infected : 8367
number of infected : 8459
number of infected : 8575
end simulation

Process finished with exit code 0

```
