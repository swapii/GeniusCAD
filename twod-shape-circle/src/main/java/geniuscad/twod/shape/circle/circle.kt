package geniuscad.twod.shape.circle

import geniuscad.twod.primitive.curve.Curve
import geniuscad.twod.primitive.point.Point
import geniuscad.twod.primitive.point.moveTo
import kotlin.math.PI
import kotlin.math.nextUp
import kotlin.math.roundToInt

fun createCircle(radius: Double, minimumAngleBetweenNeighbourSegments: Double = PI * 0.95): Curve {
    require(radius > 0) { "Radius should be positive value (excluding zero)" }
    require(minimumAngleBetweenNeighbourSegments > 0) { "Minimum angle between neighbour segments should be positive" }
    require(minimumAngleBetweenNeighbourSegments < 180) { "Minimum angle between neighbour segments should be less that 180" }
    val circleSegmentRawAngle = PI - minimumAngleBetweenNeighbourSegments
    val segmentsCount = (2 * PI / circleSegmentRawAngle).nextUp().roundToInt()
    val circleSegmentAngle = 2 * PI / segmentsCount
    return (0..segmentsCount)
        .map { segmentIndex ->
            Point(0.0, 0.0)
                .moveTo(segmentIndex * circleSegmentAngle, radius)
        }
        .toList()
        .let { Curve(it) }
}
