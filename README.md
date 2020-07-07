# CECS-277-LAB-4-Vending-Machine
CECS 277
LAB ASSIGNMENT 4
Assigned date: Monnday 9/23
Due date: Monday 9/30
40 points

Objectives

    Learn how to approach the design of an object oriented program in systematic manner
    Implement the factor pattern design

Prelab

    Read chapter 12 -Object-Oriented Design

Problem

Write a program that simulates a vending machine. Products can be purchased by inserting coins with a value at least equal to the cost of the product. A user select a product from a list of available products, add coins, and either gets the products or gets the coins returned. The coins are returned if insufficient money was supplied or if the product it's sold out. The machine does not give change if too much money was added. Products can be restocked and money remove by an operator. Your solution should include a class VendingMachine that is not coupled with the Scanner or PrintStream classes.

Sample output

S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
a
Description:
Cookie
Price:
1.50
Quantity:
3

S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
A
Description:
Candy
Price:
1.25
Quantity:
2

S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
S
Cookie @ $1.50
Candy @ $1.25

S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
b
A) Cookie @ $1.50
B) Candy @ $1.25
a
Insufficient money

S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
i
A) nickel @ 0.05
B) dime @ 0.1
C) quarter @ 0.25
D) dollar @ 1.0
d

S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
i
A) nickel @ 0.05
B) dime @ 0.1
C) quarter @ 0.25
D) dollar @ 1.0
d

S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
b
A) Cookie @ $1.500
B) Candy @ $1.25
a

Purchased: Cookie @ $1.50
Your change: $0.50
S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
s

Cookie @ $1.50
Candy @ $1.25
S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
b

A) Cookie @ $1.50
B) Candy @ $1.25
b

Insufficient money
S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
i

A) nickel @ 0.05
B) dime @ 0.1
C) quarter @ 0.25
D) dollar @ 1.0
d

S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
i
A) nickel @ 0.05
B) dime @ 0.1
C) quarter @ 0.25
D) dollar @ 1.0
c

S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
b
A) Cookie @ $1.50
B) Candy @ $1.25
b

Purchased: Candy @ $1.25
S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit
r

Removed: $2.75
