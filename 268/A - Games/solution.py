import sys
 
def solve():
    input = sys.stdin.read
    data = input().split()
    if not data:
        return
 
    n = int(data[0])
    h = []
    a = []
    
    idx = 1
    for _ in range(n):
        h.append(int(data[idx]))
        a.append(int(data[idx + 1]))
        idx += 2
 
    matches = 0
    for i in range(n):
        for j in range(n):
            if i != j and h[i] == a[j]:
                matches += 1
 
    print(matches)
 
if __name__ == "__main__":
    solve()