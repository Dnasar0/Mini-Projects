def add(s1, s2):
    s1 = s1.encode("ascii")
    s2 = s2.encode("ascii")
    s1 = sum(s1)
    s2 = sum(s2)
    return s1+s2

print(add('a', 'b'))