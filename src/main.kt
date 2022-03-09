import java.security.spec.MGF1ParameterSpec

fun main(){
    names()
    cities()
    numbers()
    var m=people(name1 ="juliet", name2 ="ann", name3 ="carddy")
    println(m.contentToString())
}
fun names(){
    var arraynames=arrayOf("julie","ann","joy","essy")
    println(arraynames.contentToString())
}
fun cities(){
    var cities= arrayOf("harare", "mumbai","dodoma","jakarta")
    cities.forEach { cities->
        println(cities.capitalize())

    }


}
fun numbers(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers.get(1)+ numbers.get(4)
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray() .contentToString())
}
fun people(name1:String,name2:String,name3:String):Array<String>{
    var people=arrayOf(name1,name2,name3)
    return people
}
