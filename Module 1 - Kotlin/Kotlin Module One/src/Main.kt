fun main() {
    var alive: Boolean = true
    var userSelection: String = "0"

    while (alive) {
        println("Welcome to easEquations (Kotlin Edition)")
        println("What math would you like to do today? \n0. Quit \n1. 2D Shapes \n2. Basic Functions \n3. 3D Objects")
        userSelection = readln()

        //C# is switch, Kotlin is when
        when (userSelection) {
            "0" -> alive = false

            "1" -> {
                println("2D Shapes")
                shapes2D()
            }

            "2" -> {
                println("Basic Functions")
                basicFunctions()
            }

            "3" -> {
                println("3D Objects")
                objects3D()
            }

        }

    }

}

fun shapes2D(){
    val maths = Mathematics()

    println("What shape do you have? \n 1. Circle (Area or Circumference \n 2. Triangle (Area) \n 3. Trapezoid (Area) \n 4. Rectangle (Area or Perimeter)")
    var userSelection: String = readln()

    when (userSelection){
        "1" -> { //Circle
            println("Would like to solve for \n 1. Area \n 2. Circumference")
            userSelection = readln()

            when (userSelection){
                "1" -> {
                    println("What is the radius? ")
                    val radius: Float = readln().toFloat()

                    val area: Float = maths.circleArea(radius)

                    println("$area units²\n")

                }
                "2" -> {
                    println("What is the diameter? ")
                    val diameter: Float = readln().toFloat()

                    val circum: Float = maths.circleCircumference(diameter)

                    println("$circum units\n")
                }
            }

        }

        "2" -> { //Triangle
            println("What is the base length? ")
            val base: Float = readln().toFloat()
            println("What is the height? ")
            val height: Float = readln().toFloat()

            val triArea: Float = maths.triangleArea(base, height)
            println("$triArea units²\n")
        }

        "3" -> { //Trapezoid
            println("What is the base length? ")
            val base: Float = readln().toFloat()
            println("What is the height? ")
            val height: Float = readln().toFloat()
            println("What is the top length? ")
            val top: Float = readln().toFloat()

            val trapArea: Float = maths.trapezoidArea(base, top, height)
            println("$trapArea units²\n")
        }

        "4" -> { //Rectangle
            println("What is the width? ")
            val width: Float = readln().toFloat()
            println("What is the height? ")
            val height: Float = readln().toFloat()

            println("Would like to solve for \n 1. Area \n 2. Perimeter")
            userSelection = readln()

            when (userSelection){
                "1" -> {
                    val area: Float = maths.rectangleArea(width, height)

                    println("$area units²\n")

                }
                "2" -> {
                    val perim: Float = maths.rectanglePerimeter(width, height)

                    println("$perim units\n")
                }
            }
        }

        else -> return

    }
}

fun basicFunctions() {
    val maths = Mathematics()

    println("Pick a math thing: \n 1. Slope Intercept \n 2. Quadratic Equation \n 3. Percentages ")
    var userSelection: String = readln()

    when (userSelection) {
        "1" -> { //Slope Intercept

        }

        "2" -> { //Quadratic
            println("What is a? (cannot be 0) ")
            val quadA: Float = readln().toFloat()

            println("What is b? (b² ≥ 4ac) ")
            val quadB: Float = readln().toFloat()

            println("What is c? ")
            val quadC: Float = readln().toFloat()

            println("\n(-b ± √b²-4ac) / 2a")
            println("(-$quadB ± √$quadB²-4($quadA)($quadC)) / 2($quadA)")

            val x1: Float = maths.QUADRATIC(quadA, quadB, quadC, true)
            val x2: Float = maths.QUADRATIC(quadA, quadB, quadC, false)

            println("x= $x1, $x2\n")
        }

        "3" -> { //Percentages

        }

        else -> return
    }
}

fun objects3D() {
    val maths = CubicMath()

    println("What shape do you have? \n 1. Box \n 2. Sphere \n 3. Cone \n 4. Cylinder \n 5. Square Pyramid")
    var userSelection: String = readln()

    when (userSelection) {
        "1" -> { //Box
            println("Would like to solve for \n 1. Area \n 2. Surface Area")
            userSelection = readln()

            println("What is the width? ")
            val width: Float = readln().toFloat()

            println("What is the height? ")
            val height: Float = readln().toFloat()

            println("What is the length? ")
            val length: Float = readln().toFloat()

            when (userSelection){
                "1" -> {
                    val area: Float = maths.boxVolume(width, height, length)

                    println("$area units³\n")
                }
                "2" -> {
                    val surfaceArea: Float = maths.boxSurfaceArea(width, height, length)

                    println("$surfaceArea units²\n")
                }
            }
        }

        "2" -> { //Sphere
            println("Would like to solve for \n 1. Area \n 2. Surface Area")
            userSelection = readln()

            println("What is the radius? ")
            val radius: Float = readln().toFloat()

            when (userSelection){
                "1" -> {
                    val area: Float = maths.sphereVolume(radius)

                    println("$area units³\n")

                }
                "2" -> {
                    val surfaceArea: Float = maths.sphereSurfaceArea(radius)

                    println("$surfaceArea units²\n")
                }
            }

        }

        else -> return
    }
}