word = "VENTURES"

def twoLettersInEachLine(word):
    count = 1
    result = ""
    for i in range(len(word)):
        result += word[i]
        if (count % 2 == 0):
            result += '\n'
        count += 1
    return result


print(twoLettersInEachLine(word))
