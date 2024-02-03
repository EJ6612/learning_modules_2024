import kotlin.math.sqrt

open class Mathematics {
    //Circle
    fun circleArea (radius: Float): Float {
        return Math.PI.toFloat() * (radius * radius)
    }

    fun circleCircumference (diameter: Float): Float {
        return Math.PI.toFloat() * diameter
    }

    //Triangle
    fun triangleArea (triBase: Float, triHeight: Float): Float {
        return (0.5.toFloat() * triBase) * triHeight
    }

    //Trapezoid
    fun trapezoidArea (trapBase: Float, trapTop: Float, trapHeight: Float): Float {
        return (0.5.toFloat() * (trapBase * trapTop) * trapHeight)
    }

    //Rectangle
    fun rectangleArea(width: Float, height: Float): Float {
        return width * height
    }

    fun rectanglePerimeter(width: Float, height: Float): Float {
        return (width * 2) + (height * 2)
    }

    //Quadratic Formula
    fun QUADRATIC (a: Float, b: Float, c: Float, POS: Boolean): Float {

        val ac4: Float = (4 * a * c)
        val sqRoot: Float = ((b * b) - ac4)
        val a2: Float = (2 * a)

        return if (POS) {
            val topP: Float = (-b + sqrt(sqRoot.toDouble())).toFloat()
            val x1: Float = (topP / a2)
            x1
        }
        else {
            val topB: Float = (-b - sqrt(sqRoot.toDouble())).toFloat()
            val x2: Float = (topB / a2)
            x2
        }
    }

    //Slope Intercept
    fun findYval (m: Float, x: Float, b: Float): Float {
        return ((m * x) + b)
    }

    fun findBval (m: Float, x: Float, y: Float): Float {
        return y - (m * x)
    }

    fun findXval (m: Float, b: Float, y: Float): Float {
        return (y - b) / m
    }

    fun findMvalClassic (x: Float, b: Float, y: Float): Float {
        return (y - b) / x
    }

    fun findMvalPoints (x1: Float, y1: Float, x2: Float, y2: Float): Float {
        return (y2 - y1) / (x2 - x1)
    }

}