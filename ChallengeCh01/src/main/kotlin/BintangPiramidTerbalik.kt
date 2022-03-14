fun main() {
    bentukPiramidTerbalik() //memanggil yang ada di function bentukPiramidTerbalik

}

fun bentukPiramidTerbalik(){
    val bintang : Int = 8 //untuk nama variable bintang tipe datanya integer bernilai 8

    for (i in bintang downTo 1){ //variable i akan mencetak dari 8 sampai 1
        for (k in bintang downTo i+1){ //variable k akan mencetak dari 8 sampai i dikurang 1
            print(" ")  //ngeprint/mencetak untuk variable k
        }
        for (j in 1..(i*2)-1){ //j akan mencetak dari 1 sampai i dikali 2 dikurang 1
            print("*") //mencetak untuk variable j
        }
        println(" ") //mencetak untuk variable i
    }
}


