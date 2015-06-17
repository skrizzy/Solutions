<html>
    <head>
        <title>Ernesto's Eggs</title>
        <style>

        </style>
        <script>
            function calculatePrice() {
                var numEggs = document.getElementById('num-eggs').value;
                var pricePerDozen = getPricePerDozen(numEggs);
                var pricePerEgg = pricePerDozen / 12;
                var totalBill = pricePerEgg * numEggs;

                document.getElementById('per-dozen').innerHTML = pricePerDozen.toFixed(2);
                document.getElementById('per-egg').innerHTML = pricePerEgg.toFixed(3);
                document.getElementById('bill').innerHTML = totalBill.toFixed(2);
            }

            function getPricePerDozen(numEggs) {
                if (numEggs < 48) return 0.50;
                else if (numEggs >= 48 && numEggs < 72) return 0.45;
                else if (numEggs >= 72 && numEggs < 132) return 0.40;
                else return 0.35;
            }

            function priceTableInit() {
                for (var dracula = 1; dracula <= 120; dracula++) {
                    var row = document.createElement('tr');

                    var numEggs = document.createElement('td');
                    numEggs.appendChild(document.createTextNode(dracula));

                    var price = document.createElement('td');
                    price.appendChild(document.createTextNode(
                        (getPricePerDozen(dracula) / 12 * dracula).toFixed(2)));

                    row.appendChild(numEggs);
                    row.appendChild(price);
                    document.getElementById('price-table').appendChild(row);
                }
            }
        </script>
    </head>
    <body onload="priceTableInit();">
        <form class="price-calculator">
            <label for="number-of-eggs">Enter Number of Eggs: </label>
            <input name="number-of-eggs" type="number" id="num-eggs"
                   onchange="calculatePrice();"/><br />

            <label>Your cost is $<span id="per-dozen">0.50</span> per dozen
            or $<span id="per-egg">0.041</span> per egg</label><br />

            <label>Your bill comes to $<span id="bill">0.00</span></label>
        </form>
        <hr />
        <table>
            <tbody id="price-table">

            </body>
        </table>
    </body>
</html>
