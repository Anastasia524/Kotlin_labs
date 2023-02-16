fun main() {
    val team1 = Team(1, "Аргентина", "Пари Сен-Жермен","Лионель Месси",30 , 35, 170, 67)
    val team2 = Team(2, "Португалия", "Ан-Наср","Криштиану Роналду",7 , 38, 185, 85)
    val team3 = Team(3, "Бразилия", "Пари Сен-Жермен","Неймар",10 , 31, 175, 68)
    val team4 = Team(4, "Норвегия", "Манчестер Сити","Эрлинг Холанн",9 , 21, 194, 85)
    val team5 = Team(5, "Англия", "Арсенал","Букайо Сака",7 , 21, 178, 63)
    val team6 = Team(6, "Испания", "Барселона","Гави",6 , 18, 175, 68)
    val team7 = Team(7, "Германия   ", "Байер 04","Флориан Вирц",27 , 19, 176, 70)
    team1.show()

    val groupExample = TeamChange("Основная группа спортсменов")
    groupExample.input(team1)
    groupExample.input(team2)
    groupExample.input(team3)
    groupExample.input(team4)
    groupExample.input(team5)
    groupExample.input(team6)
    groupExample.input(team7)
    groupExample.display()
    groupExample.sort()
    groupExample.filter()


}