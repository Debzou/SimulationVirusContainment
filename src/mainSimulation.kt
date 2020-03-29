import java.io.FileInputStream
import java.util.*



fun main(args: Array<String>){
    // read the config file : ./src/config.properties
    val config = FileInputStream("./src/config.properties")
    val prop = Properties()
    prop.load(config)

    // create the world
    val world = World()

    // read config file
    val numberPerson : Int = prop.getProperty("world.number").toInt()
    val numberMeeting : Int = prop.getProperty("world.meeting").toInt()
    val numberDays : Int = prop.getProperty("world.days").toInt()
    val reduce : Double = prop.getProperty("world.percentageReduceOutside").toDouble()
    val probability : Double = prop.getProperty("world.probability").toDouble()
    val percentage : Double = prop.getProperty("world.percentageOutside").toDouble()
    val daysBefore : Int = prop.getProperty("world.daysWithoutContainment").toInt()
    println("Start simulation")

    // the infected arrive in the world
    world.initWorld(numberPerson , numberMeeting, probability)
    println("The world is init")

    // days without containment
    for(i in 0 until daysBefore){
        world.day((numberPerson*percentage).toInt())
    }

    println("The world is confined")
    // the epidemic is too important
    // that why containment is put in place
    for(i in 0 until numberDays step 1) {
       world.day((numberPerson*percentage*(1.00-reduce)).toInt())
    }
    println("end simulation")

}