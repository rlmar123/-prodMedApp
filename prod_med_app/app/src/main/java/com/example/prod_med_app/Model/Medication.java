package com.example.prod_med_app.Model;

public class Medication
{
    private String medication_name = null;
    private String drug_nomenclature = null;

    private String doc_first = null;
    private String doc_last = null;


    private int quantity_total = 0;
    private int quantity_left = 0;

    private int refills_left = 0;


    public Medication()
    {
        // null Finish medication row
    }

    public Medication(String medication_name, String drug_nomenclature, String doc_first, String doc_last, int quantity_left, int quantity_total, int refills_left)
    {
        this.medication_name = medication_name;
        this.drug_nomenclature = drug_nomenclature;

        this.doc_first = doc_first;
        this.doc_last = doc_last;

        this.quantity_left = quantity_left;
        this.quantity_total = quantity_total;

        this.refills_left = refills_left;
    }

    // setters
    public void setMedicationName(String medication_name)
    {
        this.medication_name = medication_name;
    }

    public void setDrugNomenclature(String drug_nomenclature)
    {
        this.drug_nomenclature = drug_nomenclature;
    }

    public void setFirstName(String doc_first)
    {
        this.doc_first = doc_first;
    }

    public void setLastName(String doc_last)
    {
        this.doc_last = doc_last;
    }

    public void setQuantityLeft(int quantity_left)
    {
        this.quantity_left= quantity_left;
    }

    public void setQuantityTotal(int quantity_total)
    {
        this.quantity_total= quantity_total;
    }

    // getters
    public String getMedicationName()
    {return this.medication_name;}

    public String getDrugNomenclature()
    {return this.drug_nomenclature;}

    public String getFirstName()
    {return this.doc_first;}

    public String getLastName()
    {return this.doc_last;}

    public int getQuantityLeft()
    {return this.quantity_left;}

    public int getQuantityTotal()
    {return this.quantity_total;}

} // end Medication
