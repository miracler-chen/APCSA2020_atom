
fin = ""
target = input("Whats your string:")

for i in target:
	if i == i.upper():
		fin += i.lower()

	else:
		fin += i.upper()

print(fin)
