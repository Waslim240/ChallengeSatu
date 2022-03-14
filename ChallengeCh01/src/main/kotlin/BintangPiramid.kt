fun main() {
    bentukPiramid() //memanggil yang ada di function bentukPiramid
}

fun bentukPiramid(){
    val bintang : Int = 8 //untuk nama variable bintang tipe datanya integer bernilai 8

    for (i in 1..bintang){ //variable i  akan mencetak dari 1 sampai 8 (increment)
        for (j in bintang downTo  i+1){ // variable j mencetak dari i ditambah 1 sampai 8 (decrement)
            print(" ") //ngeprint untuk variable j
        }
        for (k in 1..(i*2)-1){ // variable k akan mencetak dari 1 sampai i dikali 2 dikurang 1 (increment)
            print("*") //ngeprint variable k (mencetak '*')
        }
        println(" ") //ngeprint variable i (membuat garis baru)
    }
}