fun main(){
    var name = arrayOf("Joy","Lilian","Caroline","Mamayo")
    println(name.contentToString())

    var h = arrayOf("harare","mumbai","dodoma","jakarta")
    places(h)

    sum(arrayOf(32,4,213,78,43,90,31,73,11,158,62))

    girls(arrayOf("Martha","Juana","Apolonia"))




    fun namesOfGirls(name: Array<String>){
        println(name.contentToString())
    }







}

fun places(name:Array<String>) {
  name.forEach { name ->
      println(name.capitalize())

  }


    }

fun sum(number: Array<Int>){
    var answer= number[2] + number[5]
    println(answer)

    var sell=number.indexOf(158)
    println(sell)

    var sum=number.sortedArray()
    println(sum.contentToString())

}
fun girls(names: Array<String>):Array<String>{
    var names= names
    println(names.contentToString())
    return names
}