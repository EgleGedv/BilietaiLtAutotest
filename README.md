This is a work in progress...

### Autotest for Bilietai.lt website

Link to the test website -  [bilietai.lt](https://bilietai.lt/)


### 1. Time period filter

#### 1.1. Check if the correct from and to dates appear blue in the calendar after choosing "Kita savaite"

1. In the main page click on "Pasirinkite perioda"
2. Click on the radio button "Kita savaite"

*Expected result: The correct from and to dates for the next week will become coloured in blue, when clicked on radio button "Kita savaite"*

### 2. Cart

#### 2.1. Add a 50 euro giftcard to cart

1. In the main page, click on "Dovanų čekiai"
2. Mouse hover on a first item's image "Bilietai.lt Dovanų čekis", a green button "Pirkti bilietą" should appear
3. Click the green button "Pirkti bilietą"
4. When the new page opens, click the green button "Pirkti bilietą" again
5. Scroll down to price category, next to "50€ vertės (50.00 €)" select qty "1" by clicking a green "+" button.
6. Click "Tinka"
7. Below "Siūlomos vietos" again click "Tinka"
8. After the new page opens, on the right enter test email: Cocococonut144@gmail.com
9. Click "Apmokėti"

*Expected Result: New page will open with number 1 (showing a number of items added) in superscript letters next to 'Pirkinių krepšelis'* 

#### 2.2. Add  a 50 euro Bilietai.lt giftcard to cart and then remove

1. In the main page, click on "Dovanų čekiai"
2. Mouse hover on a first item's image "Bilietai.lt Dovanų čekis", a green button "Pirkti bilietą" should appear
3. Click the green button "Pirkti bilietą"
4. When the new page opens, click the green button "Pirkti bilietą" again
5. Scroll down to price category, next to "50€ vertės (50.00 €)" select qty "1" by clicking a green "+" button.
6. Click "Tinka"
7. Below "Siūlomos vietos" again click "Tinka"
8. After the new page opens, on the right enter test email: Cocococonut144@gmail.com
9. Click "Apmokėti"
10. In the new page "Apmokėjimo būdas" delete an item from cart by clicking an X in the corner of an item

*Expected Result: A buyer will be directed back to "Bilietų pasirinkimas" page* 

