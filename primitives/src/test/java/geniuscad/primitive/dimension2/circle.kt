package geniuscad.primitive.dimension2

import com.winterbe.expekt.should
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object Circle : Spek({

    describe("A circle") {

        describe("with zero size") {
            val circleSegments = createCircle(0.0F)
            it("should return no segments") {
                circleSegments.should.be.empty
            }
        }

    }

})
