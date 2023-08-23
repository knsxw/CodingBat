def caught_speeding(speed, is_birthday):
  if is_birthday:
    a = 5
  else:
    a = 0
  if speed <= 60+a:
    return 0
  elif 61+a<=speed<=80+a:
    return 1
  elif speed >=81+a:
    return 2
