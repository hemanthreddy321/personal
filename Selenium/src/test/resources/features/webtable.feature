Feature: Web Table Extraction

  Scenario: Extract data from a web table and save to a CSV file
    Given I have a URL stored in "src/url.txt"
    When I open the webpage
    Then I extract table data from row 3 and column 3
    And I save the extracted data to "src/output.csv"
