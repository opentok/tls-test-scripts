using System;
using System.Net;

namespace dotnet
{
    class Program
   {
       static void Main(string[] args)
       {
           WebRequest request = WebRequest.Create(
             "https://preview.opentok.com/tls-check.json");
           try
           {
               request.GetResponse();
               Console.WriteLine("Connection successfully established with your current TLS configuration, no further action required.");
           }
           catch (WebException e)
           {
               Console.WriteLine("Failed to connect to OpenTok, please check your system and upgrade your environment as needed.");
           }
       }
   }
}
