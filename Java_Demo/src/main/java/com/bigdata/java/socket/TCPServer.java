/**
   guozh
 * 2019年11月8日
 */
package com.bigdata.java.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.jayway.jsonpath.internal.function.text.Length;

/**
 * @author guozh
 *
 * 创建时间：2019年11月8日 下午3:19:59
 */
public class TCPServer {
	
	public static void main(String[] args) throws IOException {
		//创建socket，并将socket绑定到65000端口
		ServerSocket ss = new ServerSocket(65000);
		//死循环，使socket一直等待并处理客户端发送过来的请求
		while(true) {
			//监听65000端口，直到客户端返回连接信息后才返回
			Socket socket = ss.accept();
			//获取客户端的请求信息后，执行相关的业务逻辑
			new LengthCalculator(socket).start();
		}
	}
}
