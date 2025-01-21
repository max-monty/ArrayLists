# Phonebook Exercise

## Background
A Contact class has been created with instance variables:
- `name`: The contact's name
- `method`: Their preferred contact method (phone, text, social media, etc)
- `handle`: Their contact information for that method (phone number, username, etc)

## Your Task
Create a Phonebook class that stores an ArrayList of Contact objects.

### Class Structure
The Phonebook class:
- Has no constructor
- Contains an ArrayList to store Contact objects

### Required Methods

#### 1. addContact
- Takes a Contact object as parameter
- Adds it to the list of contacts 
- Calls sort() after adding to maintain alphabetical order

#### 2. sort
- Sorts the contact list by name alphabetically (A-Z)
- Note: Since sorting happens after each add, the list will be sorted except for the new entry
- Hint: Use String's compareTo() method for comparing names
  - Returns negative if first string comes before second string
  - Example: "S".compareTo("T") returns -1 since S comes before T
- Consider which sorting algorithm would be most efficient for an almost-sorted list

#### 3. printPhonebook  
- Prints each contact's name to the console
- Useful for debugging your implementation