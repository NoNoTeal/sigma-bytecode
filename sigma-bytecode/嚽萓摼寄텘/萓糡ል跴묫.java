public class \u56bd\u8413\u647c\u5bc4\ud158.\u8413\u7ce1\u120d\u8df4\ubb2b {
    public void \u8413\u7ce1\u120d\u8df4\ubb2b(int p0) {
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
            invokespecial:MessageToByteEncoder(MessageToByteEncoder::<init>, this:\u8413\u7ce1\u120d\u8df4\ubb2b)
            putfield:byte[](\u8413\u7ce1\u120d\u8df4\ubb2b::\ub113\u67e9\ube23\u7873\ua562\u71ae, this:\u8413\u7ce1\u120d\u8df4\ubb2b, newarray:byte[](byte.class, and:int(ldc:int(9810), ldc:int(12704))))
            putfield:int(\u8413\u7ce1\u120d\u8df4\ubb2b::\u3711\u7873\u12b2\u3e2a\u3711\u927d, this:\u8413\u7ce1\u120d\u8df4\ubb2b, p0:int)
            putfield:Deflater(\u8413\u7ce1\u120d\u8df4\ubb2b::\u69d9\u983f\u4ab3\u120d\u071d\u4e72, this:\u8413\u7ce1\u120d\u8df4\ubb2b, initobject:Deflater(Deflater::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void encode(io.netty.channel.ChannelHandlerContext p0, io.netty.buffer.ByteBuf p1, io.netty.buffer.ByteBuf p2) {
        var_6_67 : int
        var_7_71 : \u98a4\uafe7\uc3e3\ua6bd\u8640
        var_8_87 : byte[]
        
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
            var_6_67 = invokevirtual:int(ByteBuf::readableBytes, p1:ByteBuf)
            var_7_71 = initobject:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::<init>, p2:ByteBuf)
            
            if (cmpge:boolean(var_6_67:int, getfield:int(\u8413\u7ce1\u120d\u8df4\ubb2b::\u3711\u7873\u12b2\u3e2a\u3711\u927d, this:\u8413\u7ce1\u120d\u8df4\ubb2b))) {
                var_8_87 = newarray:byte[](byte.class, var_6_67:int)
                invokevirtual:ByteBuf(ByteBuf::readBytes, p1:ByteBuf, var_8_87:byte[])
                invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u927d\u718f\u494c\u6c56\u52d3\u36d3, var_7_71:\u98a4\uafe7\uc3e3\ua6bd\u8640, arraylength:int(var_8_87:byte[]))
                invokevirtual:void(Deflater::setInput, getfield:Deflater(\u8413\u7ce1\u120d\u8df4\ubb2b::\u69d9\u983f\u4ab3\u120d\u071d\u4e72, this:\u8413\u7ce1\u120d\u8df4\ubb2b), var_8_87:byte[], and:int(ldc:int(29120), ldc:int(-31169)), var_6_67:int)
                invokevirtual:void(Deflater::finish, getfield:Deflater(\u8413\u7ce1\u120d\u8df4\ubb2b::\u69d9\u983f\u4ab3\u120d\u071d\u4e72, this:\u8413\u7ce1\u120d\u8df4\ubb2b))
                
                while (logicalnot:boolean(invokevirtual:boolean(Deflater::finished, getfield:Deflater(\u8413\u7ce1\u120d\u8df4\ubb2b::\u69d9\u983f\u4ab3\u120d\u071d\u4e72, this:\u8413\u7ce1\u120d\u8df4\ubb2b)))) {
                    invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeBytes, var_7_71:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:byte[](\u8413\u7ce1\u120d\u8df4\ubb2b::\ub113\u67e9\ube23\u7873\ua562\u71ae, this:\u8413\u7ce1\u120d\u8df4\ubb2b), and:int(ldc:int(-10865), ldc:int(10864)), invokevirtual:int(Deflater::deflate, getfield:Deflater(\u8413\u7ce1\u120d\u8df4\ubb2b::\u69d9\u983f\u4ab3\u120d\u071d\u4e72, this:\u8413\u7ce1\u120d\u8df4\ubb2b), getfield:byte[](\u8413\u7ce1\u120d\u8df4\ubb2b::\ub113\u67e9\ube23\u7873\ua562\u71ae, this:\u8413\u7ce1\u120d\u8df4\ubb2b)))
                }
                
                invokevirtual:void(Deflater::reset, getfield:Deflater(\u8413\u7ce1\u120d\u8df4\ubb2b::\u69d9\u983f\u4ab3\u120d\u071d\u4e72, this:\u8413\u7ce1\u120d\u8df4\ubb2b))
            }
            else {
                invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u927d\u718f\u494c\u6c56\u52d3\u36d3, var_7_71:\u98a4\uafe7\uc3e3\ua6bd\u8640, and:int(ldc:int(-3497), ldc:int(3240)))
                invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeBytes, var_7_71:\u98a4\uafe7\uc3e3\ua6bd\u8640, p1:ByteBuf)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u97e6\u392e\ufcaf\uc246\u69d9\u3bd6(int p0) {
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
            putfield:int(\u8413\u7ce1\u120d\u8df4\ubb2b::\u3711\u7873\u12b2\u3e2a\u3711\u927d, this:\u8413\u7ce1\u120d\u8df4\ubb2b, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void encode(io.netty.channel.ChannelHandlerContext p0, java.lang.Object p1, io.netty.buffer.ByteBuf p2) {
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
            invokevirtual:void(\u8413\u7ce1\u120d\u8df4\ubb2b::encode, this:\u8413\u7ce1\u120d\u8df4\ubb2b, p0:ChannelHandlerContext, checkcast:ByteBuf(io.netty.buffer.ByteBuf.class, p1:Object[expected:ByteBuf]), p2:ByteBuf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucb79\ub113\u12b2\ub113\u6b0d\u1187(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_633 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_63E : int
        
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
        var_3_633 = and:int(ldc:int(606343239), ldc:int(1197293565))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8413\u7ce1\u120d\u8df4\ubb2b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
            var_3_633 = and:int(var_3_633:int, ldc:int(-66652857))
            var_5_7D = and:int(ldc:int(20976), ldc:int(-20991))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32551), ldc:int(26402)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_633:int, ldc:int(-1782646148))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(2324), ldc:int(2325)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(291), ldc:int(1029)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_633 = and:int(var_3_D2:int, ldc:int(1841282773))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:boolean(0), ldc:boolean(1)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1229865435))
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-2034617524))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-378634887))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1370198))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(365585111))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1830662325))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1363504234))
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-2070771289))
                    }
                    else {
                        var_3_633 = and:int(var_3_633:int, ldc:int(127893207))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0597)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1377147001))
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1772262991))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1119101336))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(2123358596))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1845548000))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(2057044011))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1682932162))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1630236323))
                        var_11_E3 = and:int(ldc:int(12657), ldc:int(-14706))
                        goto(Label_1481)
                    }
                    
                    Label_0597:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-623914392))
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-68818393))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(604170919))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1466588143))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(1472123647))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1278191373))
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1761857973))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(988364069))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-52459524))
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1205356762))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(639488109))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(662308584))
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1436619928))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-739658060))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1955806924))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1678101798))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(726354009))
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1316026587))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1304305057))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-806399387))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(-28412), ldc:int(-28411))
                                goto(Label_1123)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1755761507))
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-476599019))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(18767013))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(253946539))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(1602115948))
                        var_11_E3 = and:int(ldc:int(-23430), ldc:int(19333))
                    }
                    
                    Label_1123:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(80790332))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1954419581))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1745535529))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1353)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1098979948))
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(381458344))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(699219289))
                            goto(Label_1123)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(662756036))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(953993527))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(256316660))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1481)
                    }
                    
                    Label_1353:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1147386884))
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1982122037))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1415963281))
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(378834901))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_633 = and:int(var_3_633:int, ldc:int(1037473639))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1481:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63E = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1492:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-2036365570))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1137880204))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-2024710442))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(128)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(348116309))
                        var_17_63E = add:int(var_16_111:int, and:int(ldc:int(12353), ldc:int(3481)))
                        looporswitchbreak()
                    }
                }
                
                var_3_633 = and:int(var_3_633:int, ldc:int(1953240052))
                
                if (cmple:boolean(var_5_7D = var_17_63E:int, sub:int(var_6_84:int, and:int(ldc:int(2729), ldc:int(4101))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
            var_3_633 = and:int(var_3_633:int, ldc:int(1590061343))
            goto(Label_0106)
        }
    }
}
