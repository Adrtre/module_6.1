package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Transactional
class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testInvoiceDaoSave() {
        // Given
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");

        Item item1 = new Item(product1, new BigDecimal("10"), 2);
        Item item2 = new Item(product2, new BigDecimal("20"), 1);

        Invoice invoice = new Invoice("INV-001");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        // When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        // Then
        assertNotNull(invoiceId);

//        // Clean
//        invoiceDao.deleteById(invoiceId);
    }
}
