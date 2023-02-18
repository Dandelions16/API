package com.web.api.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;

@Entity
@Table(name = "tb_supplier")
public class SupplierEntities implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private Long supplierId;
    @Column(name = "supplier_name",length = 100,nullable = false)
    @NotEmpty(message = "Required Supplier name")
    private String supplierName;
    @Column(name = "supplier_address",length =100, nullable = false)
    @NotEmpty(message = "Required supplier address")
    private String supplierAddress;
    @Column(name = "supplier_email",unique = true,length = 100,nullable = false)
    @NotEmpty(message = "Required supplier E-Mail")
    private String supplierEmail;
//    Constructor
    public SupplierEntities(Long supplierId,String supplierName, String supplierAddress, String supplierEmail){
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.supplierEmail = supplierEmail;
    }
    public SupplierEntities() {
    }

    //    Getter Setter
    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }
}