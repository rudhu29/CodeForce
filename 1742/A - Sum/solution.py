import sys
 
def solve():
    input = sys.stdin.read
    data = input().split()
    
    if not data:
        return
    
    t = int(data[0])
    idx = 1
    
    results = []
    for _ in range(t):
        a = int(data[idx])
        b = int(data[idx + 1])
        c = int(data[idx + 2])
        idx += 3
        
        if a + b == c or a + c == b or b + c == a:
            results.append("YES")
        else:
            results.append("NO")
            
    print('
'.join(results))
 
if __name__ == '__main__':
    solve()