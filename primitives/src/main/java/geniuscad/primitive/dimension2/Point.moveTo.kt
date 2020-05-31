package geniuscad.primitive.dimension2

import kotlin.math.cos
import kotlin.math.sin

fun Point.moveTo(angle: Double, distance: Double): Point =
    this.copy(
        x = this.x + distance * cos(angle),
        y = this.y + distance * sin(angle)
    )
