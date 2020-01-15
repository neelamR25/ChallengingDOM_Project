Feature: OpenApplication
  @test
  Scenario: Validate the landing page
    Given I am on application URL
    Then Verify the web page header
    Then Verify the web page application URL

  @test
  Scenario: Verify all coloured button are display and enable
    Given I am on application URL
    Then Verify all coloured button are display and enable

  @test
  Scenario: Verify the click on Blue colour button
    Given I am on application URL
    Then Click on the Blue colour button and validate the new image text displayed

  @test
  Scenario: Verify the click on Red colour button
    Given I am on application URL
    Then Click on the Red colour button and validate the new image text displayed

  @test
  Scenario: Verify the click on Green colour button
    Given I am on application URL
    Then Click on the Green colour button and validate the new image text displayed

  @test
  Scenario: Verify the Elemental Selenium link is working
    Given I am on application URL
    Then Verify the Elemental Selenium link is working

  @test
  Scenario: Verify no of images ,text and link on web page
    Given I am on application URL
    Then Verify  no of images on web page
    Then Verify text of image
    Then Verify navigation to GitHub URL when click on Image link

  @test
  Scenario:  Print Header of Web table on Web page
    Given I am on application URL
    Then  Print header of Web table

  @test
  Scenario: Print No of Row in Web Table
    Given I am on application URL
    Then Print no of row in Web Table

  @test
  Scenario: Print No of Column in Web Table
    Given I am on application URL
    Then Print no of column in Web Table

  @test
  Scenario Outline: Find specific column value of particular row
    //Example- I have 'Definiebas5' column value and want to find 'Iuvaret5'(1st column value) of same row and verify
    Given I am on application URL
    Then  I have "<CellValue>" then find specific column value of particular row


    Examples:
    | CellValue |
    | Definiebas5 |


  @test
  Scenario:  Print last row of Web table on Web page
    Given I am on application URL
    Then  Print last row of Web table

  @test
  Scenario:  Print cell value of specific column of specific row and verify
    //print 6th cell value of 2nd row and verify
    Given I am on application URL
    Then  Print cell value of specific column of specific row

  @test
  Scenario:  Print any column of Web table on Web page
    // print 4th column of web table
    Given I am on application URL
    Then  Print any column of Web table

  @test
  Scenario: Print All data of table
    Given I am on application URL
    Then  print all data of table

  @test
  Scenario: Print cell index of Column value of table
    Given I am on application URL
    Then  print cell index of column value

  @test
  Scenario: Click on edit link in any row of Web table and validate the action performed
    Given I am on application URL
    Then Click on edit link in any row of table
    Then Validate the URL

  @test
  Scenario: Click on delete link in any row of Web table and validate the action performed
    Given I am on application URL
    Then Click on delete link in any row of table
    Then Validate the delete URL






