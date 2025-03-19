# Quartz
Quartz scheduling library

# POC - Scheduling Tasks with Quartz
This project is a proof of concept for a Quartz Scheduler with Java scheduling tasks. The initial goal is to work with task scheduling internally in Java, without using external tools. This way, we decouple the need for another structure so that the system can function properly.

## Setup
To run this application locally, will be necessary download Quartz at https://www.quartz-scheduler.org/downloads/, and put in your classpath these libs:

**Install the dependencies:**
  ```bash
  quartz-2.3.0-SNAPSHOT.jar 
  log4j-1.2.16.jar 
  slf4j-log4j12-1.7.7.jar 
  c3p0-0.9.5.2.jar 
  slf4j-api-1.7.7.jar 
  QuartzApp.java
  ```

## Improvements
This is the main function of this library, improvements should be made in the future