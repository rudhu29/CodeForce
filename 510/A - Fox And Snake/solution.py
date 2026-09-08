import sys
 
def solve():
    n, m = map(int, sys.stdin.read().split())
    for r in range(1, n + 1):
        if r % 2 == 1:
            print("#" * m)
        elif r % 4 == 2:
            print("." * (m - 1) + "#")
        else:
            print("#" + "." * (m - 1))
 
if __name__ == "__main__":
    solve()