# Music Practice Tracker

A Java command-line application that allows musicians to log their practice sessions to a CSV file and view summary statistics to track their progress. 

## The Problem

Tracking how much time I spent practicing, what pieces I played, and how often I practiced on the violin and piano is tough to manage in google docs or handwritten notes and hard to analyze overtime. I care about this because consistent practice and small progress is key to mastering any musical instrument and it can be hard to track my habits and practice stats without a structured method. 

## How It Works

The Music Practice Tracker is a terminal-based Java application. When started, it loads the past practice records from the session.csv file using BufferedReader. Next, it prints a display menu with 3 choices . . . the user can either log a practice session, view the summary, or exit the program. Using java.util.Scanner, it grabs the user's choice. When users log a practice session they specify their instrument and practice time in minutes (this input is again saved into a variable using the java.util.Scanner). New practice entries are saved back to the csv file using PrintWriter. 

![System diagram](./System%20Diagram.png)

## Tech Stack

- **Language:** Java
- **Packages & Classes:** java.io, java.util.ArrayList, java.util.Scanner
- **External tools:** None

## Setup

*(Note: These commands will become active once the Java source files are added to the repository once I start working on the coding implementation of the project.)*

Step-by-step: how does someone who just cloned your repo get it
running?

```bash
git clone https://github.com/ritisha-ojha/music-practice-tracker
cd music-practice-tracker
javac *.java
java Main
```

## Usage

How to actually run the thing, with examples.

```bash
java Main
```

*Sample Terminal Interaction:*
```text
Welcome to the Music Practice Tracker!
Display Main Menu:
1. Log Practice
2. View Summary
3. Exit
Enter your choice: 1
Enter instrument: Violin
Enter practice time (minutes): 60
Session saved Successfully!
Display Main Menu:
1. Log Practice
2. View Summary
3. Exit
Enter your choice: 3
Thank you for choosing the Music Practice Tracker!
Happy practicing :)
```

## Roadmap

Features you haven't built yet but plan to.

- [ ] Add focus rating and specific piece titles as features.
- [ ] Let the user look at the list of logs for a specific instrument (violin vs piano)

## Author

Ritisha Ojha, [GitHub Profile](https://github.com/ritisha-ojha)
