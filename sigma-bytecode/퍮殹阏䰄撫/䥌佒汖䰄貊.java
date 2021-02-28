public class \ud36e\u6bb9\u960f\u4c04\u64ab.\u494c\u4f52\u6c56\u4c04\u8c8a {
    public void \u494c\u4f52\u6c56\u4c04\u8c8a(javax.crypto.Cipher p0) {
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
            invokespecial:Object(Object::<init>, this:\u494c\u4f52\u6c56\u4c04\u8c8a)
            putfield:byte[](\u494c\u4f52\u6c56\u4c04\u8c8a::\u4cd9\u4179\u5fe1\u4179\u6c56\u7c6b, this:\u494c\u4f52\u6c56\u4c04\u8c8a, newarray:byte[](byte.class, and:int(ldc:int(8611), ldc:int(-9124))))
            putfield:byte[](\u494c\u4f52\u6c56\u4c04\u8c8a::\u9af2\u4179\u4c04\u16f6\u600f\u516c, this:\u494c\u4f52\u6c56\u4c04\u8c8a, newarray:byte[](byte.class, and:int(ldc:int(1181), ldc:int(-1182))))
            putfield:Cipher(\u494c\u4f52\u6c56\u4c04\u8c8a::\u88c5\u446c\u6bb9\u6198\ubcb0\u64ab, this:\u494c\u4f52\u6c56\u4c04\u8c8a, p0:Cipher)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private byte[] \ucef1\u4179\ucef1\u0b8e\u4d85\u416d(io.netty.buffer.ByteBuf p0) {
        var_4_64 : int
        
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
            var_4_64 = invokevirtual:int(ByteBuf::readableBytes, p0:ByteBuf)
            
            if (cmplt:boolean(arraylength:int(getfield:byte[](\u494c\u4f52\u6c56\u4c04\u8c8a::\u4cd9\u4179\u5fe1\u4179\u6c56\u7c6b, this:\u494c\u4f52\u6c56\u4c04\u8c8a)), var_4_64:int)) {
                putfield:byte[](\u494c\u4f52\u6c56\u4c04\u8c8a::\u4cd9\u4179\u5fe1\u4179\u6c56\u7c6b, this:\u494c\u4f52\u6c56\u4c04\u8c8a, newarray:byte[](byte.class, var_4_64:int))
            }
            
            invokevirtual:ByteBuf(ByteBuf::readBytes, p0:ByteBuf, getfield:byte[](\u494c\u4f52\u6c56\u4c04\u8c8a::\u4cd9\u4179\u5fe1\u4179\u6c56\u7c6b, this:\u494c\u4f52\u6c56\u4c04\u8c8a), and:int(ldc:int(17650), ldc:int(-17655)), var_4_64:int)
            return:byte[](getfield:byte[](\u494c\u4f52\u6c56\u4c04\u8c8a::\u4cd9\u4179\u5fe1\u4179\u6c56\u7c6b, this:\u494c\u4f52\u6c56\u4c04\u8c8a))
        }
        
        goto(Label_0006)
    }
    
    public io.netty.buffer.ByteBuf \ua61f\ub7dc\u8df4\ucef1\ub113\u7043(io.netty.channel.ChannelHandlerContext p0, io.netty.buffer.ByteBuf p1) {
        var_5_64 : int
        var_6_6B : byte[]
        var_7_81 : ByteBuf
        
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
            var_5_64 = invokevirtual:int(ByteBuf::readableBytes, p1:ByteBuf)
            var_6_6B = invokespecial:byte[](\u494c\u4f52\u6c56\u4c04\u8c8a::\ucef1\u4179\ucef1\u0b8e\u4d85\u416d, this:\u494c\u4f52\u6c56\u4c04\u8c8a, p1:ByteBuf)
            var_7_81 = invokeinterface:ByteBuf(ByteBufAllocator::heapBuffer, invokeinterface:ByteBufAllocator(ChannelHandlerContext::alloc, p0:ChannelHandlerContext), invokevirtual:int(Cipher::getOutputSize, getfield:Cipher(\u494c\u4f52\u6c56\u4c04\u8c8a::\u88c5\u446c\u6bb9\u6198\ubcb0\u64ab, this:\u494c\u4f52\u6c56\u4c04\u8c8a), var_5_64:int))
            invokevirtual:ByteBuf(ByteBuf::writerIndex, var_7_81:ByteBuf, invokevirtual:int(Cipher::update, getfield:Cipher(\u494c\u4f52\u6c56\u4c04\u8c8a::\u88c5\u446c\u6bb9\u6198\ubcb0\u64ab, this:\u494c\u4f52\u6c56\u4c04\u8c8a), var_6_6B:byte[], and:int(ldc:int(-13954), ldc:int(13953)), var_5_64:int, invokevirtual:byte[](ByteBuf::array, var_7_81:ByteBuf), invokevirtual:int(ByteBuf::arrayOffset, var_7_81:ByteBuf)))
            return:ByteBuf(var_7_81:ByteBuf)
        }
        
        goto(Label_0006)
    }
    
    public void \u3d64\u4492\u3e75\ub6ab\u527a\u51fa(io.netty.buffer.ByteBuf p0, io.netty.buffer.ByteBuf p1) {
        var_5_64 : int
        var_6_6B : byte[]
        var_7_76 : int
        
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
            var_5_64 = invokevirtual:int(ByteBuf::readableBytes, p0:ByteBuf)
            var_6_6B = invokespecial:byte[](\u494c\u4f52\u6c56\u4c04\u8c8a::\ucef1\u4179\ucef1\u0b8e\u4d85\u416d, this:\u494c\u4f52\u6c56\u4c04\u8c8a, p0:ByteBuf)
            var_7_76 = invokevirtual:int(Cipher::getOutputSize, getfield:Cipher(\u494c\u4f52\u6c56\u4c04\u8c8a::\u88c5\u446c\u6bb9\u6198\ubcb0\u64ab, this:\u494c\u4f52\u6c56\u4c04\u8c8a), var_5_64:int)
            
            if (cmplt:boolean(arraylength:int(getfield:byte[](\u494c\u4f52\u6c56\u4c04\u8c8a::\u9af2\u4179\u4c04\u16f6\u600f\u516c, this:\u494c\u4f52\u6c56\u4c04\u8c8a)), var_7_76:int)) {
                putfield:byte[](\u494c\u4f52\u6c56\u4c04\u8c8a::\u9af2\u4179\u4c04\u16f6\u600f\u516c, this:\u494c\u4f52\u6c56\u4c04\u8c8a, newarray:byte[](byte.class, var_7_76:int))
            }
            
            invokevirtual:ByteBuf(ByteBuf::writeBytes, p1:ByteBuf, getfield:byte[](\u494c\u4f52\u6c56\u4c04\u8c8a::\u9af2\u4179\u4c04\u16f6\u600f\u516c, this:\u494c\u4f52\u6c56\u4c04\u8c8a), and:int(ldc:int(21566), ldc:int(-21567)), invokevirtual:int(Cipher::update, getfield:Cipher(\u494c\u4f52\u6c56\u4c04\u8c8a::\u88c5\u446c\u6bb9\u6198\ubcb0\u64ab, this:\u494c\u4f52\u6c56\u4c04\u8c8a), var_6_6B:byte[], and:int(ldc:int(-11249), ldc:int(2992)), var_5_64:int, getfield:byte[](\u494c\u4f52\u6c56\u4c04\u8c8a::\u9af2\u4179\u4c04\u16f6\u600f\u516c, this:\u494c\u4f52\u6c56\u4c04\u8c8a)))
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
    
    public void \uceb8\u4ab3\u9af2\u4daf\ua61f\ucfaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61E : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_629 : int
        
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
        var_3_61E = and:int(ldc:int(755506150), ldc:int(1306466044))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u494c\u4f52\u6c56\u4c04\u8c8a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
            var_3_61E = and:int(var_3_61E:int, ldc:int(1334591173))
            var_5_7D = and:int(ldc:int(16760), ldc:int(-16761))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12050), ldc:int(-12083)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_61E:int, ldc:int(-131294210))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(1348), ldc:int(1349)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(2565), ldc:int(2564)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_61E = and:int(var_3_CA:int, ldc:int(1057529805))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(10497), ldc:int(5273)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-2045025750))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1477484313))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(371037931))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(345529537))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-239666655))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-463549070))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-127641697))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1596279494))
                    }
                    else {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1855600117))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1385147887))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1953988830))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(151698389))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1463880742))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(599797693))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1265670483))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(1603976388))
                            var_11_DB = and:int(ldc:int(13224), ldc:int(-13225))
                            goto(Label_1451)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1566765932))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1923253819))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-578688372))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1848849487))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(2128655500))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1649199774))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-371238716))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(490738604))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-698518305))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1202717705))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1860300194))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(1316612597))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(780347069))
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-349450035))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(8208), ldc:int(8209))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1925172257))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1047079384))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-761721089))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-32340365))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-1721745345))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(2063219702))
                        var_11_DB = and:int(ldc:int(31410), ldc:int(-31667))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1651248104))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(218120267))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-1555629348))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(1827992387))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-1333463384))
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1709436211))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1680001195))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(1166726290))
                            goto(Label_1067)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(1837478176))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(882335194))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(1061839054))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-549038781))
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1174669825))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1451)
                    }
                    
                    Label_1324:
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(489321708))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(200120235))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1253504075))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1454942646))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61E = and:int(var_3_61E:int, ldc:int(1823372533))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1451:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_629 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1462:
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(353759450))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-958298225))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-497161394))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1349089535))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(984119788))
                        var_17_629 = add:int(var_16_109:int, and:int(ldc:int(33), ldc:int(21535)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61E = and:int(var_3_61E:int, ldc:int(1220197606))
                
                if (cmple:boolean(var_5_7D = var_17_629:int, sub:int(var_6_84:int, xor:int(ldc:int(513), ldc:int(512))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
