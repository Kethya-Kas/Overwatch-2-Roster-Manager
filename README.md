# Overwatch-2-Roster-Manager

This is a program that creates and manages a roster of Overwatch 2 heroes. Key features include:

- Randomly generate rosters based on three archetypes: Dive, Brawl, and Poke
- Add and remove heroes from rosters
- Print the names of the characters in a roster and their role as well details about each Archetype

## Table of Contents

1. [Installation](#installation)
2. [Usage](#usage)
3. [Future Plans](#future_plans)
4. [Report](#report)

<a name="installation"></a>

## Installation

- Clone this repository: `git clone https://github.com/Kethya-Kas/Overwatch-2-Roster-Manager.git`

<a name="usage"></a>

## Usage

- Open the project in any IDE
- Run the program in the RosterMangerTester class
- You can create a roster through: `OWRoster rosterName = new OWRoster(Archetype.NameOfArchetype);`
  - Archetypes: found in Archetype.java (Enum)
- You can create a Hero through: `Hero heroName = new Hero("name", Role.nameOfRole);`
  - Roles: found in Role.java (Enum)
  - HeroNames: [found here](https://overwatch.blizzard.com/en-us/heroes/)
    - This program does not include Roadhog, Pharah, Junkrat, Venture, and Lifeweaver

<a name="#future_plans"></a>

## Future Plans

- Add Java Documentation
- Refactor code structure into folders/packages
- Give option to create roster without any adhering to the three archetypes
- Implement either console-based experience or GUI with JavaFX
- Give more meaningful Exception messages

<a name = "report"></a>

## Report

- Report link: https://docs.google.com/document/d/1Rt68FyEbdxCqF8_EGBTKEV-4bHcQ6G1PPFdL6f8lGNc/edit?usp=sharing
