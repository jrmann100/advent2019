count = 0
for i in range(273025, 767253):
    greater = False
    occs = {0:0,1:0,2:0,3:0,4:0,5:0,6:0,7:0,8:0,9:0}
    for c in range(0, len(str(i))):
        occs[int(str(i)[c])] += 1
    #print(i, occs.values())
    if 2 not in occs.values(): continue
    for c in range(0, len(str(i))):
        for e in range(c + 1, len(str(i))):
            if int(str(i)[c]) > int(str(i)[e]):
                greater= True
                break
            if greater: break
    if greater: continue
    else: count += 1 #; print(i)
print(count)
