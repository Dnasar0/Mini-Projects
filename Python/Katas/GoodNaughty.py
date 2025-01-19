def what_list_am_i_on(actions):
    naughty = 0
    nice = 0
    for action in actions:
        if action[0] == 'b' or action[0] == 'f' or action[0] == 'k':
            naughty = naughty + 1
            return "naughty"
        if action[0] == 'g' or action[0] == 's' or action[0] == 'n':
            nice = nice + 1
            return "nice"
    if naughty == nice:
        return "naughty"
        