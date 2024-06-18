# Techgig-Code Gladiators 2024

### Open Problem 1: Long Distance

*[LongDistance.java](./LongDistance.java)*

```
Paul and Nina are studying in different cities. It’s been a long time since they last met. They make plans to meet but something happens and the plan is postponed. This time they both are adamant and decide on a popular cafe to meet which is at a distance of P km from Paul’s place and N km from Nina’s place.
Both of them start their journey in their respective vehicles. Paul drives his vehicle at a constant speed of X km/hr and Nina drives at a constant speed of Y km/hr. It is a long journey and the road is not appropriate which results in causing troubles for both of them with none or several punctures. The time required for the repair is exactly 1 hour.

Your task is to determine who among them reached the meeting point first and the time taken by that individual.
There are 3 possible cases which can occur:
1. Paul reaches first.
2. Nina reaches first.
3. Both of them reach at the same time.

Input Format
The first line of input consists of an integer, T, number of test cases.
The first line of each test case consists of three space-separated integers, P, X and R1 representing the distance between meeting point and Paul’s place, constant speed of Paul’s vehicle and the number of repairs required by Paul.
The second line of each test case consists of three space-separated integers, N, Y and R2 representing the distance between meeting point and Nina’s place, constant speed of Nina’s vehicle and the number of repairs required by Nina.

Constraints
1<= T <=10
1<= P, N <=10^4
1<= X, Y <=10^4
0<= R1, R2 <=100

Output Format
There are 3 possible scenarios:
1. PAUL reaches first.
First line of output should print, “PAUL”. Second line of output should print the time taken by him to reach the meeting point.
2. NINA reaches first.
First line of output should print, “NINA”. Second line of output should print the time taken by her to reach the meeting point.
3. BOTH of them reach at the same time.
First line of output should print, “BOTH”. Second line of output should print the time taken by any of them to reach the meeting point.

Note: The time taken should be printed in hours as an integer.

Sample TestCase 1
Input
2
15 5 1
20 10 2
100 50 2
50 10 1
Output
BOTH
4
PAUL
4
Explanation

Test Case 1:
Time taken by PAUL is 4 hours.
Time taken by NINA is 4 hrs.

Both of them reach the meeting point at the same time.

Test Case 2:
Time taken by PAUL is 4 hours.
Time taken by NINA is 6 hrs.

PAUL reaches the meeting point first in 4 hours. 
```

### Open Problem 2: Optimizing Competition

*[OptimizingCompetition.java](./OptimizingCompetition.java)*

```
A thrilling boat competition is on the horizon, and N enthusiastic participants are eager to team up and participate. Each participant has a weight, represented by Wi. However, there is a catch - the competition only allows teams consisting of two participants. As an organizer, you want to ensure fairness by allowing only teams with the same total weight.

For instance, if there are K teams, each comprising participants (a1, b1), (a2, b2), ..., (ak, bk), where ai is the weight of the first participant in the i-th team, and bi is the weight of the second participant in the i-th team, a key condition needs to be satisfied: a1 + b1 = a2 + b2 = ... = ak + bk = s, where s is the common total weight of each team.

Your challenge is to find an optimal value for s such that the maximum possible number of teams can be formed. It is important to note that each participant can only be part of one team.

Input Format
The first line contains an integer N, the number of participants.
The second line contains N space-separated integers W1, W2, ..., WN, where wi represents the weight of the i-th participant.

Constraints
1 ≤ N ≤ 50
1 ≤ Wi ≤ N

Output Format
Print the maximum number of teams that can be formed with the optimal total weight s.

Sample TestCase 1
Input
6
1 1 3 4 2 2
Output
2
Explanation
There are two possible cases:
Case 1: The value of s = 3
Two teams can be formed (1, 2) and (1, 2).

Case 2: The value of s = 4
Two teams can be formed (1, 3) and (2, 2).

In any case, the maximum number of valid teams formed are 2.
```