package geniuscad.twod.primitive.polygon

import geniuscad.twod.primitive.face.Face
import sun.awt.geom.Curve

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
