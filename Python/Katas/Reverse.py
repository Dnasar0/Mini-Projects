def reverse(st):
    words = st.split()
    ## reversing the words using reversed() function
    words = list(reversed(words))
    ## joining the words and printing
    return(" ".join(words))

print(reverse("Hello World"))