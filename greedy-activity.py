Example of greedy algorithm using activity selection problem
'''
You are given n activities with their start and finish times.
Select the maximum number of activities that can be performed by a single person,
assuming that a person can only work on a single activity at a time
'''
def printMaxActivities(s, f):
    n = len(f)
    print("The following activities are selected")
    i = 0
    print(i)
    for j in range(n):
        if s[j] >= f[i]:
            print(j)
            i = j

s = [1, 3, 0, 5, 8, 5]
f = [2, 4, 6, 7, 9, 9]
printMaxActivities(s, f) 
