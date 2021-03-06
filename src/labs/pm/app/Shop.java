/*
 * Copyright (C) 2021 robertov
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import labs.pm.data.*;
import static labs.pm.data.Rating.*;

/**
 * {@code Shop} class represents an application that manages Products
 *
 * @version 4.0
 * @author robertov
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();

        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), THREE_STAR);
        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), FOUR_STAR);
        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), FIVE_STAR, LocalDate.now().plusDays(2));
        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), TWO_STAR, LocalDate.now());
        Product p5 = p3.applyRating(THREE_STAR);
        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), FIVE_STAR);
        Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), FIVE_STAR, LocalDate.now().plusDays(2));
        Product p8 = p4.applyRating(FIVE_STAR);
        Product p9 = p1.applyRating(TWO_STAR);

        System.out.println(p6.equals(p7));

        // System.out.println(p1.getBestBefore());
        // System.out.println(p3.getBestBefore());
        // System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount() + " " + p1.getRating().getStarts());
        // System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice() + " " + p2.getDiscount() + " " + p2.getRating().getStarts());
        // System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() + " " + p3.getDiscount() + " " + p3.getRating().getStarts());
        // System.out.println(p4.getId() + " " + p4.getName() + " " + p4.getPrice() + " " + p4.getDiscount() + " " + p4.getRating().getStarts());
        // System.out.println(p5.getId() + " " + p5.getName() + " " + p5.getPrice() + " " + p5.getDiscount() + " " + p5.getRating().getStarts());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p8);
        System.out.println(p9);
    }

}
