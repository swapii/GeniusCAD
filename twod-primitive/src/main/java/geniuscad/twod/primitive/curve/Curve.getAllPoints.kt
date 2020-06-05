package geniuscad.twod.primitive.curve

import geniuscad.twod.primitive.point.Point

fun Curve.getAllPoints(): List<Point> {
    //TODO Remove duplicate points
    return this.segments.flatMap { listOf(it.a, it.b) }
}
