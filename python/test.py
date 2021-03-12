import urllib.request
import urllib.error

try:
    response = urllib.request.urlopen("https://preview.opentok.com/tls-check.json").read()
    print ("Connection successfully established with your current TLS configuration, no further action required")
except urllib.error.URLError:
    print ("Failed to connect to OpenTok, please check your system and upgrade your environment as needed.")
