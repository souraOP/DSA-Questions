def WordCount(search_word):
    f = open("your-filepath/"your-textfile".txt", 'r')
    count = 0
    s = f.read()
    x = s.split()
    for i in x:
        if i == search_word:
            count +=1
    print("The word is " + str(count)+ " times")


search_word = input("Enter the word: ")
WordCount(search_word)
