package com.example.webpos.web;

import com.example.webpos.biz.PosService;
import com.example.webpos.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PosController {

    private PosService posService;

    @Autowired
    public void setPosService(PosService posService) {
        this.posService = posService;
    }

    void setModel(Model model){
        model.addAttribute("total", posService.total(posService.getCart()));
        model.addAttribute("products", posService.products());
        model.addAttribute("cart", posService.getCart());
    }

    @GetMapping("/")
    public String pos(Model model) {
        posService.add("PD1",2);
        setModel(model);
        return "index";
    }

    @GetMapping("/charge")
    public String charge(Model model) {
        setModel(model);
        posService.checkout(posService.getCart());
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model,
                      @RequestParam String id,
                      @RequestParam int amount) {
        posService.add(id, amount);
        setModel(model);
        return "index";
    }

    @GetMapping("/clear")
    public String clear(Model model) {
        posService.newCart();
        setModel(model);
        return "index";
    }
}
