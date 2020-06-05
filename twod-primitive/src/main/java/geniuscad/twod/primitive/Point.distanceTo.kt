package geniuscad.twod.primitive

import kotlin.math.abs
import kotlin.math.hypot

fun Point.distanceTo(anotherPoint: Point): Double =
    hypot(
        abs(this.x - anotherPoint.x),
        abs(this.y - anotherPoint.y)
    )
