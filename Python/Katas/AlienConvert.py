def convert(st):
    st = list(st)
    for i in range(len(st)):
        if st[i] == 'o':
            st[i] = 'u'
        if st[i] == 'a':
            st[i] = 'o' 
    return "".join(st)

print(convert("hello"))
