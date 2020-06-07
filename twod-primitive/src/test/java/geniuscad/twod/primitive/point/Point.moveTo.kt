package geniuscad.twod.primitive.point

import ch.tutteli.atrium.api.fluent.en_GB.toBe
import ch.tutteli.atrium.api.fluent.en_GB.toBeWithErrorTolerance
import ch.tutteli.atrium.api.verbs.expect
import geniuscad.common.DEFAULT_TOLERANCE
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.math.PI

object PointMoveTo : Spek({

    describe("A Point function moveTo") {

        val zeroPoint = Point(0.0, 0.0)

        describe("with zero distance") {
            it("should leave point at same place") {
                expect(zeroPoint.moveTo(0.0, 0.0)).toBe(Point(0.0, 0.0))
            }
        }

        describe("with zero angle") {
            it("should leave point on X axis") {
                val resultingPoint = zeroPoint.moveTo(0.0, 1.0)
                val expectingPoint = Point(1.0, 0.0)
                expect(resultingPoint.equalsWithErrorTolerance(expectingPoint, DEFAULT_TOLERANCE)).toBe(true)
            }
        }

        describe("should move point [0.0, 0.0]") {

            describe("with 45 degree angle") {
                it("to new point with same X and Y coordinates") {
                    val resultPoint = zeroPoint.moveTo(PI / 4, 1.0)
                    expect(resultPoint.x).toBeWithErrorTolerance(resultPoint.y, DEFAULT_TOLERANCE)
                }
            }

            describe("with 90 degree angle") {
                it("should move point to positive Y direction") {
                    val resultingPoint = zeroPoint.moveTo(PI / 2, 1.0)
                    val expectingPoint = Point(0.0, 1.0)
                    expect(resultingPoint.equalsWithErrorTolerance(expectingPoint, DEFAULT_TOLERANCE)).toBe(true)
                }
            }

        }

    }

})
