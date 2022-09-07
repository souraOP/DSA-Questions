with open("/home/linuxmint/Desktop/MoodleFile2.txt") as file1, open("/home/linuxmint/Desktop/EmptyFile.txt", 'w') as file2:
    data = file1.readlines()
    new_list = []
    count = 0
    for line in data:
        secondFile = line.split()
        new_list = [eval(i) for i in secondFile]
        for i in range(1, len(new_list)):
            count += new_list[i]
        if((count/5) >= 65):
            print(secondFile)
            file2.write(line)
        count = 0
        new_list = []
        
