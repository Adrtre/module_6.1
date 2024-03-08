package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Test
    @Transactional

    public void testInvoiceDaoSave() {
        // Given
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        productDao.save(product1);
        productDao.save(product2);

        Item item1 = new Item(product1, new BigDecimal(100), 2);
        Item item2 = new Item(product2, new BigDecimal(50), 3);
        Item item3 = new Item(product1, new BigDecimal(200), 1);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);

        Invoice invoice = new Invoice("INV001");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        // When
        invoiceDao.save(invoice);

        // Then
        int invoiceId = invoice.getId();
        assertNotNull(invoiceId);

        // Clean-up
        invoiceDao.deleteById(invoiceId);
    }
}
