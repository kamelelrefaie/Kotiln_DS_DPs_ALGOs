package DataStructure.part1.hashtable

fun main() {
    //  a green apple
    val map = HashMap<Char, Int>()
    val string = firstRepeatedCharacter("agreenapple")
    print(string)


}

fun firstRepeatedCharacter(text: String): Char {
    val map = HashMap<Char, Int>()
    for (c in text) {
        if (!map.containsKey(c)) {
            map[c] = 1
        } else {
            val count = map[c]
            map[c] = count!! + 1
        }
    }

    for (c in text) {
        if (map[c]!! == 1) {
            return c
            break
        }
    }
    return '0'
}