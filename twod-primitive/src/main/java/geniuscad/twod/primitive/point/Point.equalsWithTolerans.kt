package geniuscad.twod.primitive.point

import kotlin.math.abs

fun Point.equalsWithErrorTolerance(another: Point, tolerance: Double): Boolean {
    return abs(x - another.x) <= tolerance && abs(y - another.y) <= tolerance
}
