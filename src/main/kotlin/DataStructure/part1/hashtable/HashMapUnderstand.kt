package DataStructure.part1.hashtable

class HashMapUnderstand {


}

fun main() {

    val  mapKamel = HashMap<Int,String>()
    mapKamel.put(1,"kamel")
    mapKamel.put(2,"sayed")
    mapKamel.put(3,"mahmoud")

    // entiries and keys
    for(item in mapKamel.entries){
        print(item)
    }

    print(mapKamel)

}