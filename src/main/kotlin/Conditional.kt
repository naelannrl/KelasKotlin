fun main() {

    val isSamboGuilty = true
    val isFalse = false

    if (isSamboGuilty) {
        println("He will be jailled")
    } else
        println("somethink wrong with this country")
    }

    val lamaTahanan = if (isSamboGuilty) 50 else 0

    val num = 4

    val result = when {
        num > 5 && num < 7 -> "Positive"
        num > 10 -> "Negative"
        else -> "out of bound"
    }
    println(result)
}