# A sample KS project: a test script that selects an item out of a custom dropdown list that filters by input text

## What is this?

This is a small Katalon Studio project for demonstration purpose.
This project provides a reference implementation that concerns a topic raised in the Katalon user forum at

- https://forum.katalon.com/t/how-to-select-options-from-custom-dropdown-where-the-options-will-be-filter-as-per-your-input-text/186249

where the original poster asked:

>How to select options from a dropdown that contains dynamic options, and it will be filtered as per your input text

This project provides a set of codes that I made as follows:

1. an HTML that displays a button and a dropdown list: [page.html](https://github.com/kazurayam/KS_dropdown_search_bar/blob/master/page.html)
2. a JavaScript, which the page.html links, that controls the interactions: [script.js](https://github.com/kazurayam/KS_dropdown_search_bar/blob/master/script.js)
3. a Katalon TestCase script that mimics a human operation on the page: [TC1](https://github.com/kazurayam/KS_dropdown_search_bar/blob/master/Scripts/TC1/Script1764999514200.groovy)

I refered to the following article for the HTML and JavaScript code that implements a custom dropdown list with filtering feature:

- https://www.geeksforgeeks.org/bootstrap/how-to-add-dropdown-search-bar-in-bootstrap-5/

## How to run the demonstration

Just run the "Test Cases/TC1"

## How the demo works

1. The TC1 opes the HTML in a browser:


