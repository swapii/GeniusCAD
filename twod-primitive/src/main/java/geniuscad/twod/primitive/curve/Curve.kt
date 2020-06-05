package geniuscad.twod.primitive.curve

import geniuscad.twod.primitive.segment.LineSegment

/**
 * Curve is a undivided line presented by list of line segments.
 */
data class Curve private constructor(
    val segments: List<LineSegment>
) {

    companion object {

        fun fromSegments(segments: List<LineSegment>): List<Curve> {
            //TODO Split curve into undivided groups and return list of curves
            return listOf(Curve(segments))
        }

    }

}
