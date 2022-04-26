# Techgig-Code Gladiators 2021

#### Virus Outbreak

*[VirusOutbreak.java](./VirusOutbreak.java)*

```
In the Martian land faraway, a new virus has evolved and is attacking the individuals at a fast pace. The scientists have figured out the virus composition, V.
The big task is to identify the people who are infected. The sample of N people is taken to check if they are POSITIVE or NEGATIVE. A report is generated which 
provides the current blood composition B of the person. 

POSITIVE or NEGATIVE ?
If the blood composition of the person is a subsequence of the virus composition V, then the person is identified as POSITIVE otherwise NEGATIVE.

Example:
Virus Composition, V = coronavirus
Blood Composition of the person , B = ravus
The person in question is POSITIVE as B is the subsequence of the V. 

The scientists are busy with their research for medicine and request you to build a program which can quickly figure out if the person is POSITIVE or NEGATIVE. 
They will provide you with the virus composition V and all the people’s current blood composition. Can you help them?
Note: The virus and blood compositions are lowercase alphabet strings.

Input Format
The first line of the input consists of the virus composition, V
The second line of he input consists of the number of people, N
Next N lines each consist of the blood composition of the ith person, Bi

Constraints
1<= N <=10
1<= |B|<= |V|<= 10^5

Output Format
For each person, print POSITIVE or NEGATIVE in a separate line

Sample TestCase 1
Input
coronavirus
3
abcde
crnas
onarous
Output
NEGATIVE
POSITIVE
NEGATIVE
```

#### Prime Game

*[PrimeGame.java](./PrimeGame.java)*

```
Rax, a school student, was bored at home in the pandemic. He wanted to play but there was no one to play with. He was doing some mathematics questions including 
prime numbers and thought of creating a game using the same. After a few days of work, he was ready with his game. He wants to play the game with you.

GAME:
Rax will randomly provide you a range [ L , R ] (both inclusive) and you have to tell him the maximum difference between the prime numbers in the given range. 
There are three answers possible for the given range.
 - There are two distinct prime numbers in the given range so the maximum difference can be found.
 - There is only one distinct prime number in the given range. The maximum difference in this case would be 0.
 - There are no prime numbers in the given range. The output for this case would be -1.

To win the game, the participant should answer the prime difference correctly for the given range.

Example:
Range: [ 1, 10 ]
The maximum difference between the prime numbers in the given range is 5.
Difference = 7 - 2 = 5

Range: [ 5, 5 ]
There is only one distinct prime number so the maximum difference would be 0.

Range: [ 8 , 10 ]
There is no prime number in the given range so the output for the given range would be -1.

Can you win the game?

Input Format
The first line of input consists of the number of test cases, T
Next T lines each consists of two space-separated integers, L and R

Constraints
1<= T <=10
2<= L<= R<=10^6

Output Format
For each test case, print the maximum difference in the given range in a separate line. 

Sample TestCase 1
Input
5
5 5
2 7
8 10
10 20
4 5

Output
0
5
-1
8
0
```
