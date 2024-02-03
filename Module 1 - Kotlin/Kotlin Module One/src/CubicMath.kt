import kotlin.math.PI
import kotlin.math.sqrt

class CubicMath: Mathematics() {
    //Box Volume + Surface Area
    fun boxVolume(width: Float, height: Float, length: Float): Float {
        return width * height * length
    }

    fun boxSurfaceArea(width: Float, height: Float, length: Float): Float {
        val wh = rectangleArea(width, height)
        val wl = rectangleArea(width, length)
        val hl = rectangleArea(height, length)

        return 2 * (wh + wl + hl)
    }

    //Sphere Volume + Surface Area
    fun sphereVolume(radius: Float): Float {
        return (4/3) * PI.toFloat() * (radius * radius * radius)
    }

    fun sphereSurfaceArea(radius: Float): Float {
        return 4 * PI.toFloat() * (radius * radius)
    }

    //Cone Volume + Surface Area
    fun coneVolume(radius: Float, height: Float): Float {
        return ((1/3) * PI.toFloat() * (radius * radius)) * height
    }

    fun coneSurfaceArea(radius: Float, height: Float): Float {
        //A = pi r (r+ sqr(h*h + r*r))

        val hSq = height * height
        val rSq = radius * radius

        val theSQR = sqrt(hSq + rSq) as Float
        val piR = PI.toFloat() * radius

        return piR * ((radius) + theSQR)
    }

    //Cylinder Volume + Surface Area
    fun cylinderVolume(radius: Float, height: Float): Float {
        return PI.toFloat() * ((radius * radius) * height)
    }

    fun cylinderSurfaceArea(radius: Float, height: Float): Float {
        val cRsq = radius * radius

        val part1 = 2 * ((PI.toFloat()) * radius * height)
        val part2 = 2 * ((PI.toFloat()) * cRsq)

        return part1 + part2
    }

    //Square Pyramid
    fun pyramidVolume(width: Float, height: Float, length: Float): Float {
        val lw = length * width

        val h3 = height / 3

        return lw * h3
    }

    fun pyramidSurfaceArea(width: Float, height: Float, length: Float): Float {

        //original C# code was provided by Copilot AI. This code here was heavily modified by me.
        val resultPyramidArea: Float = (length * width) +
                (length * sqrt((width / 2) * (width / 2)) + (height * height)) +
                (width * sqrt( (length / 2) * (length / 2)) + (height * height))

        return resultPyramidArea
    }
}