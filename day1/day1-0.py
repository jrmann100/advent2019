import sys;

def calculateFuel(mass):
    return mass / 3 - 2

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Expected argument filename.")
        quit()
    with open (sys.argv[1]) as f:
        sum = 0
        for line in f.readlines():
            sum += calculateFuel(int(line))
        print("There is a fuel requirement of %d." % sum)
