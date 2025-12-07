# A sample KS project: a test script that selects an item out of a custom dropdown list that filters by input text

## What is this?

This is a small Katalon Studio project for demonstration purpose.
This project provides a reference implementation that concerns a topic raised in the Katalon user forum at

- https://forum.katalon.com/t/how-to-select-options-from-custom-dropdown-where-the-options-will-be-filter-as-per-your-input-text/186249

where the original poster asked:

>How to select options from a dropdown that contains dynamic options, and it will be filtered as per your input text

I made the following codes:

1. an HTML that displays a button and a dropdown list => [page.html](https://github.com/kazurayam/KS_dropdown_search_bar/blob/master/page.html)
2. a JavaScript that controls the interactions on the page => [script.js](https://github.com/kazurayam/KS_dropdown_search_bar/blob/master/script.js)
3. a Katalon TestCase script that mimics a human operation on the page => [TC1](https://github.com/kazurayam/KS_dropdown_search_bar/blob/master/Scripts/TC1/Script1764999514200.groovy)

I refered to the following article for the sample HTML and JavaScript code that implements a custom dropdown list with filtering feature:

- https://www.geeksforgeeks.org/bootstrap/how-to-add-dropdown-search-bar-in-bootstrap-5/

## How to activate the demonstration

In Katalon Studio (any version will do), open [this project](https://github.com/kazurayam/KS_dropdown_search_bar) and just run the "Test Cases/TC1"

## How the demo works

The TC1 opens a browser (Chrome as default) window. In the browser, the `page.html` is displayed.

![1_initial](https://kazurayam.github.io/KS_dropdown_search_bar/images/1_initial.png)

The TC1 mimics human interaction. Firstly, the TC1 clicks the button labeled "Dropdown button". Then a dropdown list will be displayed.

![2_button_was_clicked](https://kazurayam.github.io/KS_dropdown_search_bar/images/2_button_was_clicked.png)

The TC1 types a string "ba" into the text input field. Then the page filters the dropdown list and show the enteries that match with the typed string.

![3_filtering](https://kazurayam.github.io/KS_dropdown_search_bar/images/3_filtering.png)

The TC1 clicks the 1st entry of the list. Effectively, the "banana" will be clicked.

The page acknowledges that human clicked the "banana" entry, and the page shows "Selected Value: banana".

![4_selected](https://kazurayam.github.io/KS_dropdown_search_bar/images/4_selected.png)

The TC1 makes an assertion that the "Selected Value" should be "banana".

![5_asserted](https://kazurayam.github.io/KS_dropdown_search_bar/images/5_asserted.png)

As the screenshot shows, the test passed as expected.

## Conclusion

This sample project demonstrates a HTML page with custom dropdown list that filters items by input text. Also this project shows a sample Test Case scriptipt that can interacte with the page.

Now, this sample solves the problem of the original poster? --- No, it will not. The original poster's target page will be completely different from my sample page. Therefore copy&pasting my sample makes no sense. The original poster has to invent a solution for his/her target web page.

I developed this sample project to show how much of efforts the original poster needs to make.

