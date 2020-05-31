package geniuscad.primitive.dimension2

import ch.tutteli.atrium.api.fluent.en_GB.isEmpty
import ch.tutteli.atrium.api.fluent.en_GB.toThrow
import ch.tutteli.atrium.api.verbs.expect
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object Circle : Spek({

    describe("A circle") {

        describe("with zero radius") {
            it("should return no segments") {
                expect(createCircle(0.0F)).isEmpty()
            }
        }

        describe("with negative radius") {
            it("should throw exception") {
                expect { createCircle(-1F) }.toThrow<IllegalArgumentException>()
            }
        }

    }

})
