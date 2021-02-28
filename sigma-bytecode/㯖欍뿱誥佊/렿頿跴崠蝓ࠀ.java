public class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ub83f\u983f\u8df4\u5d20\u8753\u0800 {
    public void \ub83f\u983f\u8df4\u5d20\u8753\u0800() {
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
            invokespecial:Object(Object::<init>, this:\ub83f\u983f\u8df4\u5d20\u8753\u0800)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void main(java.lang.String[] p0) {
        var_1_106 : int
        var_3_E2 : Exception
        
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
            var_1_106 = and:int(ldc:int(289311507), ldc:int(-750879189))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_1_106:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0184)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_106:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_106 = and:int(var_1_106:int, ldc:int(-1837119889))
                    }
                    else {
                        var_1_106 = and:int(var_1_106:int, ldc:int(1492909995))
                        
                        if (cmpge:boolean(arraylength:int(p0:String[]), xor:int(ldc:int(21248), ldc:int(21249)))) {
                            invokestatic:void(\ub83f\u983f\u8df4\u5d20\u8753\u0800::\u12cb\u74b1\ube23\u8bb0\u4daf\u5140, loadelement:String(p0:String[], and:int(ldc:int(25419), ldc:int(-25420))))
                            goto(Label_0184)
                        }
                    }
                    
                    Label_0135:
                    
                    if (cmpne:boolean(and:int(var_1_106:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_106:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_106 = and:int(var_1_106:int, ldc:int(-1281259015))
                            loopcontinue()
                        }
                        
                        var_1_106 = and:int(var_1_106:int, ldc:int(-1178931363))
                        invokestatic:void(\ub83f\u983f\u8df4\u5d20\u8753\u0800::\ub7dc\ucef1\u8d98\uc238\ua562\u7bad)
                    }
                    
                    Label_0184:
                    
                    if (cmpeq:boolean(and:int(var_1_106:int, ldc:int(512)), ldc:int(0))) {
                        var_1_106 = and:int(var_1_106:int, ldc:int(-995915494))
                        goto(Label_0135)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_106:int, ldc:int(131072)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_106 = and:int(var_1_106:int, ldc:int(-1983698215))
                }
                
                var_1_106 = and:int(var_1_106:int, ldc:int(-767559753))
            }
            catch (java.lang.Exception var_3_E2) {
                do {
                    if (cmpeq:boolean(and:int(var_1_106:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_106 = and:int(var_1_106:int, ldc:int(1525216418))
                    }
                    else {
                        var_1_106 = and:int(var_1_106:int, ldc:int(-788583703))
                        invokevirtual:void(Throwable::printStackTrace, var_3_E2:Exception[expected:Throwable])
                    }
                } while (cmpeq:boolean(and:int(var_1_106:int, ldc:int(524288)), ldc:int(0)))
                
                var_1_106 = and:int(var_1_106:int, ldc:int(-683943968))
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::err), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub83f\u983f\u8df4\u5d20\u8753\u0800::\u839e\u4bc8\ua61f\u4c04\ub83f\u392e), and:int(ldc:int(12568), ldc:int(-12633)))), invokevirtual:String(Throwable::toString, var_3_E2:Exception[expected:Throwable]))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \ub7dc\ucef1\u8d98\uc238\ua562\u7bad() {
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
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), loadelement:String(getstatic:String[](\ub83f\u983f\u8df4\u5d20\u8753\u0800::\u839e\u4bc8\ua61f\u4c04\ub83f\u392e), xor:int(ldc:int(18444), ldc:int(18445))))
            invokestatic:void(System::exit, and:int(ldc:int(27973), ldc:int(161)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u12cb\u74b1\ube23\u8bb0\u4daf\u5140(java.lang.String p0) {
        var_3_6C : \u4c2b\u120d\u6435\u5db4\u9255\u6cfe
        var_4_73 : SourceDataLine
        var_5_7D : URI
        var_6_A9 : Socket
        var_7_B7 : PrintStream
        var_8_112 : String
        var_9_17A : DataInputStream
        var_10_181 : String
        var_11_1A7 : \u4bc8\ub32d\u4daf\u759a\u9033\u7043
        var_12_1CB : AudioFormat
        var_13_1D9 : \u6c56\uf94d\u7bad\u9af2\ufe34\u99f7
        var_14_250 : byte[]
        
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
        var_3_6C = initobject:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe(\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::<init>)
        var_4_73 = aconstnull:SourceDataLine()
        
        try {
            var_5_7D = initobject:URI(URI::<init>, p0:String)
            var_6_A9 = initobject:Socket(Socket::<init>, invokevirtual:String(URI::getHost, var_5_7D:URI), ternaryop:int(cmpgt:boolean(invokevirtual:int(URI::getPort, var_5_7D:URI), ldc:int(0)), invokevirtual:int(URI::getPort, var_5_7D:URI), ldc:int(80)))
            var_7_B7 = initobject:PrintStream(PrintStream::<init>, invokevirtual:OutputStream(Socket::getOutputStream, var_6_A9:Socket))
            var_8_112 = invokevirtual:String(URI::getPath, var_5_7D:URI)
            
            if (logicalor:boolean(cmpeq:boolean(var_8_112:String, aconstnull:String()), invokevirtual:boolean(String::equals, var_8_112:String, loadelement:String[expected:Object](getstatic:String[](\ub83f\u983f\u8df4\u5d20\u8753\u0800::\u839e\u4bc8\ua61f\u4c04\ub83f\u392e), xor:int(ldc:int(706), ldc:int(704)))))) {
                var_8_112 = loadelement:String(getstatic:String[](\ub83f\u983f\u8df4\u5d20\u8753\u0800::\u839e\u4bc8\ua61f\u4c04\ub83f\u392e), xor:int(ldc:int(358), ldc:int(357)))
            }
            
            if (cmpne:boolean(invokevirtual:String(URI::getQuery, var_5_7D:URI), aconstnull:String())) {
                var_8_112 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_8_112:String), loadelement:String(getstatic:String[](\ub83f\u983f\u8df4\u5d20\u8753\u0800::\u839e\u4bc8\ua61f\u4c04\ub83f\u392e), and:int(ldc:int(36), ldc:int(11334)))), invokevirtual:String(URI::getQuery, var_5_7D:URI)))
            }
            
            invokevirtual:void(PrintStream::println, var_7_B7:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub83f\u983f\u8df4\u5d20\u8753\u0800::\u839e\u4bc8\ua61f\u4c04\ub83f\u392e), xor:int(ldc:int(83), ldc:int(86)))), var_8_112:String), loadelement:String(getstatic:String[](\ub83f\u983f\u8df4\u5d20\u8753\u0800::\u839e\u4bc8\ua61f\u4c04\ub83f\u392e), xor:int(ldc:int(20546), ldc:int(20548))))))
            invokevirtual:void(PrintStream::println, var_7_B7:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub83f\u983f\u8df4\u5d20\u8753\u0800::\u839e\u4bc8\ua61f\u4c04\ub83f\u392e), and:int(ldc:int(551), ldc:int(16415)))), invokevirtual:String(URI::getHost, var_5_7D:URI))))
            invokevirtual:void(PrintStream::println, var_7_B7:PrintStream)
            var_9_17A = initobject:DataInputStream(DataInputStream::<init>, invokevirtual:InputStream(Socket::getInputStream, var_6_A9:Socket))
            
            do {
                var_10_181 = invokevirtual:String(DataInputStream::readLine, var_9_17A:DataInputStream)
            } while (logicaland:boolean(cmpne:boolean(var_10_181:String, aconstnull:String()), logicalnot:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(String::trim, var_10_181:String), loadelement:String[expected:Object](getstatic:String[](\ub83f\u983f\u8df4\u5d20\u8753\u0800::\u839e\u4bc8\ua61f\u4c04\ub83f\u392e), xor:int(ldc:int(640), ldc:int(642)))))))
            
            var_11_1A7 = initobject:\u4bc8\ub32d\u4daf\u759a\u9033\u7043(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::<init>, var_9_17A:DataInputStream[expected:InputStream])
            var_12_1CB = initobject:AudioFormat(AudioFormat::<init>, i2f:float(invokevirtual:int(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u36d3\u4daf\ud523\ucfaf\u3776\uc246, var_11_1A7:\u4bc8\ub32d\u4daf\u759a\u9033\u7043)), ldc:int(16), invokevirtual:int(\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u0b8e\u8df4\u4492\u47c2\u5bc4\u9a18, var_11_1A7:\u4bc8\ub32d\u4daf\u759a\u9033\u7043), xor:int[expected:boolean](ldc:int(8233), ldc:int(8232)), and:int[expected:boolean](ldc:int(177), ldc:int(1289)))
            var_13_1D9 = initobject:\u6c56\uf94d\u7bad\u9af2\ufe34\u99f7(\u6c56\uf94d\u7bad\u9af2\ufe34\u99f7::<init>, invokevirtual:byte[](\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u64ab\u873d\uf94d\u88c5\u516c\uc29a, var_11_1A7:\u4bc8\ub32d\u4daf\u759a\u9033\u7043))
            
            loop {
                invokevirtual:void(\u6c56\uf94d\u7bad\u9af2\ufe34\u99f7::\u52d3\u7af6\ub113\ub19c\ua562\u4975, var_13_1D9:\u6c56\uf94d\u7bad\u9af2\ufe34\u99f7, invokevirtual:byte[](\u4bc8\ub32d\u4daf\u759a\u9033\u7043::\u1833\u40a9\u7e3f\u98a4\uc84e\ub7dc, var_11_1A7:\u4bc8\ub32d\u4daf\u759a\u9033\u7043), var_3_6C:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe)
                
                if (logicaland:boolean(cmpne:boolean(var_4_73:SourceDataLine, aconstnull:SourceDataLine()), invokestatic:boolean(\ub83f\u983f\u8df4\u5d20\u8753\u0800::\u446c\ucfaf\ua068\u8c8a\u5245\u8aa5, invokeinterface:AudioFormat(DataLine::getFormat, var_4_73:SourceDataLine[expected:DataLine]), var_3_6C:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe))) {
                    invokeinterface:void(DataLine::stop, var_4_73:SourceDataLine[expected:DataLine])
                    invokeinterface:void(Line::close, var_4_73:SourceDataLine[expected:Line])
                    var_4_73 = aconstnull:SourceDataLine()
                    var_12_1CB = initobject:AudioFormat(AudioFormat::<init>, i2f:float(invokevirtual:int(\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\uc29a\u64ab\u67e9\ubb2b\u6d69\u8308, var_3_6C:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe)), invokevirtual:int(\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\ud158\u3776\ub8be\u3dd3\ub70c\u4daf, var_3_6C:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe), invokevirtual:int(\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\u4f52\uc84e\ub18d\u946b\u92ff\uc246, var_3_6C:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe), xor:int[expected:boolean](ldc:int(-32704), ldc:int(-32703)), and:int[expected:boolean](ldc:int(17041), ldc:int(33)))
                }
                
                if (cmpeq:boolean(var_4_73:SourceDataLine, aconstnull:SourceDataLine())) {
                    var_4_73 = invokestatic:SourceDataLine(AudioSystem::getSourceDataLine, var_12_1CB:AudioFormat)
                    invokeinterface:void(Line::open, var_4_73:SourceDataLine[expected:Line])
                    invokeinterface:void(DataLine::start, var_4_73:SourceDataLine[expected:DataLine])
                }
                
                var_14_250 = invokevirtual:byte[](\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\u59ec\uc7fe\u647c\ubcb0\ub113\u4bc8, var_3_6C:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe)
                invokeinterface:int(SourceDataLine::write, var_4_73:SourceDataLine, var_14_250:byte[], and:int(ldc:int(-25638), ldc:int(9253)), arraylength:int(var_14_250:byte[]))
            }
        }
        finally {
            if (cmpne:boolean(var_4_73:SourceDataLine, aconstnull:SourceDataLine())) {
                invokeinterface:void(DataLine::stop, var_4_73:SourceDataLine[expected:DataLine])
                invokeinterface:void(Line::close, var_4_73:SourceDataLine[expected:Line])
            }
        }
    }
    
    private static boolean \u446c\ucfaf\ua068\u8c8a\u5245\u8aa5(javax.sound.sampled.AudioFormat p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4c2b\u120d\u6435\u5db4\u9255\u6cfe p1) {
        stack_CA_0 : int [generated]
        
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
            
            if (cmpeq:boolean(invokevirtual:float(AudioFormat::getSampleRate, p0:AudioFormat), i2f:float(invokevirtual:int(\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\uc29a\u64ab\u67e9\ubb2b\u6d69\u8308, p1:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe)))) {
                if (cmpeq:boolean(invokevirtual:int(AudioFormat::getChannels, p0:AudioFormat), invokevirtual:int(\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\u4f52\uc84e\ub18d\u946b\u92ff\uc246, p1:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe))) {
                    if (cmpeq:boolean(invokevirtual:int(AudioFormat::getSampleSizeInBits, p0:AudioFormat), invokevirtual:int(\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\ud158\u3776\ub8be\u3dd3\ub70c\u4daf, p1:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe))) {
                        if (cmpeq:boolean(invokevirtual:boolean(AudioFormat::isBigEndian, p0:AudioFormat), invokevirtual:boolean(\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\ub70c\uf9c5\u4cd9\ud36e\uae5d\u156b, p1:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe))) {
                            stack_CA_0 = and:int[expected:boolean](ldc:int(-30038), ldc:int(13396))
                            return:boolean(stack_CA_0:boolean)
                        }
                    }
                }
            }
            
            stack_CA_0 = xor:int[expected:boolean](ldc:int(1576), ldc:int(1577))
            return:boolean(stack_CA_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2ED : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_D0_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_100_0 : byte[] [generated]
        stack_124_0 : byte[] [generated]
        stack_298_0 : byte[] [generated]
        stack_300_0 : byte[] [generated]
        stack_387_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_229 : byte[]
        var_4_22A : int
        expr_A0 : int [generated]
        var_5_27A : int
        var_3_27F : byte[]
        var_4_280 : int
        expr_29B : byte [generated]
        var_0_31A : int
        expr_300 : byte [generated]
        stack_352_2 : byte [generated]
        stack_326_0 : byte [generated]
        expr_D0 : int [generated]
        expr_100 : int [generated]
        var_3_375 : byte[]
        var_4_376 : int
        var_3_130 : String
        stack_220_0 : String[] [generated]
        expr_142 : String[] [generated]
        
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
            var_0_2ED = and:int(ldc:int(-419045706), ldc:int(-140380233))
            expr_68 = var_2_6C = stack_9E_0 = stack_A0_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_124_0 = stack_298_0 = stack_300_0 = stack_387_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("B4aZJCoj/gLwGYf5+H6nkX6AFBvvkQqaH4wXlxGNCBATdJCULS+FBI+QdQ9KHg+FM21ag4oabheTFRUNNZUOF4018o6LlBUIpgMOiCmnrEjPxqA="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_229 = newarray:byte[](byte.class, expr_70:int)
                var_4_22A = expr_70:int
                
                loop {
                    var_0_2ED = and:int(var_0_2ED:int, ldc:int(-678709321))
                    var_4_22A = add:int(var_4_22A:int, ldc:int(-1))
                    storeelement:byte(var_3_229:byte[], var_4_22A:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_22A:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_22A:int, xor:int(ldc:int(4104), ldc:int(4105)))), ldc:int(3)), xor:int(ldc:int(7195), ldc:int(7172)))))
                    
                    if (cmpne:boolean(var_4_22A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_124_0 = stack_298_0 = stack_300_0 = stack_387_0 = var_3_229:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0261)
                }
                
                if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0213)
                }
                
                if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_2ED = and:int(var_0_2ED:int, ldc:int(-130478915))
                    goto(Label_0165)
                }
                
                var_0_2ED = and:int(var_0_2ED:int, ldc:int(-541073482))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_27A = expr_A0:int
                var_3_27F = newarray:byte[](byte.class, expr_A0:int)
                var_4_280 = expr_A0:int
                Label_0642:
                
                while (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(512)), ldc:int(0))) {
                    var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1629890889))
                    var_4_280 = add:int(var_4_280:int, ldc:int(-1))
                    expr_29B = add:byte(loadelement:byte(stack_298_0:byte[], var_4_280:int), ldc:byte(14))
                    storeelement:byte(var_3_27F:byte[], var_4_280:int, or:int(and:int(shl:int(expr_29B:byte, and:int(ldc:int(4), ldc:int(27780))), ldc:int(-16)), and:int(shr:int(expr_29B:byte[expected:int], and:int(ldc:int(10244), ldc:int(21356))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_280:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_124_0 = stack_298_0 = stack_300_0 = stack_387_0 = var_3_27F:byte[]
                    goto(Label_0165)
                }
                
                Label_0736:
                
                while (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(8)), ldc:int(0))) {
                    var_0_31A = and:int(var_0_2ED:int, ldc:int(-1776836681))
                    var_4_280 = add:int(var_4_280:int, ldc:int(-1))
                    expr_300 = stack_352_2 = loadelement(stack_300_0, var_4_280)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_280:int, ldc:int(6)), neg:int(var_5_27A:int)), ldc:int(0))) {
                        stack_352_2 = stack_326_0 = add:byte(expr_300:byte, loadelement:byte(var_3_27F:byte[], add:int(var_4_280:int, ldc:int(6))))
                        goto(Label_0822)
                    }
                    
                    Label_0781:
                    
                    if (cmpeq:boolean(and:int(var_0_31A:int, ldc:int(32768)), ldc:int(0))) {
                        var_0_31A = and:int(var_0_31A:int, ldc:int(259354190))
                    }
                    else {
                        var_0_31A = and:int(var_0_31A:int, ldc:int(-541073738))
                        stack_352_2 = stack_326_0 = add:byte(expr_300:byte, ldc:byte(6))
                    }
                    
                    Label_0822:
                    
                    if (cmpne:boolean(and:int(var_0_31A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_0_31A = and:int(var_0_31A:int, ldc:int(-1357339262))
                        goto(Label_0781)
                    }
                    
                    var_0_2ED = and:int(var_0_31A:int, ldc:int(1045880823))
                    storeelement:byte(var_3_27F:byte[], var_4_280:int, stack_352_2:byte)
                    
                    if (cmpne:boolean(var_4_280:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_124_0 = stack_298_0 = stack_300_0 = stack_387_0 = var_3_27F:byte[]
                    goto(Label_0213)
                }
                
                var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1537716921))
                goto(Label_0642)
                Label_0165:
                
                if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0261)
                }
                
                if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_2ED = and:int(var_0_2ED:int, ldc:int(1236914927))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_2ED = and:int(var_0_2ED:int, ldc:int(-276775042))
                    expr_D0 = arraylength:int(stack_D0_0:byte[])
                    
                    if (cmpne:boolean(expr_D0:int, ldc:int(0))) {
                        var_5_27A = expr_D0:int
                        var_3_27F = newarray:byte[](byte.class, expr_D0:int)
                        var_4_280 = expr_D0:int
                        goto(Label_0736)
                    }
                }
                
                Label_0213:
                
                if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(268435456)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(16)), ldc:int(0))) {
                        var_0_2ED = and:int(var_0_2ED:int, ldc:int(2103556411))
                        goto(Label_0165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_2ED = and:int(var_0_2ED:int, ldc:int(1999281719))
                    expr_100 = arraylength:int(stack_100_0:byte[])
                    
                    if (cmpne:boolean(expr_100:int, ldc:int(0))) {
                        var_3_375 = newarray:byte[](byte.class, expr_100:int)
                        var_4_376 = expr_100:int
                        
                        loop {
                            var_0_2ED = and:int(var_0_2ED:int, ldc:int(642178614))
                            var_4_376 = add:int(var_4_376:int, ldc:int(-1))
                            storeelement:byte(var_3_375:byte[], var_4_376:int, xor:byte(loadelement:byte(stack_387_0:byte[], var_4_376:int), ldc:byte(10)))
                            
                            if (cmpne:boolean(var_4_376:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_124_0 = stack_298_0 = stack_300_0 = stack_387_0 = var_3_375:byte[]
                    }
                }
                
                Label_0261:
                
                if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0213)
                }
                
                if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(32768)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_130 = initobject:String(String::<init>, stack_124_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_220_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1138), ldc:int(1146)))
            expr_142 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1091), ldc:int(1099)))
            storeelement:String(expr_142:String[], and:int(ldc:int(16898), ldc:int(282)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(-2125), ldc:int(2124)), and:int(ldc:int(-29714), ldc:int(29713))))
            storeelement:String(expr_142:String[], and:int(ldc:int(4118), ldc:int(550)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(2588), ldc:int(-2589)), xor:int(ldc:int(2385), ldc:int(2392))))
            storeelement:String(expr_142:String[], xor:int(ldc:int(2188), ldc:int(2191)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(141), ldc:int(1065)), and:int(ldc:int(16414), ldc:int(13354))))
            storeelement:String(expr_142:String[], xor:int(ldc:int(4368), ldc:int(4372)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(-32253), ldc:int(-32247)), and:int(ldc:int(20491), ldc:int(11))))
            storeelement:String(expr_142:String[], xor:int(ldc:int(1108), ldc:int(1105)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(283), ldc:int(523)), and:int(ldc:int(4175), ldc:int(8991))))
            storeelement:String(expr_142:String[], and:int(ldc:int(18447), ldc:int(23)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(655), ldc:int(17423)), xor:int(ldc:int(24595), ldc:int(24582))))
            storeelement:String(expr_142:String[], and:int(ldc:int(-19856), ldc:int(19725)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(16384), ldc:int(16405)), xor:int(ldc:int(-20447), ldc:int(-20470))))
            storeelement:String(expr_142:String[], and:int(ldc:int(29193), ldc:int(1153)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(12376), ldc:int(12403)), and:int(ldc:int(338), ldc:int(25170))))
            putstatic:String[](\ub83f\u983f\u8df4\u5d20\u8753\u0800::\u839e\u4bc8\ua61f\u4c04\ub83f\u392e, expr_142:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\u8cae\ub1b9\u416d\uc9f6\u5245(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_664 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_66F : int
        
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
        var_3_664 = and:int(ldc:int(-266196083), ldc:int(-117014593))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub83f\u983f\u8df4\u5d20\u8753\u0800[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
            var_3_664 = and:int(var_3_664:int, ldc:int(-875790198))
        }
        else {
            var_3_664 = and:int(var_3_664:int, ldc:int(1249017494))
            var_5_89 = and:int(ldc:int(-21357), ldc:int(4460))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(27907), ldc:int(-27972)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_664:int, ldc:int(1947791020))
                    var_9_C6 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_90:int, xor:int(ldc:int(12288), ldc:int(12289)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, xor:int(ldc:int(-32764), ldc:int(-32763)))), var_7_9F:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_664 = and:int(var_3_D8:int, ldc:int(-838292890))
                    var_14_113 = var_7_9F:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(225), ldc:int(16385)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_90:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1490951690))
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1024527889))
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-312799920))
                        goto(Label_0809)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-31386435))
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-893502065))
                    }
                    else {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1476161190))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0590)
                            }
                            
                            goto(Label_0809)
                        }
                    }
                    
                    Label_0417:
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1469437845))
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1388753475))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(939039302))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1678456835))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(1067983706))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(1332461397))
                        var_11_E9 = and:int(ldc:int(-28350), ldc:int(20153))
                        goto(Label_1521)
                    }
                    
                    Label_0590:
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1506705862))
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-917532290))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(551103982))
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(1866787740))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0809)
                        }
                    }
                    
                    Label_0705:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1721176079))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(2051010309))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0809:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(401623876))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1651110012))
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1599476896))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(419353745))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-425591726))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(1274723974))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_E9 = xor:int(ldc:int(-30720), ldc:int(-30719))
                                goto(Label_1108)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(2110985737))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1670884606))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0809)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(954169106))
                            goto(Label_0705)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(554853514))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1874453700))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-277681604))
                        var_11_E9 = and:int(ldc:int(28488), ldc:int(-28493))
                    }
                    
                    Label_1108:
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-953800507))
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1556084044))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0809)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1555907258))
                            goto(Label_0705)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1528439403))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-290079161))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1377)
                            }
                        }
                    }
                    
                    Label_1232:
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1588804510))
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(1882674697))
                            goto(Label_1108)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(310177200))
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(610611345))
                            goto(Label_0809)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-83426254))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-386778393))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_89:int, var_16_117:int)
                            goto(Label_1521)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1377:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(646374554))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1693127648))
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-100102763))
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1313932819))
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1403003273))
                        loopcontinue()
                    }
                    
                    var_3_664 = and:int(var_3_664:int, ldc:int(-652514692))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1521:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66F = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1532:
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1404523417))
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-823045097))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-2081223061))
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-959943074))
                        var_17_66F = add:int(var_16_117:int, xor:int(ldc:int(17408), ldc:int(17409)))
                        looporswitchbreak()
                    }
                }
                
                var_3_664 = and:int(var_3_664:int, ldc:int(1914321740))
                
                if (cmple:boolean(var_5_89 = var_17_66F:int, sub:int(var_6_90:int, and:int(ldc:int(9869), ldc:int(4131))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
