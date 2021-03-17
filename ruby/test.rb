require "net/https"

begin
  uri = URI("https://api.opentok.com")
  res = Net::HTTP.get(uri)
  puts "Connection successfully established with your current TLS configuration, no further action required."
rescue Errno::ECONNRESET => e
  puts "Failed to connect to OpenTok, please check your system and upgrade your environment as needed."
end
