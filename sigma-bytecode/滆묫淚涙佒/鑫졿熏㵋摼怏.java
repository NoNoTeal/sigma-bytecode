public abstract class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u946b\uc87f\u718f\u3d4b\u647c\u600f {
    public void \u946b\uc87f\u718f\u3d4b\u647c\u600f() {
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
            invokespecial:\u5f50\u3d4b\u7043\ubded\u4c2b\uc84e(\u5f50\u3d4b\u7043\ubded\u4c2b\uc84e::<init>, this:\u946b\uc87f\u718f\u3d4b\u647c\u600f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56 \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_4_64 : short
        var_5_7F : \u6435\u8709\u516c\ub1b9\ua6bd\uafe7
        
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
        var_4_64 = invokevirtual:short(ByteBuf::readUnsignedByte, p0:ByteBuf)
        
        if (cmpne:boolean(var_4_64:short[expected:int], and:int(ldc:int(25855), ldc:int(767)))) {
            var_5_7F = invokevirtual:\u6435\u8709\u516c\ub1b9\ua6bd\uafe7(\u946b\uc87f\u718f\u3d4b\u647c\u600f::\u839e\uc2e8\u1187\ub83f\ub18d\u6fb0, this:\u946b\uc87f\u718f\u3d4b\u647c\u600f, invokevirtual:byte[expected:int](ByteBuf::readByte, p0:ByteBuf))
            return:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56(initobject:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::<init>, var_4_64:short[expected:int], var_5_7F:\u6435\u8709\u516c\ub1b9\ua6bd\uafe7, invokevirtual:Object(\u8389\u494c\u527a\u8753\ub1b9\u8640::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, invokeinterface:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u6435\u8709\u516c\ub1b9\ua6bd\uafe7::\u3c25\u5fe1\u5fe1\u4bc8\u6bb9\ud12e, var_5_7F:\u6435\u8709\u516c\ub1b9\ua6bd\uafe7), p0:ByteBuf)))
        }
        
        return:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56(aconstnull:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56())
    }
    
    public abstract \u51b2\u6fb0\ufcaf\u61a4\u0800.\u6435\u8709\u516c\ub1b9\ua6bd\uafe7 \u839e\uc2e8\u1187\ub83f\ub18d\u6fb0(int p0);
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56 p1) {
        var_3_5F : int
        var_5_76 : \u6435\u8709\u516c\ub1b9\ua6bd\uafe7
        
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
            var_3_5F = and:int(ldc:int(191139659), ldc:int(-306057217))
            
            if (cmpne:boolean(p1:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56, aconstnull:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56())) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1430974147))
                invokevirtual:ByteBuf(ByteBuf::writeByte, p0:ByteBuf, invokevirtual:int(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::\u7006\ub8be\u97e6\u51b2\u6cfe\u120d, p1:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56))
                var_5_76 = invokevirtual:\u6435\u8709\u516c\ub1b9\ua6bd\uafe7(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::\uc3e3\u4f52\u4f4a\u446c\u4c2b\ucb79, p1:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56)
                invokevirtual:ByteBuf(ByteBuf::writeByte, p0:ByteBuf, invokeinterface:int(\u6435\u8709\u516c\ub1b9\ua6bd\uafe7::\u52d3\u36d3\ub32d\u5245\u3bd6\u385b, var_5_76:\u6435\u8709\u516c\ub1b9\ua6bd\uafe7))
                invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, invokeinterface:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u6435\u8709\u516c\ub1b9\ua6bd\uafe7::\u3c25\u5fe1\u5fe1\u4bc8\u6bb9\ud12e, var_5_76:\u6435\u8709\u516c\ub1b9\ua6bd\uafe7), p0:ByteBuf, invokevirtual:Object(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::\uceb8\u6bb9\u3504\u36d3\uc7fe\u34df, p1:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56))
            }
            else {
                invokevirtual:ByteBuf(ByteBuf::writeByte, p0:ByteBuf, xor:int(ldc:int(1524), ldc:int(1291)))
            }
            
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
            return:Object(invokevirtual:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56[expected:Object](\u946b\uc87f\u718f\u3d4b\u647c\u600f::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u946b\uc87f\u718f\u3d4b\u647c\u600f, p0:ByteBuf))
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
            invokevirtual:void(\u946b\uc87f\u718f\u3d4b\u647c\u600f::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u946b\uc87f\u718f\u3d4b\u647c\u600f, p0:ByteBuf, checkcast:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56.class, p1:Object[expected:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_643 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_64E : int
        
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
        var_3_643 = and:int(ldc:int(408998671), ldc:int(750247710))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u946b\uc87f\u718f\u3d4b\u647c\u600f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_643 = and:int(var_3_643:int, ldc:int(-791233909))
        }
        else {
            var_3_643 = and:int(var_3_643:int, ldc:int(-13264037))
            var_5_85 = and:int(ldc:int(16563), ldc:int(-30900))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25130), ldc:int(-30635)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_643:int, ldc:int(-1128276151))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(178), ldc:int(179)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-27646), ldc:int(-27645)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_643 = and:int(var_3_DA:int, ldc:int(969356106))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(2560), ldc:int(2561)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-465047820))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(354231190))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(915670658))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(128)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(2123659516))
                    }
                    else {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-640584882))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1509688287))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1687089097))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-2025430366))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(339490663))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1299618010))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-787505497))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-59794768))
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(231478187))
                        var_11_EB = and:int(ldc:int(32417), ldc:int(-32502))
                        goto(Label_1479)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-389264755))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(512)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(539000253))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1319004941))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(492456351))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(-59460692))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1358026344))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(312318070))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(1684252989))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-72941949))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(719756174))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(296578670))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1500205426))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(785249429))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(114753748))
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(-2009587925))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(18592), ldc:int(18593))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-938562813))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1178930299))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1859344065))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(557309006))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1063939200))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(551191688))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(1962348596))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(-580930644))
                        var_11_EB = and:int(ldc:int(25868), ldc:int(-25869))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(512)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(117726290))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1044308014))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1939052289))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1923619017))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(1452282063))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-489226910))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(128)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1020289373))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1701457073))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-902559768))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1083)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(1323344143))
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-914187676))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-2043271353))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-2129489130))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(128)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(1514700732))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1348:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1445786057))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-274016775))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(512)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(2053078532))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-217703765))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-921265857))
                        loopcontinue()
                    }
                    
                    var_3_643 = and:int(var_3_643:int, ldc:int(-1463362661))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1479:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64E = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1490:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1775135818))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1013866389))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(512)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-540568180))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1347089780))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(128)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1053054975))
                        var_17_64E = add:int(var_16_119:int, and:int(ldc:int(17457), ldc:int(8841)))
                        looporswitchbreak()
                    }
                    
                    var_3_643 = and:int(var_3_643:int, ldc:int(-148164439))
                }
                
                var_3_643 = and:int(var_3_643:int, ldc:int(690035480))
                
                if (cmple:boolean(var_5_85 = var_17_64E:int, sub:int(var_6_8C:int, xor:int(ldc:int(2369), ldc:int(2368))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_643 = and:int(var_3_643:int, ldc:int(-553954804))
            goto(Label_0106)
        }
    }
}
