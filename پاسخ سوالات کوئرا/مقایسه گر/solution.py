def compare(string1, string2):
  while (len(string1) >=1 and len(string2) >=1):
    if (string1[0] > string2[0]):
      string2 = string2[1:]

      string2 = string2[::-1]
      string1 = string1[::-1]
    elif (string2[0] > string1[0]):
      string1 = string1[1:]

      string2 = string2[::-1]
      string1 = string1[::-1]
    else:
      string2 = string2[1:]
      string1 = string1[1:]
      
      string2 = string2[::-1]
      string1 = string1[::-1]

  if (len(string1) == 0 and len(string2) == 0):
    return "Both strings are empty!"
  elif (len(string1) == 0):
    return string2[::-1]
  else:
    return string1[::-1]