FROM gradle:alpine

USER gradle

# Copy source
RUN mkdir logbook/
ADD --chown=gradle . logbook/ 

# Run the build
WORKDIR /home/gradle/logbook
RUN gradle build

# Start the webserver?
CMD ["gradle", "run"]

