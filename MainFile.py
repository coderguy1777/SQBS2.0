import csv
# Match data sorter for backing up previous match scores from Charter Challenge
# By Jordan Hill

# Opens file data
filename = "Match"
fileopener = open(filename, 'r')

# Reads file into a list
filedata = []
with fileopener as file:
    for lines in file:
        filedata.append(lines.strip('\n'))

# Reads for the team data
team1 = {}
team2 = {}
temp = []
temp2 = []
for value in filedata:
    if value.isdigit() or value.isdigit() < 0:
        temp2.append(value)
    else:
        temp.append(value)
print(temp)
for i in temp:
    if i != -1:
        pass
    else:
        temp.pop(i)

temp.sort()
print(temp)

# Removes spam values from the temporary list
count = 0
for i in temp:
    if temp.pop(count) == '-1':
        temp.pop(count)
    elif temp.pop(count) != '-1':
        temp.append(temp.pop(count + 1))
# prints the new sorted list
temp.sort()

# gets the scores from the temp lists
count1 =0
testli = []
for i1 in temp:
    testli.append(temp.pop(count1))
    if count1 < len(testli):
        pass
teamli1 = []
teamli2 = []

# Sorts the strings of the game in lists
for (i, x) in enumerate(temp):
    try:
        if i == 0:
            pass
        else:
            teamli1.append(x)
    except KeyError:
        pass

# Does the final sorting of the team names and members
xx = [teamli1[1::2]]
xx2 = [teamli1[0::2]]
li1 = []
li2 = []
for i in xx:
    li1.append(i)
for i2 in xx2:
    li2.append(i2)

# Final sorting to a csv file
finalli1 = []
finalli2 = []
for parsevar in li1:
    for ixxx in parsevar:
        finalli1.append(ixxx)

# Writes the resulting data to a csv file
with open("MatchData.csv", 'w') as f:
    rowvar = csv.writer(f, delimiter='\n')
    rowvar.writerow(finalli1)