/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.timothyyip.pdfaggregator;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.AcroFields;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;
import java.io.FileOutputStream;

/**
 *
 * @author Timothy
 */
public class PDFAggregator
{

    public static void main(String[] args)
    {
        String filename = "C:\\Users\\Timothy\\Downloads\\Copy.pdf";
        String filename3 = "C:\\Users\\Timothy\\Downloads\\Sample.pdf";
        Document document = null;
        try
        {
            PdfReader reader = new PdfReader(filename);
            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(filename3));
            AcroFields form = stamper.getAcroFields();
            form.setField("Business name", "Cimex Media");
           
            
            form.setField("BusinessAddress", "Cheese");
            stamper.setFormFlattening(true);
            stamper.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            // document.close();
        }
    }
}
