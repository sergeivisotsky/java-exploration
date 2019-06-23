# Java security

### Generate TLS certificate
```$xslt
keytool -genkey \
        -alias domain \
        -keyalg RSA \
        -validity 365 \
        -keystore keystore.jks
```