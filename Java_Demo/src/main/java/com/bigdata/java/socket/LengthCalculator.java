/**
   guozh
 * 2019年11月8日
 */
package com.bigdata.java.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author guozh
 *
 * 创建时间：2019年11月8日 下午3:27:45
 */
public class LengthCalculator extends Thread{

	private Socket socket;
	
	public LengthCalculator(Socket socket) {
		this.socket  = socket;
	}

	public void run() {
		try {
			OutputStream os  = socket.getOutputStream();//输出流
			InputStream is =  socket.getInputStream();//输入流
			int ch =0;
			byte[] buff = new byte[1024];
			//buff主要用来读取输入的内容，存成byte数组，ch主要用来获取读取数组的长度
			ch = is.read(buff);
			//将接收流的byte数组转换成字符串，这里获取的内容是客户端发送过来的字段
			String content  = new String(buff, 0, ch);
			System.out.println(content);
			//往输出流里写入获得字符串的长度，回发给客户端
			os.write(String.valueOf(content.length()).getBytes());
			
			is.close();
			os.close();
			socket.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
