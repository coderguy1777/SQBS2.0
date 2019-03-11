import csv
class MatchDataParser:
    def __init__(self, filename, divisions, teamsperdiv):
        self.filename = filename
        self.divisions = divisions
        self.teamsperdiv = teamsperdiv
        self.teamnames = []
        self.divisiondictionary = {}
        self.teamdictionary = {}
        self.players = []

    def parser(self):
        templist = []

        # Parses the SQBS data file for the tournament
        with open(self.filename, 'r') as matchresults:
            for lines in matchresults:
                templist.append(lines.strip('\n'))
                # Checks for upper case letters for the team name in this case.
                if lines.startswith('T'):
                    self.teamnames.append(lines.strip('\n'))
                else:
                    pass

                # Checks for lowercase letters for the player names of each team.
                if lines.islower():
                    self.players.append(lines.strip('\n'))
                else:
                    pass

        # Useful for debugging the program.
        for x in self.teamnames:
            print(x)
        print('\n')
        for u in self.players:
            print(u)
        halfedlist = len(self.players)//2
        # Divides the players in half for proper teams in the
        # Parsed list in this case mainly.
        teamaplayers = [self.players[:halfedlist]]
        teambplayers = [self.players[halfedlist:]]

        # Final Sorting of teams into lists, with below
        # being the declaration of names for each team,
        # and the proper writing of those teams to the
        # right csv files for each individual team.
        # ------------------------------------------------------------------------------------------------
        # Separation of players to proper teams before final
        # sort in this case
        teamli1 = []
        teamli2 = []

        for i in teamaplayers:
            teamli1.append(self.teamnames[0])
            for x in i:
                teamli1.append(x)

        for z in teambplayers:
            teamli2.append(self.teamnames[1])
            for y in z:
                teamli2.append(y)

        # Writing of data to outputted .csv files
        # of eachs teams score and player data as well
        # and will eventually do this dynamically for x
        # number of divisions in a tournament in this case.
        with open(self.teamnames[0] + ".csv", 'w') as team1:
            rows = csv.writer(team1, delimiter='\n')
            rows.writerow(teamli1)
        with open(self.teamnames[1] + ".csv", 'w') as team2:
            rows2 = csv.writer(team2, delimiter='\n')
            rows2.writerow(teamli2)

        return templist