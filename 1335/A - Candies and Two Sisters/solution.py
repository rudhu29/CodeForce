import sys
 
def solve():
    # Read all input from standard input
    input_data = sys.stdin.read().split()
    if not input_data:
        return
    
    t = int(input_data[0])
    
    # Process each test case
    for i in range(1, t + 1):
        n = int(input_data[i])
        print((n - 1) // 2)
 
if __name__ == '__main__':
    solve()