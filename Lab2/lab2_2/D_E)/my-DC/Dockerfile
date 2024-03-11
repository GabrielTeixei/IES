# Use the official Tomcat image as the base image
FROM tomcat:latest

# Remove the default ROOT application
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copy the .war file from the local target folder to the Tomcat webapps folder
COPY ./target/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080
EXPOSE 8080

# Start Tomcat when the container starts
CMD ["catalina.sh", "run"]
