package geniuscad.twod.primitive.face

import geniuscad.twod.primitive.curve.Curve
import geniuscad.twod.primitive.point.Point

/**
 * Face is a closed set of line segments without intersections.
 * Primitive face is a triangle.
 */
data class Face private constructor(
    val points: List<Point>
) {

    companion object {

        fun fromCurve(curve: Curve): List<Face> {
            //TODO Check curve is closed
            //TODO Split closed curve into pieces by intersections
            return listOf(Face(curve.points))
        }

    }

}
