// TODO:
// 1. Stwórz funkcję, która będzie przyjmować jako parametr parę.
// Pierwszy argument z pary bedzie mówił, ile razy należy powtórzyć string,
// a drugi, jakiego separatora należy użyć.

fun main() {
    // TODO: Odkomentuj
    val result1 = "Hello" repeatAndJoinWith (3 to "-") // Powinno zwracać Hello-Hello-Hello
    val result2 = "Kotlin" repeatAndJoinWith (2 to " ")
    val result3 = "Hi" repeatAndJoinWith (5 to ", ")

    println(result1)
    println(result2)
    println(result3)
}

infix fun String.repeatAndJoinWith(pair: Pair<Int, String>): String {
    var result = ""
    for (i in 0 until pair.first){
        result+=this.plus(pair.second)
    }
    return result.removeSuffix(pair.second)
}