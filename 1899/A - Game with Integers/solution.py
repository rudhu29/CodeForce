import sys
 
def main():
    input = sys.stdin.read
    data = input().split()
    t = int(data[0])
    results = []
    
    for i in range(1, t + 1):
        n = int(data[i])
        if n % 3 != 0:
            results.append("First")
        else:
            results.append("Second")
            
    print('
'.join(results))
 
if __name__ == '__main__':
    main()