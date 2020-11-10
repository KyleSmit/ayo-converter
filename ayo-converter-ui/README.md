# Ayo-converter
Converter API

### BUILD DOCKER IMAGE
`
docker build -t ayoconverter-ui:v1 .
`

### RUN DOCKER IMAGE
**Interactive mode:** 

`
docker run --rm -it -p 4200:80 --name ayoconverter ayoconverter-ui:v1
`

**Detached mode:**

`
docker run --rm -d -p 4200:4200 --name ayoconverter ayoconverter-ui:v1
`
