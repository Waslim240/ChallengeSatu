fun main() {
    bentukSegitiga() //memanggil yang ada di function bentukSegitiga
}

fun bentukSegitiga () {
    val bintang : Int = 8 //untuk nama variable bintang tipe datanya integer bernilai 8

    for (i in 1..bintang) { //variable i akan mencetak 1 sampai 8
        for (j in 1..i) { //variable j akan mencetak 1 sampai i
            print("*") //ngeprint bintang untuk variable j
        }
        println(" ") //ngeprint variable i (membuat garis baru)
    }

}

