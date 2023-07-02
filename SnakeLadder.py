
#Design a mini project to implement Snake and Ladders Game using Python.


import random
#map dictionary with intial digit and final digits betn ladder
ladder ={1:38,4:14,8:30,21:42,26:76,50:67,71:92,80:99}
#map Dictionary with final digit and initial digit betn snake
snake={32:10,34:6,48:26,62:18,88:24,95:56,97:78}

#intiallize player 
pos1=0
pos2=0

#method to move player
def  move(pos):
    #To generate random sequence of Dice 
    dice=random.randint(1,6)
    print(f"Dice: {dice} ")
    pos = pos +dice
    #if player at snake mouth
    if pos in snake:
        print(f"Bitten by Snake ")
        pos=snake[pos]
        print(f"Position: {pos}")
    # if player at ladeer bottom    
    elif pos in ladder:
        print(f"Climbed By Ladder")
        pos=ladder[pos]
        print(f"Position: {pos}")
    #if player at not above position    
    else :
        print(f"Position :{pos}")

    print("\n")
    return pos

while True:
    A=input("Player 1 Enter \"A\" To Throw Dice : ")
    pos1=move(pos1)
    if pos1>=100:
        print("Game over !! \n Player 1 Wins. ")
        break
    B=input("Player 2 Enter \"B\" To Throw Dice : ")
    pos2=move(pos2)
    if pos2>=100:
        print("Game over !! \n Player 2 Wins.")
        break
    
