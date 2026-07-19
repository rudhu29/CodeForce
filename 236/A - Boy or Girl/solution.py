# Read the username from standard input
username = input()
 
# Calculate the number of distinct characters
distinct_chars = set(username)
 
# Determine the gender based on the parity of the distinct count
if len(distinct_chars) % 2 == 0:
    print("CHAT WITH HER!")
else:
    print("IGNORE HIM!")