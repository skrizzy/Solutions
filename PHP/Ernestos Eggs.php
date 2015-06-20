<html>
    <head>
        <title>Ernesto's Eggs</title>
        <?php
            function calculatePrice() {
                int $numEggs = $_POST["numer-of-eggs"];
                double $pricePerDozen = getPricePerDozen($numEggs);
                double $pricePerEgg = $pricePerDozen / 12;
                double $totalBill = $pricePerEgg * $numEggs;

                document.getElementById('per-dozen').innerHTML = pricePerDozen.toFixed(2);
                document.getElementById('per-egg').innerHTML = pricePerEgg.toFixed(3);
                document.getElementById('bill').innerHTML = totalBill.toFixed(2);
            }

            function getPricePerDozen(int $numEggs) {
                if ($numEggs < 48) return 0.50;
                else if ($numEggs >= 48 && $numEggs < 72) return 0.45;
                else if ($numEggs >= 72 && $numEggs < 132) return 0.40;
                else return 0.35;
            }

            function priceTableInit() {
                for (int $dracula = 1; $dracula <= 120; $dracula++) {
                    echo "<tr><td>$dracula</td><td>" .
                        (getPricePerDozen($dracula) / 12 * dracula) . "</td></tr>";
                }
            }
        ?>
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
