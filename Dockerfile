FROM tomcat:8-jre8-slim

COPY target/*.war usr/local/tomcat/webapps

EXPOSE 8080
