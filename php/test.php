<?php
$curl = curl_init();
curl_setopt_array($curl, array(
    CURLOPT_RETURNTRANSFER => 1,
    CURLOPT_URL => 'https://preview.opentok.com/tls-check.json',
));
$curlResponse = curl_exec($curl);
if ($curlResponse === false && curl_errno($curl) === 35) {
    echo "Failed to connect to OpenTok, please check your system and upgrade your environment as needed.";
} elseif ($curlResponse === false) {
    echo "Unknown error talking to OpenTok, please try again later.";
} else {
    echo "Connection successfully established with your current TLS configuration, no further action required.";
}
curl_close($curl);
