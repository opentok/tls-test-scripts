var https = require("https");
var req = https.request(
  {
    host: "api.opentok.com",
    port: "443",
    path: "tls-check.json",
    method: "GET",
  },
  function (res) {
    res.on("data", function (data) {
      console.log(
        "Connection successfully established with your current TLS configuration, no further action required."
      );
    });
  }
);
req.end();
req.on("error", function (err) {
  if (err.code == "ECONNRESET") {
    console.log(
      "Failed to connect to OpenTok, please check your system and upgrade your environment as needed."
    );
  } else {
    console.log("Unknown error talking to OpenTok, please try again later.");
  }
});
