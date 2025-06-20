package org.example.lesson_22

data class MainScreenState(
    private val data: String,
    private val isLoading: Boolean = false
)

class MainScreenViewModel(
    private var mainScreenState: MainScreenState
) {
    fun loadData() {
        println("Данные отсутствуют")
        Thread.sleep(1000)
        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Начало загрузки")
        Thread.sleep(1000)
        mainScreenState = mainScreenState.copy(isLoading = false)
        println("Данные загружены")
    }
}

fun main() {
    val viewModel = MainScreenViewModel(MainScreenState("нет данных"))
    viewModel.loadData()
}