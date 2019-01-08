package com.slqywp.util.ftp;

import java.io.IOException;

public class FTPFactory
{
    //获取一个实例
    public static FTPUtil getInstance(String Name) throws IOException
    {

        String host = "";
        if (host != null)
        {
            int port = Integer.parseInt("");
            String username = "";
            String password = "";
            String remoteDir = "";
            String localDir = "";
            String Encoding = "";
            boolean passiveMode = Boolean.valueOf("");
            FTPVo vo = new FTPVo(host, port, username, password, remoteDir, localDir, Encoding, passiveMode);
            return new FTPUtilImpl(vo);
        }
        else
        {
            throw new IOException("config error");
        }
    }
}
