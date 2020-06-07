package geniuscad.twod.primitive.point

import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

fun Point.moveTo(angle: Double, distance: Double): Point {
    val normalizedAngle = angle % (PI * 2)
    return this.copy(
        x = this.x + distance * cos(normalizedAngle),
        y = this.y + distance * sin(angle)
    )
}
