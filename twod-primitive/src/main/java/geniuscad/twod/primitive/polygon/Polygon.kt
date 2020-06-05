package geniuscad.twod.primitive.polygon

import sun.awt.geom.Curve

/**
 * Polygon is a closed curve with optional holes.
 */
data class Polygon private constructor(
    val curve: Curve,
    val holes: List<Polygon>
) {

    companion object {

        fun fromCurve(curve: Curve): List<Polygon> {
            TODO()
        }

    }

}
