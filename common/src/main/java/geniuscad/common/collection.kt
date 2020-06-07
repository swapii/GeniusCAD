package geniuscad.common

fun <T> List<T>.elementAtEnd(indexFromEnd: Int) = elementAt(lastIndex - indexFromEnd)
