# Family Tree Command Line Tool

## Overview

This project is a command line tool for managing a family tree. It allows users to define persons, relationships, and connections between persons in a family. The tool supports dynamic addition of persons and relationships.

## Getting Started

### Prerequisites

- Java Development Kit (JDK 11) installed

### Build and Run

1. Clone the repository:

    ```bash
    git clone https://github.com/uthaya2000/punch-family
    ```

2. Navigate to the project directory:

    ```bash
    cd punch-family
    ```

3. Compile the Java files:

    ```bash
    javac *.java
    ```

4. Run the FamilyTreeApp:

    ```bash
    java FamilyTreeMainApp
    ```
## My Assumption:
- Only the relationships **"son," "daughter," "father," and "wife"** are valid. Any other relationship will result in an error.

## Usage

### Commands

- `family-tree add person <name>`: Adds a person to the family tree.

  Example:
    ```bash
    family-tree add person Uthaya
    ```

  ... (repeat for other persons)

- `family-tree add relationship <relationship>`: Adds a relationship type to the family tree.

  Example:
    ```bash
    family-tree add relationship daughter
    ```

- `family-tree connect <name1> as <relationship> of <name2>`: Connects two persons based on a specified relationship.

  Example:
    ```bash
    family-tree connect Sivakami as wife of Uthaya
    ```

### Queries

- `family-tree count sons of <name>`: Counts the number of sons for a person.

  Example:
    ```bash
    family-tree count sons of Uthaya
    ```

- `family-tree count daughters  of <name>`: Counts the number of daughters for a person.

  Example:
    ```bash
    family-tree count daughters of Uthaya
    ```

- `family-tree count wives of <name>`: Counts the number of wives for a person.

  Example:
    ```bash
    family-tree count wives of Uthaya
    ```

- `family-tree father of <name>`: Returns the father's name for a person.

  Example:
    ```bash
    family-tree father of Priya
    ```

## Sample Inputs

```bash
  family-tree add person Uthaya
  family-tree add person Sivakami
  family-tree add person Ramesh
  family-tree add person Rajesh
  family-tree add person Priya
  family-tree add person Divya
  family-tree add person Andrea
  
  family-tree add relationship son
  family-tree add relationship daughter
  family-tree add relationship wife
  
  family-tree connect Sivakami as wife of Uthaya
  
  family-tree connect Ramesh as son of Uthaya
  family-tree connect Rajesh as son of Uthaya
  
  family-tree connect Priya as daughter of Uthaya
  family-tree connect Divya as daughter of Uthaya
  family-tree connect Andrea as daughter of Uthaya
  
  family-tree countSons of Uthaya
  family-tree countDaughters of Uthaya
  family-tree countWives of Uthaya
  
  family-tree father of Priya
```
## My Inputs and Outputs
```bash
  Enter the Query or type CLOSE to end the program: 
  family-tree add person Uthaya
  Uthaya Person Added
  Enter the Query or type CLOSE to end the program: 
  family-tree add person Sivakami
  Sivakami Person Added
  Enter the Query or type CLOSE to end the program: 
  family-tree add person Ramesh
  Ramesh Person Added
  Enter the Query or type CLOSE to end the program: 
  family-tree add person Rajesh
  Rajesh Person Added
  Enter the Query or type CLOSE to end the program: 
  family-tree add person Priya
  Priya Person Added
  Enter the Query or type CLOSE to end the program: 
  family-tree add person Divya
  Divya Person Added
  Enter the Query or type CLOSE to end the program: 
  family-tree add person Andrea
  Andrea Person Added
  Enter the Query or type CLOSE to end the program: 
  family-tree add relationship son
  son Relation Added
  Enter the Query or type CLOSE to end the program: 
  family-tree add relationship daughte
  daughte Relation Added
  Enter the Query or type CLOSE to end the program: 
  family-tree add relationship daughter
  daughter Relation Added
  Enter the Query or type CLOSE to end the program: 
  family-tree add relationship wife
  wife Relation Added
  Enter the Query or type CLOSE to end the program: 
  family-tree connect Sivakami as wife of Uthaya
  Added Successfully- Sivakami is wife of Uthaya
  Enter the Query or type CLOSE to end the program: 
  family-tree connect Ramesh as son of Uthaya
  Added Successfully- Ramesh is son of Uthaya
  Enter the Query or type CLOSE to end the program: 
  family-tree connect Rajesh as son of Uthaya
  Added Successfully- Rajesh is son of Uthaya
  Enter the Query or type CLOSE to end the program: 
  family-tree connect Priya as daughter of Uthaya
  Added Successfully- Priya is daughter of Uthaya
  Enter the Query or type CLOSE to end the program: 
  family-tree connect Divya as daughter of Uthaya
  Added Successfully- Divya is daughter of Uthaya
  Enter the Query or type CLOSE to end the program: 
  family-tree connect Andrea as daughter of Uthaya
  Added Successfully- Andrea is daughter of Uthaya
  Enter the Query or type CLOSE to end the program: 
  family-tree count sons of Uthaya
  Count of sons: 2
  Enter the Query or type CLOSE to end the program: 
  family-tree count daughters of Uthaya
  Count of daughters: 3
  Enter the Query or type CLOSE to end the program: 
  family-tree count wives of Uthaya
  Count of wives: 1
  Enter the Query or type CLOSE to end the program: 
  family-tree father of Priya
  Father of Priya is Uthaya
  Enter the Query or type CLOSE to end the program: 
  close
```