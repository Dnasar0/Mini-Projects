def find_it(seq):
    for n in seq:
        seq.count(n)
        if seq.count(n) % 2 != 0:
            return n

print(find_it([1,2,1]))
