package com.makersharks.suppliersearchapi.controller;

import com.makersharks.suppliersearchapi.Supplier;
import com.makersharks.suppliersearchapi.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public Page<Supplier> querySuppliers(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam String manufacturingProcess,
            @RequestParam int page,
            @RequestParam int size) {

        return supplierService.findSuppliers(location, natureOfBusiness, manufacturingProcess, PageRequest.of(page, size));
    }
}
