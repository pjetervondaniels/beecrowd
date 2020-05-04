playedHours = int(input())
hours = playedHours / 3600;
minutes = (playedHours - (hours * 60 * 60)) / 60;
seconds = playedHours - (hours * 3600) - (minutes * 60);

print("{}:{}:{}".format(hours , minutes, seconds))
