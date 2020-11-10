# Ayo-converter
Converter API

### BUILD DOCKER IMAGE
`
docker build -t ayoconverter:v1 .
`

### RUN DOCKER IMAGE
**Interactive mode:** 

`
docker run --rm -it -p 8080:8080 --name ayoconverter ayoconverter:v1
`

**Detached mode:**

`
docker run --rm -d -p 8080:8080 --name ayoconverter ayoconverter:v1
`
