package com.example.Coffee_shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

    // Example method to handle admin dashboard page
    @GetMapping("/orders")
    public ModelAndView adminDashboard() {
        ModelAndView modelAndView = new ModelAndView("admin/dashboard");
        // Add any necessary data to the model if needed
        return modelAndView;
    }

    // Example method to handle order status update form submission
    @PostMapping("/update-status")
    public ModelAndView updateOrderStatus(@RequestParam("orderId") String orderId,
                                          @RequestParam("status") String status) {
        // Logic to update order status based on orderId and status parameter
        // Replace this with your actual logic to update the order status

        // For simplicity, we'll just return to admin dashboard after update
        ModelAndView modelAndView = new ModelAndView("redirect:/admin/orders");
        return modelAndView;
    }
}

