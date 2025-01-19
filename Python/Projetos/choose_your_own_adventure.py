user_name = input("Type your name: ")
print(f"Welcome {user_name} to this adventure!")

user_answer = input("You are on a dirt road, it has come to an end and you can go left or right. Which way do you like to go? ").lower()

if user_answer == "left":
    user_answer = input("You come to a river, you can walk around it or swim across. Type in (walk) to walk around or (swim) to swim across: ").lower()

    if user_answer == "walk":
        print("You walked for many miles, ran out of water and died of starvation. Game ended")
    elif user_answer == "swim":
        print("You swam across and were eaten by an alligator. Game ended.")
    else:
        print("Not a valid option! Game ended.")
        quit()       
    
elif user_answer == "right":
    user_answer = input("You come to a bridge. It looks wobbly, do you want to cross it or head back (cross/back) ").lower()

    if user_answer == "back":
        print("You go back to the main road, but you get ran over. Game ended")
    elif user_answer == "cross":
        user_answer = input("You crossed the bridge and you meet a stranger. Do you talk to them? (yes/no) ").lower()
        
        if user_answer == "yes":
            print("You talk to the stranger. They give you a lot of gold! Game won!")
    
        elif user_answer == "no":
            print("The stranger gets offended and kills you. Game ended")
        else:
            print("Not a valid option! Game ended.") 
            quit()

    else:
        print("Not a valid option! Game ended.")  
        quit() 
            
else:
    print("Not a valid option! Game ended.")
    quit()

print(f"Thank you for trying this game {user_name} :)")

