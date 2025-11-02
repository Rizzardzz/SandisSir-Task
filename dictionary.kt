package com.example.samrat

fun main() {
    val dictionary = mapOf(
        "rizz" to " slang term for style, charm, or attractiveness",
        "banana" to "a long curved fruit that grows in clusters",
        "computer" to "an electronic device for processing data",
        "no cap" to "used to assert that something is true or not exaggerated",
    )
    print("Enter a word: ")
    val word = readLine()?.lowercase()
    if (word != null && dictionary.containsKey(word)) {
        println("Meaning of \"$word\": ${dictionary[word]}")
    } else {
        println("Sorry, word not found in dictionary.")
    }
}
