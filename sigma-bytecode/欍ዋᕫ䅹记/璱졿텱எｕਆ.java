public class \u6b0d\u12cb\u156b\u4179\u8bb0.\u74b1\uc87f\ud171\u0b8e\uff55\u0a06 {
    public void \u74b1\uc87f\ud171\u0b8e\uff55\u0a06() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:AudioFileReader(AudioFileReader::<init>, this:\u74b1\uc87f\ud171\u0b8e\uff55\u0a06)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public javax.sound.sampled.AudioFileFormat getAudioFileFormat(java.io.InputStream p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        
        try {
            if (logicalnot:boolean(invokevirtual:boolean(InputStream::markSupported, var_1_79:InputStream))) {
                var_1_79 = initobject:BufferedInputStream[expected:InputStream](BufferedInputStream::<init>, var_1_79:InputStream)
            }
            
            invokevirtual:void(InputStream::mark, var_1_79:InputStream, and:int(ldc:int(196), ldc:int(25140)))
            return:AudioFileFormat(invokespecial:AudioFileFormat(\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::getAudioFileFormat, this:\u74b1\uc87f\ud171\u0b8e\uff55\u0a06, var_1_79:InputStream, ldc:int(-1)))
        }
        finally {
            invokevirtual:void(InputStream::reset, var_1_79:InputStream)
        }
    }
    
    public javax.sound.sampled.AudioFileFormat getAudioFileFormat(java.net.URL p0) {
        var_2_64 : int
        var_4_69 : InputStream
        var_5_76 : AudioFileFormat
        var_2_110 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_64 = and:int(and:int(ldc:int(1891756037), ldc:int(1590443110)), ldc:int(-622272109))
        var_4_69 = invokevirtual:InputStream(URL::openStream, p0:URL)
        
        try {
            var_2_64 = and:int(var_2_64:int, ldc:int(-773425817))
            var_5_76 = invokevirtual:AudioFileFormat(\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::getAudioFileFormat, this:\u74b1\uc87f\ud171\u0b8e\uff55\u0a06, var_4_69:InputStream)
            
            loop {
                if (cmpne:boolean(and:int(var_2_64:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0184)
                }
                
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(64)), ldc:int(0))) {
                    var_2_64 = and:int(var_2_64:int, ldc:int(-1007929100))
                    
                    if (cmpeq:boolean(var_4_69:InputStream, aconstnull:InputStream())) {
                        goto(Label_0184)
                    }
                }
                
                Label_0144:
                
                if (cmpne:boolean(and:int(var_2_64:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_64 = and:int(var_2_64:int, ldc:int(1440005112))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_64:int, ldc:int(2097152)), ldc:int(0))) {
                        var_2_64 = and:int(var_2_64:int, ldc:int(2119531373))
                        loopcontinue()
                    }
                    
                    var_2_64 = and:int(var_2_64:int, ldc:int(-34426971))
                    invokevirtual:void(InputStream::close, var_4_69:InputStream)
                }
                
                Label_0184:
                
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_64 = and:int(var_2_64:int, ldc:int(-699103148))
                    goto(Label_0144)
                }
                
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_64 = and:int(var_2_64:int, ldc:int(-801270267))
            }
            
            var_2_64 = and:int(var_2_64:int, ldc:int(-354222188))
            return:AudioFileFormat(var_5_76:AudioFileFormat)
        }
        finally {
            loop {
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_110 = and:int(var_2_64:int, ldc:int(1922809876))
                }
                else {
                    var_2_110 = and:int(var_2_64:int, ldc:int(-776901440))
                    
                    if (cmpeq:boolean(var_4_69:InputStream, aconstnull:InputStream())) {
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_110:int, ldc:int(512)), ldc:int(0))) {
                    var_2_110 = and:int(var_2_110:int, ldc:int(-605560623))
                    invokevirtual:void(InputStream::close, var_4_69:InputStream)
                    looporswitchbreak()
                }
                
                var_2_64 = and:int(var_2_110:int, ldc:int(474998904))
            }
        }
    }
    
    public javax.sound.sampled.AudioFileFormat getAudioFileFormat(java.io.File p0) {
        var_2_64 : int
        var_4_66 : InputStream
        var_2_B5 : int
        var_5_A8 : AudioFileFormat
        var_2_F7 : int
        var_6_D1 : AudioFileFormat
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_64 = and:int(and:int(ldc:int(-1533957266), ldc:int(-31542403)), ldc:int(-122245186))
        var_4_66 = aconstnull:InputStream()
        
        try {
            var_4_66 = initobject:BufferedInputStream[expected:InputStream](BufferedInputStream::<init>, initobject:FileInputStream[expected:InputStream](FileInputStream::<init>, p0:File))
            
            do {
                if (cmpne:boolean(and:int(var_2_64:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_64 = and:int(var_2_64:int, ldc:int(-432474258))
                    invokevirtual:void(InputStream::mark, var_4_66:InputStream, xor:int(ldc:int(2006), ldc:int(1086)))
                }
            } while (cmpeq:boolean(and:int(var_2_64:int, ldc:int(512)), ldc:int(0)))
            
            var_2_B5 = and:int(var_2_64:int, ldc:int(-105531457))
            var_5_A8 = invokespecial:AudioFileFormat(\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::getAudioFileFormat, this:\u74b1\uc87f\ud171\u0b8e\uff55\u0a06, var_4_66:InputStream, l2i:int(invokevirtual:long(File::length, p0:File)))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_B5:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_B5 = and:int(var_2_B5:int, ldc:int(-1441730562))
                    invokevirtual:void(InputStream::reset, var_4_66:InputStream)
                }
                
                if (cmpeq:boolean(and:int(var_2_B5:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_B5 = and:int(var_2_B5:int, ldc:int(-2008010627))
            }
            
            var_2_F7 = and:int(var_2_B5:int, ldc:int(-1292051475))
            var_6_D1 = var_5_A8:AudioFileFormat
            
            loop {
                if (cmpeq:boolean(and:int(var_2_F7:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_F7 = and:int(var_2_F7:int, ldc:int(-466100418))
                    
                    if (cmpeq:boolean(var_4_66:InputStream, aconstnull:InputStream())) {
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_F7:int, ldc:int(1)), ldc:int(0))) {
                    var_2_F7 = and:int(var_2_F7:int, ldc:int(-28077204))
                    invokevirtual:void(InputStream::close, var_4_66:InputStream)
                    looporswitchbreak()
                }
                
                var_2_F7 = and:int(var_2_F7:int, ldc:int(-626062036))
            }
            
            return:AudioFileFormat(var_6_D1:AudioFileFormat)
        }
        finally {
            if (cmpne:boolean(var_4_66:InputStream, aconstnull:InputStream())) {
                invokevirtual:void(InputStream::close, var_4_66:InputStream)
            }
        }
    }
    
    private javax.sound.sampled.AudioFileFormat getAudioFileFormat(java.io.InputStream p0, int p1) {
        var_3_76 : int
        var_5_69 : byte[]
        var_3_91 : int
        var_6_99 : int
        var_7_12E : \u67d0\u8413\u6b5f\ubf56\u12b2\u8709
        var_8_13D : \u4bc8\ub32d\u4daf\u759a\u9033\u7043
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_76 = and:int(and:int(ldc:int(2070558726), ldc:int(581578955)), ldc:int(-30722398))
        var_5_69 = newarray:byte[](byte.class, ldc:int(8))
        
        loop {
            if (cmpeq:boolean(and:int(var_3_76:int, ldc:int(1024)), ldc:int(0))) {
                var_3_76 = and:int(var_3_76:int, ldc:int(-549737058))
                invokevirtual:int(InputStream::read, p0:InputStream, var_5_69:byte[])
            }
            
            if (cmpne:boolean(and:int(var_3_76:int, ldc:int(8192)), ldc:int(0))) {
                looporswitchbreak()
            }
            
            var_3_76 = and:int(var_3_76:int, ldc:int(-833196238))
        }
        
        var_3_91 = and:int(var_3_76:int, ldc:int(1242508886))
        var_6_99 = and:int(ldc:int(-20766), ldc:int(20761))
        
        loop {
            if (cmpne:boolean(and:int(var_3_91:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0486)
            }
            
            if (cmpeq:boolean(and:int(var_3_91:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0437)
            }
            
            if (cmpne:boolean(and:int(var_3_91:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0383)
            }
            
            if (cmpne:boolean(and:int(var_3_91:int, ldc:int(16)), ldc:int(0))) {
                var_3_91 = and:int(var_3_91:int, ldc:int(-1222680259))
            }
            else {
                var_3_91 = and:int(var_3_91:int, ldc:int(1522480003))
                
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, initobject:String(String::<init>, var_5_69:byte[], xor:int(ldc:int(4099), ldc:int(4103)), and:int(ldc:int(21172), ldc:int(2116))), loadelement:String[expected:Object](getstatic:String[](\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::\uc2bd\u93a2\u8640\ud36e\u40a9\ubcb0), and:int(ldc:int(1736), ldc:int(-9931)))))) {
                    var_7_12E = initobject:\u67d0\u8413\u6b5f\ubf56\u12b2\u8709(\u67d0\u8413\u6b5f\ubf56\u12b2\u8709::<init>, var_5_69:byte[])
                    
                    try {
                        var_3_91 = and:int(var_3_91:int, ldc:int(-1286167758))
                        var_8_13D = initobject:\u4bc8\ub32d\u4daf\u759a\u9033\u7043(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::<init>, p0:InputStream)
                        
                        loop {
                            if (cmpne:boolean(and:int(var_3_91:int, ldc:int(131072)), ldc:int(0))) {
                                var_3_91 = and:int(var_3_91:int, ldc:int(370664926))
                                var_6_99 = xor:int(ldc:int(10880), ldc:int(10881))
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_91:int, ldc:int(16384)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_3_91 = and:int(var_3_91:int, ldc:int(-84856819))
                        }
                        
                        var_3_91 = and:int(var_3_91:int, ldc:int(325513650))
                    }
                    catch (java.lang.Exception var_8_16F) {
                        var_3_91 = and:int(var_3_91:int, ldc:int(573728358))
                        var_6_99 = and:int(ldc:int(-5750), ldc:int(5733))
                    }
                    
                    goto(Label_0383)
                }
            }
            
            Label_0236:
            
            if (cmpne:boolean(and:int(var_3_91:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0486)
            }
            
            if (cmpeq:boolean(and:int(var_3_91:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0437)
            }
            
            if (cmpne:boolean(and:int(var_3_91:int, ldc:int(1048576)), ldc:int(0))) {
                var_3_91 = and:int(var_3_91:int, ldc:int(-2055551276))
            }
            else {
                if (cmpne:boolean(and:int(var_3_91:int, ldc:int(16)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_91 = and:int(var_3_91:int, ldc:int(374285422))
                var_6_99 = xor:int(ldc:int(9216), ldc:int(9217))
            }
            
            Label_0383:
            
            if (cmpne:boolean(and:int(var_3_91:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0486)
            }
            
            if (cmpne:boolean(and:int(var_3_91:int, ldc:int(8)), ldc:int(0))) {
                var_3_91 = and:int(var_3_91:int, ldc:int(718011873))
            }
            else {
                if (cmpne:boolean(and:int(var_3_91:int, ldc:int(8)), ldc:int(0))) {
                    var_3_91 = and:int(var_3_91:int, ldc:int(-442714523))
                    goto(Label_0236)
                }
                
                if (cmpne:boolean(and:int(var_3_91:int, ldc:int(1048576)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_91 = and:int(var_3_91:int, ldc:int(-1556191201))
                
                if (cmpeq:boolean(var_6_99:int, ldc:int(0))) {
                    athrow(initobject:UnsupportedAudioFileException(UnsupportedAudioFileException::<init>))
                }
            }
            
            Label_0437:
            
            if (cmpne:boolean(and:int(var_3_91:int, ldc:int(8192)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_3_91:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_91 = and:int(var_3_91:int, ldc:int(-51105364))
                    goto(Label_0383)
                }
                
                if (cmpne:boolean(and:int(var_3_91:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_91 = and:int(var_3_91:int, ldc:int(-396970864))
                    goto(Label_0236)
                }
                
                if (cmpeq:boolean(and:int(var_3_91:int, ldc:int(2147483647)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_91 = and:int(var_3_91:int, ldc:int(1068985735))
            }
            
            Label_0486:
            
            if (cmpne:boolean(and:int(var_3_91:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0437)
            }
            
            if (cmpne:boolean(and:int(var_3_91:int, ldc:int(16384)), ldc:int(0))) {
                var_3_91 = and:int(var_3_91:int, ldc:int(1456350751))
                goto(Label_0383)
            }
            
            if (cmpeq:boolean(and:int(var_3_91:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0236)
            }
            
            if (cmpne:boolean(and:int(var_3_91:int, ldc:int(2)), ldc:int(0))) {
                return:AudioFileFormat(initobject:AudioFileFormat(AudioFileFormat::<init>, getstatic:Type(\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::\u7006\u3a62\ufe34\u4bc8\u6ec6\u0b8e), initobject:AudioFormat(AudioFormat::<init>, getstatic:Encoding(\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::\u3d4b\u0800\u40a9\u4c04\u67e9\u69d9), ldc:float(-1.0f), ldc:int(-1), p1:int, ldc:int(-1), ldc:float(-1.0f), xor:int[expected:boolean](ldc:int(8194), ldc:int(8195))), ldc:int(-1)))
            }
            
            var_3_91 = and:int(var_3_91:int, ldc:int(-1431887136))
        }
    }
    
    public javax.sound.sampled.AudioInputStream getAudioInputStream(java.io.InputStream p0) {
        var_4_8B : AudioFileFormat
        var_4_A9 : UnsupportedAudioFileException
        var_4_B6 : IOException
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        
        try {
            if (logicalnot:boolean(invokevirtual:boolean(InputStream::markSupported, var_1_79:InputStream))) {
                var_1_79 = initobject:BufferedInputStream[expected:InputStream](BufferedInputStream::<init>, var_1_79:InputStream)
            }
            
            invokevirtual:void(InputStream::mark, var_1_79:InputStream, xor:int(ldc:int(7509), ldc:int(7869)))
            var_4_8B = invokespecial:AudioFileFormat(\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::getAudioFileFormat, this:\u74b1\uc87f\ud171\u0b8e\uff55\u0a06, var_1_79:InputStream, ldc:int(-1))
            invokevirtual:void(InputStream::reset, var_1_79:InputStream)
            return:AudioInputStream(initobject:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::<init>, var_1_79:InputStream, invokevirtual:AudioFormat(AudioFileFormat::getFormat, var_4_8B:AudioFileFormat), i2l:long(invokevirtual:int(AudioFileFormat::getFrameLength, var_4_8B:AudioFileFormat))))
        }
        catch (javax.sound.sampled.UnsupportedAudioFileException var_4_A9) {
            invokevirtual:void(InputStream::reset, var_1_79:InputStream)
            athrow(var_4_A9:UnsupportedAudioFileException)
        }
        catch (java.io.IOException var_4_B6) {
            invokevirtual:void(InputStream::reset, var_1_79:InputStream)
            athrow(var_4_B6:IOException)
        }
    }
    
    public javax.sound.sampled.AudioInputStream getAudioInputStream(java.net.URL p0) {
        var_2_10A : int
        var_4_69 : InputStream
        stack_7B_0 : AudioInputStream [generated]
        var_5_80 : UnsupportedAudioFileException
        var_2_112 : int
        var_5_E4 : IOException
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_10A = and:int(and:int(ldc:int(175969437), ldc:int(1390278905)), ldc:int(930946521))
        var_4_69 = invokevirtual:InputStream(URL::openStream, p0:URL)
        
        try {
            var_2_10A = and:int(var_2_10A:int, ldc:int(1188934079))
            stack_7B_0 = invokevirtual:AudioInputStream(\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::getAudioInputStream, this:\u74b1\uc87f\ud171\u0b8e\uff55\u0a06, var_4_69:InputStream)
            var_2_10A = and:int(var_2_10A:int, ldc:int(576543069))
            return:AudioInputStream(stack_7B_0:AudioInputStream)
        }
        catch (javax.sound.sampled.UnsupportedAudioFileException var_5_80) {
            loop {
                if (cmpeq:boolean(and:int(var_2_10A:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0194)
                }
                
                if (cmpne:boolean(and:int(var_2_10A:int, ldc:int(32)), ldc:int(0))) {
                    var_2_10A = and:int(var_2_10A:int, ldc:int(291159128))
                }
                else {
                    var_2_10A = and:int(var_2_10A:int, ldc:int(930945755))
                    
                    if (cmpeq:boolean(var_4_69:InputStream, aconstnull:InputStream())) {
                        goto(Label_0194)
                    }
                }
                
                Label_0162:
                
                if (cmpne:boolean(and:int(var_2_10A:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_10A:int, ldc:int(16)), ldc:int(0))) {
                        var_2_10A = and:int(var_2_10A:int, ldc:int(-1392232470))
                        loopcontinue()
                    }
                    
                    var_2_10A = and:int(var_2_10A:int, ldc:int(-939544485))
                    invokevirtual:void(InputStream::close, var_4_69:InputStream)
                }
                
                Label_0194:
                
                if (cmpne:boolean(and:int(var_2_10A:int, ldc:int(2)), ldc:int(0))) {
                    var_2_10A = and:int(var_2_10A:int, ldc:int(301838590))
                    goto(Label_0162)
                }
                
                if (cmpne:boolean(and:int(var_2_10A:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            athrow(var_5_80:UnsupportedAudioFileException)
        }
        catch (java.io.IOException var_5_E4) {
            loop {
                if (cmpeq:boolean(and:int(var_2_10A:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_112 = and:int(var_2_10A:int, ldc:int(2133838525))
                }
                else {
                    var_2_112 = and:int(var_2_10A:int, ldc:int(192748955))
                    
                    if (cmpeq:boolean(var_4_69:InputStream, aconstnull:InputStream())) {
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_112:int, ldc:int(67108864)), ldc:int(0))) {
                    var_2_112 = and:int(var_2_112:int, ldc:int(-1235381381))
                    invokevirtual:void(InputStream::close, var_4_69:InputStream)
                    looporswitchbreak()
                }
                
                var_2_10A = and:int(var_2_112:int, ldc:int(-1291759900))
            }
            
            athrow(var_5_E4:IOException)
        }
    }
    
    public javax.sound.sampled.AudioInputStream getAudioInputStream(java.io.File p0) {
        var_2_118 : int
        var_4_70 : FileInputStream
        stack_84_0 : AudioInputStream [generated]
        var_5_89 : UnsupportedAudioFileException
        var_5_EF : IOException
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_118 = and:int(and:int(ldc:int(725247475), ldc:int(1001250295)), ldc:int(-282337936))
        var_4_70 = initobject:FileInputStream(FileInputStream::<init>, p0:File)
        
        try {
            var_2_118 = and:int(var_2_118:int, ldc:int(-1179102763))
            stack_84_0 = invokevirtual:AudioInputStream(\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::getAudioInputStream, this:\u74b1\uc87f\ud171\u0b8e\uff55\u0a06, var_4_70:FileInputStream[expected:InputStream])
            var_2_118 = and:int(var_2_118:int, ldc:int(2108615988))
            return:AudioInputStream(stack_84_0:AudioInputStream)
        }
        catch (javax.sound.sampled.UnsupportedAudioFileException var_5_89) {
            loop {
                if (cmpne:boolean(and:int(var_2_118:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0192)
                }
                
                if (cmpeq:boolean(and:int(var_2_118:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_118 = and:int(var_2_118:int, ldc:int(2143153136))
                    
                    if (cmpeq:boolean(var_4_70:FileInputStream, aconstnull:FileInputStream())) {
                        goto(Label_0192)
                    }
                }
                
                Label_0166:
                
                if (cmpne:boolean(and:int(var_2_118:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_118:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_118 = and:int(var_2_118:int, ldc:int(2036880820))
                    invokevirtual:void(InputStream::close, var_4_70:FileInputStream[expected:InputStream])
                }
                
                Label_0192:
                
                if (cmpeq:boolean(and:int(var_2_118:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_118 = and:int(var_2_118:int, ldc:int(83646624))
                    goto(Label_0166)
                }
                
                if (cmpeq:boolean(and:int(var_2_118:int, ldc:int(262144)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_118 = and:int(var_2_118:int, ldc:int(1319108020))
            }
            
            athrow(var_5_89:UnsupportedAudioFileException)
        }
        catch (java.io.IOException var_5_EF) {
            do {
                if (cmpne:boolean(and:int(var_2_118:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_118 = and:int(var_2_118:int, ldc:int(-1191791167))
                }
                else {
                    var_2_118 = and:int(var_2_118:int, ldc:int(-1355067431))
                    
                    if (cmpne:boolean(var_4_70:FileInputStream, aconstnull:FileInputStream())) {
                        loopcontinue()
                    }
                    
                    athrow(var_5_EF:IOException)
                }
            } while (cmpne:boolean(and:int(var_2_118:int, ldc:int(32768)), ldc:int(0)))
            
            var_2_118 = and:int(var_2_118:int, ldc:int(771744733))
            invokevirtual:void(InputStream::close, var_4_70:FileInputStream[expected:InputStream])
            athrow(var_5_EF:IOException)
        }
    }
    
    static {
        var_0_316 : int
        expr_6E : int [generated]
        stack_AC_0 : byte[] [generated]
        stack_AE_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_E8_0 : byte[] [generated]
        stack_113_0 : byte[] [generated]
        stack_115_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_272_0 : byte[] [generated]
        stack_2C3_0 : byte[] [generated]
        stack_330_0 : byte[] [generated]
        stack_388_0 : byte[] [generated]
        var_4_24D : int
        var_3_252 : byte[]
        var_5_253 : int
        expr_272 : byte [generated]
        var_0_37E : int
        expr_388 : byte [generated]
        stack_3B8_2 : byte [generated]
        var_2_AC : byte[]
        expr_B0 : int [generated]
        var_3_2B1 : byte[]
        var_5_2B2 : int
        expr_E8 : int [generated]
        expr_115 : int [generated]
        var_3_154 : String
        expr_15C : String[] [generated]
        expr_166 : String[] [generated]
        var_3_1FB : String[]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_316 = and:int(ldc:int(-146846903), ldc:int(-718069123))
        expr_6E = arraylength:int(stack_AC_0 = stack_AE_0 = stack_E6_0 = stack_E8_0 = stack_113_0 = stack_115_0 = stack_148_0 = stack_272_0 = stack_2C3_0 = stack_330_0 = stack_388_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("oMF4jopIhpiSvLE7iZuBKgI=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_24D = expr_6E:int
        var_3_252 = newarray:byte[](byte.class, expr_6E:int)
        var_5_253 = expr_6E:int
        Label_0597:
        
        while (cmpeq:boolean(and:int(var_0_316:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_316:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0778)
            }
            
            var_0_316 = and:int(var_0_316:int, ldc:int(-562090671))
            var_5_253 = add:int(var_5_253:int, ldc:int(-1))
            expr_272 = loadelement:byte(stack_272_0:byte[], var_5_253:int)
            storeelement:byte(var_3_252:byte[], var_5_253:int, or:int(and:int(shl:int(expr_272:byte, xor:int(ldc:int(-12224), ldc:int(-12220))), ldc:int(-16)), and:int(shr:int(expr_272:byte[expected:int], and:int(ldc:int(324), ldc:int(16388))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_253:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_E6_0 = stack_E8_0 = stack_113_0 = stack_115_0 = stack_148_0 = stack_272_0 = stack_2C3_0 = stack_330_0 = stack_388_0 = var_3_252:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0866)
        Label_0778:
        
        while (cmpeq:boolean(and:int(var_0_316:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_316:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0597)
            }
            
            var_0_316 = and:int(var_0_316:int, ldc:int(-1268120227))
            var_5_253 = add:int(var_5_253:int, ldc:int(-1))
            storeelement:byte(var_3_252:byte[], var_5_253:int, xor:byte(add:byte(loadelement:byte(stack_330_0:byte[], var_5_253:int), ldc:byte(102)), ldc:byte(71)))
            
            if (cmpne:boolean(var_5_253:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_E6_0 = stack_E8_0 = stack_113_0 = stack_115_0 = stack_148_0 = stack_272_0 = stack_2C3_0 = stack_330_0 = stack_388_0 = var_3_252:byte[]
            goto(Label_0237)
        }
        
        var_0_316 = and:int(var_0_316:int, ldc:int(1119254119))
        Label_0866:
        
        while (cmpeq:boolean(and:int(var_0_316:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_316:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0597)
            }
            
            var_0_37E = and:int(var_0_316:int, ldc:int(1933482311))
            var_5_253 = add:int(var_5_253:int, ldc:int(-1))
            expr_388 = loadelement:byte(stack_388_0:byte[], var_5_253:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_253:int, ldc:int(4)), neg:int(var_4_24D:int)), ldc:int(0))) {
                var_0_37E = and:int(var_0_37E:int, ldc:int(-642052755))
                stack_3B8_2 = add:byte(expr_388:byte, ldc:byte(4))
            }
            else {
                stack_3B8_2 = add:byte(expr_388:byte, loadelement:byte(var_3_252:byte[], add:int(var_5_253:int, ldc:int(4))))
            }
            
            var_0_316 = and:int(var_0_37E:int, ldc:int(1358829937))
            storeelement:byte(var_3_252:byte[], var_5_253:int, stack_3B8_2:byte)
            
            if (cmpne:boolean(var_5_253:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_E6_0 = stack_E8_0 = stack_113_0 = stack_115_0 = stack_148_0 = stack_272_0 = stack_2C3_0 = stack_330_0 = stack_388_0 = var_3_252:byte[]
            goto(Label_0282)
        }
        
        var_0_316 = and:int(var_0_316:int, ldc:int(159028683))
        goto(Label_0778)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_316:int, ldc:int(32)), ldc:int(0))) {
            var_0_316 = and:int(var_0_316:int, ldc:int(-1454800741))
            goto(Label_0282)
        }
        
        if (cmpne:boolean(and:int(var_0_316:int, ldc:int(4096)), ldc:int(0))) {
            var_0_316 = and:int(var_0_316:int, ldc:int(-447150442))
            goto(Label_0237)
        }
        
        if (cmpne:boolean(and:int(var_0_316:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_316 = and:int(var_0_316:int, ldc:int(1076078753))
        }
        else {
            var_0_316 = and:int(var_0_316:int, ldc:int(1988000745))
            var_2_AC = stack_AC_0:byte[]
            expr_B0 = add:int(arraylength:int(stack_AE_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B0:int, ldc:int(0))) {
                var_3_2B1 = newarray:byte[](byte.class, expr_B0:int)
                var_5_2B2 = expr_B0:int
                
                loop {
                    var_0_316 = and:int(var_0_316:int, ldc:int(330178043))
                    var_5_2B2 = add:int(var_5_2B2:int, ldc:int(-1))
                    storeelement:byte(var_3_2B1:byte[], var_5_2B2:int, add:int(shl:int(loadelement:byte(stack_2C3_0:byte[], var_5_2B2:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_AC:byte[], add:int(var_5_2B2:int, xor:int(ldc:int(192), ldc:int(193)))), ldc:int(5)), xor:int(ldc:int(13314), ldc:int(13317)))))
                    
                    if (cmpne:boolean(var_5_2B2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AE_0 = stack_AC_0 = stack_E6_0 = stack_E8_0 = stack_113_0 = stack_115_0 = stack_148_0 = stack_272_0 = stack_2C3_0 = stack_330_0 = stack_388_0 = var_3_2B1:byte[]
            }
        }
        
        Label_0181:
        
        if (cmpeq:boolean(and:int(var_0_316:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_316 = and:int(var_0_316:int, ldc:int(-1492288816))
            goto(Label_0282)
        }
        
        if (cmpeq:boolean(and:int(var_0_316:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_316 = and:int(var_0_316:int, ldc:int(699449951))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_316:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_316 = and:int(var_0_316:int, ldc:int(-1259990967))
            expr_E8 = arraylength:int(stack_E8_0:byte[])
            
            if (cmpne:boolean(expr_E8:int, ldc:int(0))) {
                var_4_24D = expr_E8:int
                var_3_252 = newarray:byte[](byte.class, expr_E8:int)
                var_5_253 = expr_E8:int
                goto(Label_0778)
            }
        }
        
        Label_0237:
        
        if (cmpne:boolean(and:int(var_0_316:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_316:int, ldc:int(32)), ldc:int(0))) {
                var_0_316 = and:int(var_0_316:int, ldc:int(1512670236))
                goto(Label_0181)
            }
            
            if (cmpeq:boolean(and:int(var_0_316:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_316 = and:int(var_0_316:int, ldc:int(989729261))
            expr_115 = arraylength:int(stack_115_0:byte[])
            
            if (cmpne:boolean(expr_115:int, ldc:int(0))) {
                var_4_24D = expr_115:int
                var_3_252 = newarray:byte[](byte.class, expr_115:int)
                var_5_253 = expr_115:int
                goto(Label_0866)
            }
        }
        
        Label_0282:
        
        if (cmpeq:boolean(and:int(var_0_316:int, ldc:int(131072)), ldc:int(0))) {
            var_0_316 = and:int(var_0_316:int, ldc:int(2082261224))
            goto(Label_0237)
        }
        
        if (cmpne:boolean(and:int(var_0_316:int, ldc:int(1024)), ldc:int(0))) {
            var_0_316 = and:int(var_0_316:int, ldc:int(-454042460))
            goto(Label_0181)
        }
        
        if (cmpne:boolean(and:int(var_0_316:int, ldc:int(64)), ldc:int(0))) {
            var_3_154 = initobject:String(String::<init>, stack_148_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_15C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2049), ldc:int(2052)))
            expr_166 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(18695), ldc:int(1733)))
            storeelement:String(expr_15C:String[], and:int(ldc:int(8725), ldc:int(5219)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(26699), ldc:int(-28236)), and:int(ldc:int(18579), ldc:int(8231))))
            storeelement:String(expr_15C:String[], and:int(ldc:int(643), ldc:int(9219)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(4131), ldc:int(2387)), xor:int(ldc:int(-32508), ldc:int(-32510))))
            storeelement:String(expr_15C:String[], and:int(ldc:int(18), ldc:int(22146)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(4416), ldc:int(4422)), xor:int(ldc:int(-24552), ldc:int(-24559))))
            storeelement:String(expr_166:String[], and:int(ldc:int(-21504), ldc:int(20790)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(6656), ldc:int(6665)), and:int(ldc:int(45), ldc:int(16653))))
            storeelement:String(expr_15C:String[], xor:int(ldc:int(7185), ldc:int(7189)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(16384), ldc:int(16397)), and:int(ldc:int(8728), ldc:int(3378))))
            putstatic:String[](\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::\uc2bd\u93a2\u8640\ud36e\u40a9\ubcb0, expr_166:String[])
            var_3_1FB = expr_15C:String[]
            putstatic:Type(\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::\u7006\u3a62\ufe34\u4bc8\u6ec6\u0b8e, initobject:Type(Type::<init>, loadelement:String(var_3_1FB:String[], and:int(ldc:int(8257), ldc:int(2305))), loadelement:String(var_3_1FB:String[], xor:int(ldc:int(195), ldc:int(193)))))
            putstatic:Type(\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::\u8cae\ucfaf\u3dd3\u385b\ub83f\u5fe1, initobject:Type(Type::<init>, loadelement:String(var_3_1FB:String[], and:int(ldc:int(3), ldc:int(8215))), loadelement:String(var_3_1FB:String[], xor:int(ldc:int(6663), ldc:int(6659)))))
            putstatic:Encoding(\u74b1\uc87f\ud171\u0b8e\uff55\u0a06::\u3d4b\u0800\u40a9\u4c04\u67e9\u69d9, initobject:Encoding(Encoding::<init>, loadelement:String(var_3_1FB:String[], xor:int(ldc:int(8224), ldc:int(8225)))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7af6\u3776\uc31c\u4cd9\u446c\uf94d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_651 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_65C : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_651 = and:int(ldc:int(-367954428), ldc:int(-343310341))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u74b1\uc87f\ud171\u0b8e\uff55\u0a06[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
            var_3_651 = and:int(var_3_651:int, ldc:int(-290619589))
            var_5_80 = and:int(ldc:int(14488), ldc:int(-14495))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11956), ldc:int(-16317)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_651:int, ldc:int(-131760553))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, xor:int(ldc:int(141), ldc:int(140)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, and:int(ldc:int(29), ldc:int(9345)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_651 = and:int(var_3_CF:int, ldc:int(-99092560))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(-26560), ldc:int(-26559)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1927519873))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-80654840))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1209370014))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-664839881))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1928896845))
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-568723837))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0552)
                            }
                            
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0401:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1855820313))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-647308376))
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(842681508))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-57968645))
                            var_11_E0 = and:int(ldc:int(5704), ldc:int(-5705))
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0552:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(608999089))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1305768748))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-281470315))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(841156383))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(473617744))
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-817614724))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-888834359))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0690:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1164066312))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-729740217))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(357680396))
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0552)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-75235445))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0807:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(68368656))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(239138664))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(456121844))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1297043064))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(859956912))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1473346286))
                            goto(Label_0552)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1753498915))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1653438128))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-851183955))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = xor:int(ldc:int(24), ldc:int(25))
                                goto(Label_1090)
                            }
                        }
                    }
                    
                    Label_0964:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0552)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1386923533))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-283510829))
                        var_11_E0 = and:int(ldc:int(28740), ldc:int(-29151))
                    }
                    
                    Label_1090:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1037950967))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0964)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1814375210))
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1259089478))
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0552)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-114153504))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(360369603))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-886473036))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1358)
                            }
                        }
                    }
                    
                    Label_1220:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(577951109))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-766754081))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1090)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(2137291906))
                            goto(Label_0964)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1582086257))
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0552)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-605371874))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-365461700))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1358:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(2063543164))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1343134881))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1750948309))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(670403263))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1214639877))
                        goto(Label_0552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(328752466))
                        goto(Label_0401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_651 = and:int(var_3_651:int, ldc:int(-344096838))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65C = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1424349484))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1315746467))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1927661978))
                        goto(Label_0401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-638878071))
                        var_17_65C = add:int(var_16_10E:int, xor:int(ldc:int(4352), ldc:int(4353)))
                        looporswitchbreak()
                    }
                }
                
                var_3_651 = and:int(var_3_651:int, ldc:int(-560332806))
                
                if (cmple:boolean(var_5_80 = var_17_65C:int, sub:int(var_6_87:int, and:int(ldc:int(26913), ldc:int(15))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
