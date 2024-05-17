object PalindromeNumber {
    fun solution(x: Int): Boolean {
        val num = x.toString();
        val firstHalf = num.slice(IntRange(0, num.length/2 - 1))
        val secondHalf = num.slice(IntRange(num.length/2 + (num.length % 2), num.length-1))
        println("$firstHalf $secondHalf");
        return firstHalf == secondHalf.reversed();
        // perfectly showcases the ability to overcomplicate things
        // could've been just x.toString() == x.toString().reversed()
    }
}