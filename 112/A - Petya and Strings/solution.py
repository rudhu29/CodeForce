# Read the two input strings
s1 = input().lower()
s2 = input().lower()
 
# Compare the normalized strings
if s1 < s2:
    print("-1")
elif s1 > s2:
    print("1")
else:
    print("0")