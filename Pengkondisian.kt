fun main(){

    val nilai = 90 //lebih dari

    if (nilai > 80) {
        println("Selamat")
    }
        else{
            println("coba lagi nanti")
        }

    val nama = "Ramadhani Fauzi Azhar" //sama dengan

    if (nama == "irpantek"){
        println("Completed")
    }else{
        println("salah akun bosss")
    }

    val umur = 22 //lebih dari sama dengan

    if (umur <= 18){
      println("anda sudah gede")
    }else{
        println("anda masih belum cukup umur")
    }

    val exam = 70 //kurang dari sama dengan

    if (exam >= 75){
        println("selamat anda lulus")
    }else{
        println("anda remidi")
    }

    val username = "dhanifauzi" //tidak sama dengan

    if (username != "dhanifauzi"){
        println("coba lagi")
    }else{
        println("selamat anda dapat masuk")
    }

    val nilai2 = 10

    if (nilai2 > 81){
        println("Nilai A")
    }else if (nilai2 > 71){
        println("Nilai B")
    }else if (nilai2 > 61){
        println("Nilai C")
    }else{
        println("Nilai D")
    }
}