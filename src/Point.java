import lombok.AllArgsConstructor;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.spi.DecimalFormatSymbolsProvider;

@AllArgsConstructor
public class Point {

    private static final DecimalFormat format = new DecimalFormat("##.#"){{
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        setDecimalFormatSymbols(symbols);
    }};
    double x, y;


    @Override
    public String toString() {
        return "{" +
                  format.format(x) +
                "," + format.format(y) +
                '}';
    }
}
