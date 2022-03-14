fun main() {
    bentukPlus() //memanggil yang ada di function bentukPlus

}

fun bentukPlus(){
    val bintang : Int = 9 //untuk nama variable bintang tipe datanya integer bernilai 9

    for (i in 1..bintang){ //variable i akan mencetak dari 1 sampai 9
        for (j in 1..bintang){ //variable j akan mencetak dari 1 sampai 9
            if (i==5 || j==5){ // kondisi untuk mencetak bintang
                print("* ") //ngeprint "*" untuk kondisi
            } else{ //diluar kondisi
                print("  ") //ngeprint untuk selain kondisi
            }
        }
        println(" ") //ngeprint untuk variable i (mencetak garis baru)
    }
}