import urllib.request
import urllib.error

try:
    response = urllib.request.urlopen("https://api.opentok.com").read()
    print ("Connection successfully established with your current TLS configuration, no further action required")
except urllib.error.HTTPError as e:
    if e.code == 404:
        print("Connection successfully established with your current TLS configuration, no further action required")
    else:
        print("An unknown error occurred, but TLS test was successful")
except urllib.error.URLError as e:
    print ("Failed to connect to OpenTok, please check your system and upgrade your environment as needed.")
