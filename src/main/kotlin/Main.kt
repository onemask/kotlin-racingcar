import step3.CarsFactory
import step3.Round
import step3.ui.Input
import step3.ui.Output

fun main() {
    val cars = CarsFactory.makeCars()
    val rond = Round(number = Input.getNumberOfRound())
    Output.printResult(cars = cars, round = rond)
}
