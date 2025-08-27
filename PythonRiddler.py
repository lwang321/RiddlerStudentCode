import string
f = open("riddler3.txt", "r")
bigstr = list(f.read())
# for i in range(len(bigstr)):
# 	bigstr[i] = int(bigstr[i])

decrypt = []

# for word in bigstr:
# 	word = word.strip(string.punctuation)
# 	for letter in word:
# 		print(ord(letter))
# 		letter = chr(((ord(letter) - 88) % 26) + 97)
# 		decrypt.append(letter)
# 	decrypt.append(" ")

# print ("".join(decrypt))

numchars = 7
counter = 0

letter = []

for num in bigstr:
	letter.append(num)

	if (counter == numchars):
		counter = 0
		# if (int("".join(letter), 2)-64 == 0 or int("".join(letter), 2)-88 == 0 or int("".join(letter), 2)-90 == 0 or int("".join(letter), 2)-90 == 0):
		# 	decrypt.append(" ")
		# else:
		print(int("".join(letter), 2))
		decrypt.append(chr(int("".join(letter), 2)))

		letter = []

	counter += 1

print("".join(decrypt))