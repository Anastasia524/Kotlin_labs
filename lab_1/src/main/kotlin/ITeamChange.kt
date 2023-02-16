interface ITeamChange {
    val name: String
    val group: MutableList<Team>
    fun sort()
    fun filter()
    fun input(newTeam: Team)
    fun display()
    fun delete(teamToRemove: Team)
}