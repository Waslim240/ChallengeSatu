fun main() {
    bentukHurufX() //memanggil yang ada di function bentukHurufX
}

fun bentukHurufX (){
    val bintang : Int = 17  //untuk nama variable bintang tipe datanya integer bernilai 17

    for(i in 1..bintang  ){ //variable i akan mencetak dari 1 sampai 17
        for (j in 1..bintang){ //variable j akan mencetak dari 1 sampai 17
            if (j==i ) { //kondisi jika j sama dengan i maka cetak bintang
                print("*") //ngeprint "*" untuk kondisi j==i
            }else if (j+i == bintang+1){ //kondisi jika j+1 sama dengan 17+1
                print("*") //ngeprint "*" untuk kondisi j+1 sama dengan 17+1
            }else { //diluar kondisi di atas tidak mencetak "*"
                print(" ") //ngeprint untuk diluar kondisi
            }
        }
        println(" ") //ngeprint variable i (membuat garis baru)
    }
}