package geniuscad.primitive.dimension2

import kotlin.math.nextUp
import kotlin.math.roundToInt

fun createCircle(radius: Double, minimumAngleBetweenNeighbourSegments: Double = 170.0): Curve {
    require(radius >= 0) { "Radius should be positive value" }
    if (radius == 0.0) {
        return emptyList()
    }
    require(minimumAngleBetweenNeighbourSegments > 0) { "Minimum angle between neighbour segments should be positive" }
    require(minimumAngleBetweenNeighbourSegments < 180) { "Minimum angle between neighbour segments should be less that 180" }
    val circleSegmentRawAngle = 180 - minimumAngleBetweenNeighbourSegments
    val segmentsCount = (360 / circleSegmentRawAngle).nextUp().roundToInt()
    val circleSegmentAngle = 360.0 / segmentsCount
    return (0 until segmentsCount)
        .map { segmentIndex ->
            LineSegment(
                Point(0.0, 0.0).moveTo(segmentIndex * circleSegmentAngle, radius),
                Point(0.0, 0.0).moveTo((segmentIndex + 1) * circleSegmentAngle, radius)
            )
        }
}
