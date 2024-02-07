package geniuscad.twod.primitive.polygon

import geniuscad.twod.primitive.curve.Curve
import geniuscad.twod.primitive.face.Face

/**
 * Polygon is a closed curve with optional holes.
 */
data class Polygon private constructor(
    val face: Face,
    val holes: List<Polygon>
) {

    companion object {

        fun fromCurve(curve: Curve): List<Polygon> {
            TODO()
        }

    }

}
