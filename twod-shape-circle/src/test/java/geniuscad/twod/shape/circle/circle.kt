package geniuscad.twod.shape.circle

import ch.tutteli.atrium.api.fluent.en_GB.isGreaterThanOrEqual
import ch.tutteli.atrium.api.fluent.en_GB.size
import ch.tutteli.atrium.api.fluent.en_GB.toBe
import ch.tutteli.atrium.api.fluent.en_GB.toBeWithErrorTolerance
import ch.tutteli.atrium.api.fluent.en_GB.toThrow
import ch.tutteli.atrium.api.verbs.expect
import geniuscad.common.DEFAULT_TOLERANCE
import geniuscad.twod.primitive.point.Point
import geniuscad.twod.primitive.point.distanceTo
import geniuscad.twod.primitive.point.equalsWithErrorTolerance
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.math.PI

object Circle : Spek({

    describe("A circle") {

        describe("with zero radius") {
            it("should return no segments") {
                expect { createCircle(radius = 0.0) }.toThrow<IllegalArgumentException>()
            }
        }

        describe("with negative radius") {
            it("should throw exception") {
                expect { createCircle(radius = -1.0) }.toThrow<IllegalArgumentException>()
            }
        }

        it("with rude approximation should have at least three points because its triangle") {
            val circle = createCircle(
                radius = 1.0,
                minimumAngleBetweenNeighbourSegments = PI / 3 - 0.01
            )
            expect(circle.points).size.toBe(4)
            expect(circle.points.first().equalsWithErrorTolerance(circle.points.last(), DEFAULT_TOLERANCE)).toBe(true)
            expect(circle.isClosed()).toBe(true)
        }

        it("should have points with distance from center equals radius") {
            val center = Point(0.0, 0.0)
            val radius = 123.456
            val circle = createCircle(radius = radius)
            circle.points
                .map { center.distanceTo(it) }
                .forEach { expect(it).toBeWithErrorTolerance(radius, DEFAULT_TOLERANCE) }
        }

        describe("with regular radius and default approximation") {
            it("should have at least three points") {
                val circle = createCircle(radius = 1.0)
                expect(circle.points).size.isGreaterThanOrEqual(3)
            }
        }

    }

})
