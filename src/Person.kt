public class Person(idP : Int) {
    public val id = idP
    public var infected: Boolean = false
    // number of person that himself has infected

    fun getSick(){
        //println("oh no , i'm infected now")
        this.infected = true
    }
}