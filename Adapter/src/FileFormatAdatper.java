import java.util.Objects;

public class FileFormatAdatper implements FileCoverter{
    public PDFConverterLib pdf_lib;
    FileFormatAdatper(){
        this.pdf_lib =new PDFConverterLib();
    }

    @Override
    public void covert(String input, String output, String input_format, String output_format) {
        if(Objects.equals(input_format, "txt") && Objects.equals(output_format, "pdf")){
            this.pdf_lib.from_txt(input_format,output_format);
        } else if (Objects.equals(input_format, "md") && Objects.equals(output_format, "pdf")) {
            this.pdf_lib.from_md(input_format,output_format);
        }
    }
}
