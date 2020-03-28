import kotlin.collections.ArrayList
import java.io.FileInputStream
import java.util.*
import java.util.concurrent.ThreadLocalRandom


public class World {
    // is this world person can be infected or not
    private val listPerson = ArrayList<Person>()
    private var numberOfMeeting : Int = 0
    private var numberOfPerson : Int = 0
    private var probability : Double = 0.90

    private fun meeting(person : Person){
        // interaction
        // person meet a number of person
        var randomValue: Int
        var current : Person
        var randomContamination : Double
        //println("I am in contact with you")
        for (i in 0 until this.numberOfMeeting step 1){
            if (person.infected){
                // if the person is infected
                // random value between 0 and numberOfMeeting
                randomValue = ThreadLocalRandom.current().nextInt(this.numberOfPerson)
                current = this.listPerson[randomValue]
                randomContamination = ThreadLocalRandom.current().nextDouble()
                if (current.id != person.id && !current.infected && randomContamination < this.probability){
                    // test if current is not the same that person
                    // and if current is not infected
                    this.listPerson[randomValue].getSick()
                }
            }

        }

    }

    fun initWorld(numberPerson : Int, nMeeting : Int, probability : Double){
        var count : Int = 0
        var person : Person
        this.probability = probability
        this.numberOfPerson = numberPerson
        this.numberOfMeeting = nMeeting
        for(i in 0 until numberPerson step 1){
            person = Person(i)
            if(i === 0){
                count+=1
                person.getSick()
            }
            this.listPerson.add(person)

        }
        println("number of infected : $count")

    }

    fun day(outPerson :Int){
        var count : Int = 0
        for (i in 0 until outPerson step 1){
            // Men / Women outsider
            var randomValue = ThreadLocalRandom.current().nextInt(this.numberOfMeeting)
            var current = this.listPerson[randomValue]
            this.meeting(current)
        }
        for (item in this.listPerson){
            if (item.infected){
                count+=1
            }
        }
        println("number of infected : $count")
    }

}