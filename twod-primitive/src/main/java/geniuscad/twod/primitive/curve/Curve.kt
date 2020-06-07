package geniuscad.twod.primitive.curve

import geniuscad.common.DEFAULT_TOLERANCE
import geniuscad.common.elementAtEnd
import geniuscad.twod.primitive.point.Point
import geniuscad.twod.primitive.point.equalsWithErrorTolerance

/**
 * Curve is a undivided line presented by list of points.
 * Closed curve should have first and last equal points.
 * Curve should contain at least two points.
 * Primitive closed curve is triangle.
 */
data class Curve (
    val points: List<Point>
) {

    init {
        require(points.size >= 2) { "Curve should contain at least two points" }
        if (isClosed()) {
            require(points.size >= 4) { "Closed curve should contain at least four points (first and last identically)" }
            val secondPoint = points[1]
            require(points.first() != secondPoint) { "In closed curves first point can't be same as second point" }
            val penultimatePoint = points.elementAtEnd(1)
            require(points.last() != penultimatePoint) { "In closed curves last point can't be same as penultimate point" }
            require(secondPoint != penultimatePoint) { "In closed curves second point can't be same as penultimate point" }
        }
    }

    fun isClosed(): Boolean =
        points.first().equalsWithErrorTolerance(points.last(), DEFAULT_TOLERANCE)

}
