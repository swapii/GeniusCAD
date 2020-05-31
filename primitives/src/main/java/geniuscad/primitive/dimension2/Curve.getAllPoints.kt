package geniuscad.primitive.dimension2

fun Curve.getAllPoints(): List<Point> =
    this.flatMap { listOf(it.a, it.b) }
