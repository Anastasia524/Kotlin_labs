class TeamChange constructor(_name: String): ITeamChange{
    override val name: String = _name
    override val group: MutableList<Team> = mutableListOf()

    override fun sort(){
        println("Сортированный массив (по возрасту)")
        val sortedList = group.sortedWith(compareBy<Team>{it.age})
        displayCustomList(sortedList as MutableList<Team>)
    }

    override fun filter(){
        val filteredList = group.filter { it.age > 20}
        if (filteredList.isNotEmpty()){
            println("Спортсмены, возраст которых больше 20 лет:")
            displayCustomList(filteredList as MutableList<Team>)
        }
        else
            println("Таких спортсменов нет в списке")
    }

    override fun display(){
        println("Полный список группы '$name'")
        group.forEach { it.show() }
    }

    private fun displayCustomList(list: MutableList<Team>){
        list.forEach<Team>{ it.show()}
    }

    override fun input(newTeam: Team){
        group.add(newTeam)
    }

    override fun delete(teamToRemove: Team) {
        group.removeIf{ it.id == teamToRemove.id}
    }
}