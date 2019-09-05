package copyfile;
import java.io.*;
public class CopyFile
{
	private static void copyfile(String srFile, String dtFile){
            try
		{
			File f1=new File(srFile);
			File f2=new File(dtFile);
			InputStream in=new FileInputStream(f1);
			//for overwrite the file
			OutputStream out=new FileOutputStream(f2);
			byte[] buf=new byte[1024];
			int len;
			while((len=in.read(buf))>0)
                            out.write(buf,0,len);
			in.close();
			out.close();
			System.out.println("File copied");
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex.getMessage()+"in the specified directory");
			System.exit(0);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String args[])
	{
		switch(args.length)
		{
			case 0:	System.out.println("File has not mentioned");
				System.exit(0);
			case 1: copyfile(args[0],args[args.length]);
				System.exit(0);
			default:System.out.println("Multiple Files are not allowed");
				System.exit(0);
		}
        }
}
