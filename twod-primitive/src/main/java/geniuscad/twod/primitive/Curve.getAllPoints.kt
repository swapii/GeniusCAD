package geniuscad.twod.primitive

fun Curve.getAllPoints(): List<Point> =
    this.flatMap { listOf(it.a, it.b) }
