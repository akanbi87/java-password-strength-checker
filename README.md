# Java Password Strength Checker

A command-line tool, written in Java, that rates how strong a password is.

## What it does
Checks 5 rules and gives 1 point for each one passed:
- At least 8 characters
- Has an uppercase letter
- Has a lowercase letter
- Has a digit
- Has a special character

Then it prints the result:
- 0-2 points: Weak
- 3-4 points: Medium
- 5 points: Strong

## How to run
1. Install Java (JDK 17 or newer)
2. Compile: `javac Main.java PasswordChecker.java`
3. Run: `java Main`
4. Type a password when asked

## Example
```
Enter your password: Hello123!
Score: 5
Strength: Strong
```

## What I learned
Classes and objects, methods and return values, loops over strings, and `Character` helper methods.

## Note
For learning only. Don't type your real passwords into any practice tool.
