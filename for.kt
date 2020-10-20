fun main (){
    val names = arrayOf("Dhani", "Irpan", "Kangmus")

    for (i in names){
        println(i)
    }

    for (j in 1..10){
        println(j)
    }

    for (k in 10 downTo 1 step 2){
        println(k)
    }

    //TES//
    val dayOfweek = arrayOf("Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu")
    for (hari in dayOfweek){
        println(hari)
    }

    for (day in dayOfweek.indices){
        println("Day $day is :" + dayOfweek[day])
    }

    for ((index,value) in dayOfweek.withIndex()){
        println("Day $index is : $value")
    }

}