package geniuscad.twod.shape.circle

import ch.tutteli.atrium.api.fluent.en_GB.isEmpty
import ch.tutteli.atrium.api.fluent.en_GB.isGreaterThanOrEqual
import ch.tutteli.atrium.api.fluent.en_GB.isSameAs
import ch.tutteli.atrium.api.fluent.en_GB.size
import ch.tutteli.atrium.api.fluent.en_GB.toBeWithErrorTolerance
import ch.tutteli.atrium.api.fluent.en_GB.toThrow
import ch.tutteli.atrium.api.verbs.expect
import geniuscad.twod.primitive.Point
import geniuscad.twod.primitive.distanceTo
import geniuscad.twod.primitive.getAllPoints
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object Circle : Spek({

    describe("A circle") {

        describe("with zero radius") {
            it("should return no segments") {
                expect(createCircle(radius = 0.0)).isEmpty()
            }
        }

        describe("with negative radius") {
            it("should throw exception") {
                expect { createCircle(radius = -1.0) }.toThrow<IllegalArgumentException>()
            }
        }

        it("with rude approximation should have at least three segments because its triangle") {
            val circle = createCircle(
                    radius = 1.0,
                    minimumAngleBetweenNeighbourSegments = 59.0
            )
            expect(circle).size.isSameAs(3)
        }

        it("should have segment points with distance from center equals radius") {
            val center = Point(0.0, 0.0)
            val radius = 123.456
            val circle = createCircle(radius = radius)
            circle.getAllPoints()
                .map { center.distanceTo(it) }
                .forEach { expect(it).toBeWithErrorTolerance(radius, 0.0000000000001) }
        }

        describe("with regular radius and default approximation") {
            it("should have at least three segments") {
                val circle = createCircle(radius = 1.0)
                expect(circle).size.isGreaterThanOrEqual(3)
            }
        }

    }

})
