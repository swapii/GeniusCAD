package geniuscad.primitive.dimension2

import kotlin.math.abs
import kotlin.math.hypot

fun Point.distanceTo(anotherPoint: Point): Double =
    hypot(
        abs(this.x - anotherPoint.x),
        abs(this.y - anotherPoint.y)
    )
