import csv
import RunnerFile

filename = "Match"
runnerobj = RunnerFile.MatchDataParser(filename, divisions=2, teamsperdiv=4)
runnerobj.parser()
