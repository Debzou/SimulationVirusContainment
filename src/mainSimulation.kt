import java.io.FileInputStream
import java.util.*
import java.util.concurrent.ThreadLocalRandom


fun main(args: Array<String>){
    // read the config file : ./src/config.properties
    val config = FileInputStream("./src/config.properties")
    val prop = Properties()
    prop.load(config)
    val world = World()
    // read config file
    val numberPerson : Int = prop.getProperty("world.number").toInt()
    val numberMeeting : Int = prop.getProperty("world.meeting").toInt()
    val numberDays : Int = prop.getProperty("world.days").toInt()
    val numberOut : Int = prop.getProperty("world.outPerson").toInt()
    val probability : Double = prop.getProperty("world.probability").toDouble()
    val percentage : Double = prop.getProperty("world.percentageOutside").toDouble()
    val daysBefore : Int = prop.getProperty("world.daysWithoutContainment").toInt()
    println("Start simulation")

    // the infected arrive in the world
    world.initWorld(numberPerson , numberMeeting, probability)
    println("The world is init")

    // days without containment
    println((numberPerson*percentage).toInt())
    for(i in 0 until daysBefore){
        world.day((numberPerson*percentage).toInt())
    }

    // the epidemic is too important
    // that why containment is put in place
    for(i in 0 until numberDays step 1) {
       world.day(numberOut)
    }
    println("end simulation")

}