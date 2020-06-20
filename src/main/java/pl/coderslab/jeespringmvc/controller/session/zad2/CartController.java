package pl.coderslab.jeespringmvc.controller.session.zad2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import pl.coderslab.jeespringmvc.model.Cart;
import pl.coderslab.jeespringmvc.model.CartItem;
import pl.coderslab.jeespringmvc.model.Product;

import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
@SessionAttributes({"cart"})
public class CartController {
    private Cart cart;

    @Autowired
    public CartController(Cart cart) {
        this.cart = cart;
    }

    @GetMapping("/addtocart")
    @ResponseBody
    public String addtocart(Model m) {
        Random rand = new Random();
        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
        m.addAttribute("cart", cart);
        return "addtocart";
    }

    @GetMapping("/cart")
    public String showCart() {
        return "show-cart";
    }
}
