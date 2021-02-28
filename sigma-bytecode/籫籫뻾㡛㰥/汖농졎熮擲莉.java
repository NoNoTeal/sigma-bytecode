public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u6c56\ub18d\uc84e\u71ae\u64f2\u8389 {
    public void \u6c56\ub18d\uc84e\u71ae\u64f2\u8389() {
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
            invokespecial:\u5f50\u3d4b\u7043\ubded\u4c2b\uc84e(\u5f50\u3d4b\u7043\ubded\u4c2b\uc84e::<init>, this:\u6c56\ub18d\uc84e\u71ae\u64f2\u8389)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56 \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_4_64 : byte
        var_6_8B : \u4cd9\u4179\u5fe1\u4179\u6c56\u7c6b
        
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
        var_4_64 = invokevirtual:byte(ByteBuf::readByte, p0:ByteBuf)
        
        if (cmpne:boolean(var_4_64:byte, ldc:byte(127))) {
            var_6_8B = invokestatic:\u4cd9\u4179\u5fe1\u4179\u6c56\u7c6b(\u4cd9\u4179\u5fe1\u4179\u6c56\u7c6b::\ucef1\u3bc9\u8640\ud171\uc29a\u392e, shr:int(and:int(var_4_64:byte[expected:int], xor:int(ldc:int(96), ldc:int(128))), xor:int(ldc:int(18497), ldc:int(18500))))
            return:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56(initobject:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::<init>, and:byte[expected:int](var_4_64:byte, ldc:byte(31)), var_6_8B:\u4cd9\u4179\u5fe1\u4179\u6c56\u7c6b[expected:\u6435\u8709\u516c\ub1b9\ua6bd\uafe7], invokevirtual:Object(\u8389\u494c\u527a\u8753\ub1b9\u8640::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, invokevirtual:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u4cd9\u4179\u5fe1\u4179\u6c56\u7c6b::\u3c25\u5fe1\u5fe1\u4bc8\u6bb9\ud12e, var_6_8B:\u4cd9\u4179\u5fe1\u4179\u6c56\u7c6b), p0:ByteBuf)))
        }
        
        return:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56(aconstnull:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56())
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56 p1) {
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
            invokevirtual:ByteBuf(ByteBuf::writeByte, p0:ByteBuf, i2b:byte[expected:int](or:int(shl:int(invokeinterface:int(\u6435\u8709\u516c\ub1b9\ua6bd\uafe7::\u52d3\u36d3\ub32d\u5245\u3bd6\u385b, invokevirtual:\u6435\u8709\u516c\ub1b9\ua6bd\uafe7(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::\uc3e3\u4f52\u4f4a\u446c\u4c2b\ucb79, p1:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56)), and:int(ldc:int(77), ldc:int(2743))), and:int(invokevirtual:int(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::\u7006\ub8be\u97e6\u51b2\u6cfe\u120d, p1:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56), ldc:int(31)))))
            invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, invokeinterface:\u1833\ud171\u8350\ubded\u34df\uc9f6[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<Object>](\u6435\u8709\u516c\ub1b9\ua6bd\uafe7::\u3c25\u5fe1\u5fe1\u4bc8\u6bb9\ud12e, invokevirtual:\u6435\u8709\u516c\ub1b9\ua6bd\uafe7(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::\uc3e3\u4f52\u4f4a\u446c\u4c2b\ucb79, p1:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56)), p0:ByteBuf, invokevirtual:Object(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::\uceb8\u6bb9\u3504\u36d3\uc7fe\u34df, p1:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
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
            return:Object(invokevirtual:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56[expected:Object](\u6c56\ub18d\uc84e\u71ae\u64f2\u8389::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u6c56\ub18d\uc84e\u71ae\u64f2\u8389, p0:ByteBuf))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, java.lang.Object p1) {
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
            invokevirtual:void(\u6c56\ub18d\uc84e\u71ae\u64f2\u8389::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u6c56\ub18d\uc84e\u71ae\u64f2\u8389, p0:ByteBuf, checkcast:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56.class, p1:Object[expected:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56]))
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
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_632 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_63D : int
        
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
        var_3_632 = and:int(ldc:int(1992613891), ldc:int(-87038421))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6c56\ub18d\uc84e\u71ae\u64f2\u8389[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
            var_3_632 = and:int(var_3_632:int, ldc:int(95322218))
        }
        else {
            var_3_632 = and:int(var_3_632:int, ldc:int(-87628618))
            var_5_85 = and:int(ldc:int(-6057), ldc:int(5800))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9941), ldc:int(9412)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_632:int, ldc:int(2147352422))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(640), ldc:int(641)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(513), ldc:int(17701)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_632 = and:int(var_3_DA:int, ldc:int(-220201129))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(12805), ldc:int(153)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-72438486))
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1919419253))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-168291733))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(128)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(461001488))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1992814895))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1192851594))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(2063526842))
                            var_11_EB = and:int(ldc:int(-26552), ldc:int(26006))
                            goto(Label_1425)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-381425943))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1570026121))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1462017429))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1348231040))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(128)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-822484600))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-985291031))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(512)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(56649653))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-398414965))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(1994914519))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-659888556))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-1703271513))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1743156543))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(128)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(548312691))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(2063069062))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(512)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1115021383))
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(130763408))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1194138474))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-1582628485))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(2080171987))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(-31744), ldc:int(-31743))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(256)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-126729724))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-2077628291))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-41528650))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(2127558395))
                        var_11_EB = and:int(ldc:int(24682), ldc:int(-24943))
                    }
                    
                    Label_1035:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(416894839))
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1958283330))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-820720798))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-5135794))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(512)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1904530130))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-1974162885))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1836750523))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(1945499986))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(412150413))
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1035)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1475972748))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-338191178))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-804604057))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(-83893097))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1425)
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1331802404))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(128)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1179168023))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(924219038))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(512)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(472821987))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1017839925))
                        loopcontinue()
                    }
                    
                    var_3_632 = and:int(var_3_632:int, ldc:int(2126901534))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1425:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63D = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1436:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-294458824))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(156908255))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-2014093348))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1889405722))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-113867805))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(985369715))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(882468495))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(829710600))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(4)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-2168034))
                        var_17_63D = add:int(var_16_119:int, and:int(ldc:int(16899), ldc:int(1353)))
                        looporswitchbreak()
                    }
                    
                    var_3_632 = and:int(var_3_632:int, ldc:int(250096689))
                }
                
                var_3_632 = and:int(var_3_632:int, ldc:int(1928783159))
                
                if (cmple:boolean(var_5_85 = var_17_63D:int, sub:int(var_6_8C:int, and:int(ldc:int(4265), ldc:int(1281))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(131072)), ldc:int(0))) {
            var_3_632 = and:int(var_3_632:int, ldc:int(162580309))
            goto(Label_0106)
        }
    }
}
