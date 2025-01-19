class Dictionary():

    def __init__(self):
        self.dictionary = {}

    def newentry(self, word, definition):
        self.dictionary[word] = definition
        
    def look(self, key):
        if key in self.dictionary:
            return self.dictionary[key]
        else:
            return f"Can't find entry for {key}"

dict = Dictionary()
dict.newentry("Banana", "mmm baana")
dict.look("Banan")