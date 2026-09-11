import sys
 
 
def solve():
    input_data = sys.stdin.read().split()
    if not input_data:
        return
 
    t = int(input_data[0])
    results = []
 
    for i in range(1, t + 1):
        n_str = input_data[i]
        round_numbers = []
        length = len(n_str)
 
        for idx, ch in enumerate(n_str):
            if ch != "0":
                # Calculate the place value (e.g., '5' in '5009' has power 10^3)
                power_of_ten = 10 ** (length - 1 - idx)
                round_numbers.append(str(int(ch) * power_of_ten))
 
        results.append(str(len(round_numbers)))
        results.append(" ".join(round_numbers))
 
    print("
".join(results))
 
 
if __name__ == "__main__":
    solve()