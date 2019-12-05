noReps = []
count = 0
for i in range(273025, 767253):
    brea = False
    doubled = False
    for c in range(0, len(str(i)) - 1):
        if str(i)[c] == str(i)[c + 1]:
            doubled = True
            break;
    if not doubled: continue;
    for c in range(0, len(str(i))):
        for e in range(c + 1, len(str(i))):
            #print(i, str(i)[c], str(i)[e])
            if int(str(i)[c]) > int(str(i)[e]):
                #print("DING");
                brea = True
                break
            if brea: break
    if brea: continue
    else: count += 1
print(count)
