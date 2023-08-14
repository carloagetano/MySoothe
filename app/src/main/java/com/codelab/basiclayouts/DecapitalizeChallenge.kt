package com.codelab.basiclayouts

import java.util.Locale

/**
 * Decapitalize a given string.
 * Example: “FOO” and “FOO_BAR” result should be “fOO” and “fooBar”
 */
fun main() {
    val word = "FOO"
    println("Decapitalize: $word to ${decapitalize(word)}")

    val word2 = "FOO_BAR"
    println("Decapitalize: $word to ${decapitalize(word2)}")
}

fun decapitalize(input: String): String {
    return if (input.contains("_")) {
        val (first, second) = input.split("_")
        val convertedFirst = first.lowercase(Locale.getDefault())
        val convertedSecond = second.lowercase(Locale.getDefault())
            .replaceFirstChar { firstChar ->
                firstChar.uppercase(
                    Locale.getDefault()
                )
            }

        convertedFirst + convertedSecond

    } else {
        input.replaceFirstChar { firstChar -> firstChar.lowercase(Locale.getDefault()) }
    }
}