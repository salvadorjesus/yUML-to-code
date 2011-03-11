package gui;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JTextArea;

class FilteredStream extends FilterOutputStream
{
	private JTextArea outputTextArea;
	
    public FilteredStream(OutputStream aStream, JTextArea outputTextArea)
    {
      super(aStream);
    
      this.outputTextArea = outputTextArea;
    }

    public void write(byte b[]) throws IOException {
       String aString = new String(b);
       outputTextArea.setText(outputTextArea.getText() + aString);
       }

    public void write(byte b[], int off, int len) throws IOException
    {
       String aString = new String(b , off , len);
//       outputTextArea.append(aString);
       outputTextArea.setText(outputTextArea.getText() + aString);
    }
}