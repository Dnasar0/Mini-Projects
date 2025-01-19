def box(n):
    box = [n*'-']
    if n == 1:
        pass
    else:
        for j in range(1,n-1):
            box.append('-' + (n-2)*' ' + '-')
        box.append(n*'-')   
    return box


print(box(5))
