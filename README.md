# OpenTok TLS Testing Scripts

[![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-v2.0%20adopted-ff69b4.svg)](CODE_OF_CONDUCT.md)

<img src="https://assets.tokbox.com/img/vonage/Vonage_VideoAPI_black.svg" height="48px" alt="Tokbox is now known as Vonage" />

These scripts allow you to test your environment to make sure that it supports the proper versions of TLS. Vonage and OpenTok services do not allow TLS 1.0 or TLS 1.1, and you can copy these scripts to a development or production machine for testing. None of the applications require any third party dependencies and can be run from the command line.

These scripts handle testing server side connections. OpenTok JS, iOS, Android, Windows, or Linux Client SDKs should fully support TLS v1.2 out of the box. Individual server-side language notes are below, as well as instructions for running each script.

## Running the scripts

### C#

Servers running with .NET v4.0 need to upgrade their .NET version to the 4.5 .NET framework or a more recent version. Please keep in mind that the OpenTok .NET SDK requires .NET Framework 4.5.2 or greater.

NOTE: When using on 4.5.2 TLS 1.2 is not enabled by default. You should use something like the following to force the runtime onto at least TLS 1.2

    ServicePointManager.SecurityProtocol = SecurityProtocolType.Tls12;

Alternatively, if your application is dependant on a different version of TLS for other APIs, you can alternatively add TLS to the list of supported methods with a bitwise OR:

    ServicePointManager.SecurityProtocol |= SecurityProtocolType.Tls12;

To run the sample application:

```console
$ dotnet build
$ dotnet run
```

### Java

Java 8 uses TLSv1.2 as default, and the OpenTok Java SDK only supports Java 8 or higher. If you are using Java 8 and are having TLS issues, you may need to disable older TLS options.

To run the sample application:

```console
$ javac TestTls.java
$ java TestTls
```

### NodeJS

To run the sample application:

```console
$ node test.js
```

### PHP

TLS 1.2 is supported as of PHP 5.6. The OpenTok PHP SDK only supports PHP 7.2 or higher.

To run the sample application:

```console
$ php test.js
```

### Python 3.x

TLS 1.2 is supported in Python 3. The OpenTok Python SDK only supports Python 3.5+.

To run the sample application:

```console
$ python test.py
```

### Ruby

TLS 1.2 is support in Ruby 2.0+. The OpenTok Ruby SDK only supports Ruby 2.1+.

To run the sample application:

```console
$ ruby test.rb
```