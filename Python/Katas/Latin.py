def pig_latin(word):
    if len(word) > 3:
        word = word[1:] + word[0] + "ay"
    return word

print(pig_latin("hello"))