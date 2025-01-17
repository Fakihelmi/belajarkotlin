fun main() {
    var firstname: String = "fakih"
    var lastname: String = "Mika"


    var alamat: String = """
        |Bekasi, 
        |Jawa Barat, 
        |Indoensia
    """.trimMargin()
    println(firstname)
    println(lastname)

    println(alamat)

    var fullname: String = "$firstname $lastname"
    println(fullname)
    var deskripsi: String = "$fullname length= ${fullname.length}"
    println(deskripsi)
}