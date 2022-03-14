fun main() {
     bentukKetupat() //memanggil yang ada di function bentukKetupat
}


fun bentukKetupat() {
    val bintang : Int = 8 //untuk nama variable bintang tipe datanya integer bernilai 8

    for (i in 1..7){  //artinya variabel i akan mencetak dari 1 sampai 7 (increment)
        for (j in bintang downTo  i+1){ // j akan mencetak dari i+1 sampai 8 (decrement)
            print(" ") // ngeprint variable j
        }
        for (k in 1..i*2-1){ // k akan mencetak dari 1 sampai i dikali 2 dikurang 1
            print("*") //ngeprint '*' untuk variable k
        }
        println(" ") // ngeprint variable i (untuk membuat garis baru)
    }

    for (i in bintang downTo 1){ // artinya variable i akan mencetak dari 1 sampai 8 (decrement)
        for (k in bintang downTo i+1){ // variable k mencetak dari i+1 sampai ke 8 (decrement)
            print(" ") //ngeprint variable k
        }
        for (j in 1..i*2-1){ //j akan mencetak dari 1 sampai i dikali 2 dikurang 1
            print("*") //ngeprint variable j
        }
        println(" ") //ngeprint variable i (membuat garis baru)
    }
}