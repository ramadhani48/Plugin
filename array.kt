fun main (){
    val nama = arrayOf("Dhani", "Irpantek", "Kangmus")
    //size = panjang array
    println(nama.size)
    //get(index) = ambil index array
    println(nama.get(1))

    //Explisit
    val member : Array<String> = arrayOf("Eko", "Joko", "Budi")
    val values : Array<Byte> = arrayOf(100,90,95)
    val balances : Array<Int> = arrayOf(10_000, 20_000, 30_000)

//    //Implisit
    val array1 = arrayOf(1,2,3)

//    //Mendapat data di posisi index
//    //1.use get(index)
    println(array1.get(0))

//    //2. Use [index]
    println(member[1])
    println(array1[0])
    println(array1[1])
    println(array1[2])
    println("======================================================================")

//    //Merubah data di posisi index
//    //1. Use set(index,value)
    member.set(0,"amar")
//    //2. Use [index]=value
    val amar : String = member[0]
//
    println(member[0])
    println("========================================================================")

//    //array nullable

    val names : Array<String?> = arrayOfNulls(size = 5)
    names.set(0, "Ramadhani")
    names.set(1, null)
    names.set(2, "Fauzi")
    names.set(3, null)
    names.set(4, "Ramadhani Fauzi Azhar")

    println(names[0])
    println(names[1])
    println(names[2])
    println(names[3])
    println(names[4])

}
