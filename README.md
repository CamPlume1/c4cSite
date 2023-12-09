# Your Project Name

This is my submission for the C4C take home project!! I hope you enjoy.

## Table of Contents

- [High Level Design](#high-level-design)
- [Prerequisites](#prerequisites)
- [Building the Application](#building-the-application)
- [Next Steps And Things I Should Have Done Differently](#next-steps-and-things-i-should-have-done-differently)
- [Thank You](#thank-you)

## High Level design
This is my first real foray into web development. Therefore, I am absolutely certain I have made some borderline ridiculous design decisions in this project. I am going to attempt to justify them here.

### Frontend
The frontend for my program is built in HTML and CSS, with embedded JavaScript for backend API calls.

### Backend
I wrote the backend in Java, using the Spring Boot framework

### Extra Features
I added a feature allowing users to set their username, and posts tag the name of the user who posted

I added the ability for users to like posts

I added the ability for the user to sort posts by popularity as well as the time they were posted

I hosted my project at: 

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed (version 19 or higher)
- Gradle installed (for building the project)

## Building the Application

To build the application, follow these steps:

### Deploying the backend

1. Clone the following repository:

   ```bash
   git clone https://https://github.com/CamPlume1/c4cSite-backend

2. Navigate to the root directory

3. Run the following command in the terminal:

   ```bash
   ./gradlew clean build
   
4. Navigate to the build/libs directory within the project. There will be a jar file in this directory

5. Run the following command in the terminal:

   ```bash
   java -jar {name-of-jar-file}


### Deploying the frontend

1. Clone the following repository:

   ```bash
   git clone https://https://github.com/CamPlume1/c4cSite-frontend
   
2. open the following file in a web browser of your choice: **base5.html**


## Next Steps And Things I Should Have Done Differently
   
At a high level, the best way to design this program would have been a React.js frontend paired with a SQLite backend. Unfortunately, I have no experience with JavaScript or real DB work, and developer accessibility is important!! I didn't want to try too many new things at once, instead prioritizing the creation of an MVP.

That being said, here's a list of improvements, and how I plan to implement them.

- State persistence: Using the Spring JDBC or JPA framework, I intend to move most of the logic of my program to a database
- I intend to add a "create account" option in the landing page, allowing users to set passwords. I'll store these in a key-value database for real logins
- I intend to update my API to use session cookies to determine user, instead of usernames which is obviously easily hackable
- I intend to limit each user to liking a post only once

## Thank You

I do plan to continue to work on this project, as I feel like I learned really a lot in the time I worked on it. I'll make sure to do it in a separate branch so you folks can grade what's here!

Whether there's next steps or not, I really enjoyed getting to dive into this project. I learned a lot, and if nothing else I've got a project to add to my resume :).

I appreciate everything you folks do on campus and in the greater boston community and would be stoked for an opportunity to join your team.

