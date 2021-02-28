public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u9937\u8308\u51fa\u7e3f\u600f\u36d3 {
    public void \u9937\u8308\u51fa\u7e3f\u600f\u36d3() {
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
            invokespecial:\u52d3\ucfaf\ub8be\ub83f\u3a62\u71ae(\u52d3\ucfaf\ub8be\ub83f\u3a62\u71ae::<init>, this:\u9937\u8308\u51fa\u7e3f\u600f\u36d3, ldc:String("FlatVarIntItem"))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_5_77 : \u7d52\u69d9\uae87\ud4fe\uc910\u3e2a
        
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
        
        if (invokevirtual:boolean(ByteBuf::readBoolean, p0:ByteBuf)) {
            var_5_77 = initobject:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::<init>)
            invokevirtual:void(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\u7ce1\u8d90\uc2e8\u5fe1\u3d64\ufcaf, var_5_77:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a, invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf))
            invokevirtual:void(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\u97b7\u8640\u3a62\u7af6\u5d20\uafe7, var_5_77:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a, invokevirtual:byte(ByteBuf::readByte, p0:ByteBuf))
            invokevirtual:void(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\u5bc4\u647c\u61a4\uc31c\u71ae\u3e2a, var_5_77:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a, checkcast:\ub83f\u6c52\u12cb\u3c25\u3776(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776.class, invokevirtual:\ub83f\u6c52\u12cb\u3c25\u3776(\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), p0:ByteBuf)))
            return:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(var_5_77:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a)
        }
        
        return:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(aconstnull:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a())
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a p1) {
        var_3_5F : int
        
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
            var_3_5F = and:int(ldc:int(-700703360), ldc:int(2132457423))
            
            if (cmpne:boolean(p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a, aconstnull:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a())) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(2121916058))
                invokevirtual:ByteBuf(ByteBuf::writeBoolean, p0:ByteBuf, xor:int[expected:boolean](ldc:int(18456), ldc:int(18457)))
                invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, invokevirtual:int(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\u8350\u156b\u6fb0\u3e75\u4cd9\uf94d, p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a))
                invokevirtual:ByteBuf(ByteBuf::writeByte, p0:ByteBuf, invokevirtual:byte[expected:int](\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\ubf56\u1187\u6b5f\u6435\u67e9\u3711, p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a))
                invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), p0:ByteBuf, invokevirtual:\ub83f\u6c52\u12cb\u3c25\u3776(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\u7006\u3bc9\u7c6b\u416d\u64ab\ubf56, p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a))
            }
            else {
                invokevirtual:ByteBuf(ByteBuf::writeBoolean, p0:ByteBuf, and:int[expected:boolean](ldc:int(-6752), ldc:int(6741)))
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
            return:Object(invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[expected:Object](\u9937\u8308\u51fa\u7e3f\u600f\u36d3::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u9937\u8308\u51fa\u7e3f\u600f\u36d3, p0:ByteBuf))
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
            invokevirtual:void(\u9937\u8308\u51fa\u7e3f\u600f\u36d3::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u9937\u8308\u51fa\u7e3f\u600f\u36d3, p0:ByteBuf, checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, p1:Object[expected:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F2 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5FD : int
        
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
        var_3_5F2 = and:int(ldc:int(-1583441906), ldc:int(-1342188995))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9937\u8308\u51fa\u7e3f\u600f\u36d3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(4)), ldc:int(0))) {
            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-141052026))
            var_5_7D = and:int(ldc:int(16690), ldc:int(-24887))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-1139), ldc:int(1138)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F2:int, ldc:int(-268960354))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(6475), ldc:int(17)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(20489), ldc:int(2977)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F2 = and:int(var_3_D2:int, ldc:int(-474558161))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(16385), ldc:int(7215)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(990820939))
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-401495780))
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1882395539))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(110781537))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1846738955))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1273992233))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1228600145))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1073742124))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1270845831))
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1997474890))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(339294268))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1752577208))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-271084323))
                            var_11_E3 = and:int(ldc:int(-28460), ldc:int(25386))
                            goto(Label_1398)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(64190971))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-178087827))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1413329477))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-508111274))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1454878771))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-563335853))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-922992163))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-957900041))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-2144996377))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1277211533))
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1078027466))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(969413705))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1816815903))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1576065083))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1418269579))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-205604516))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(-16384), ldc:int(-16383))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1261733569))
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-533727859))
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-229466737))
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1176584324))
                        var_11_E3 = and:int(ldc:int(30753), ldc:int(-30888))
                    }
                    
                    Label_1051:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1130832491))
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(278690331))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(502441881))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1413484385))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1270)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(31976107))
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-671961127))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(449246291))
                            goto(Label_1051)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-235496586))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1398)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1270:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(807439325))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-546174334))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(889914730))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1990793105))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-206130227))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1398:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5FD = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1409:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1957451667))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(471730486))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1481843580))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1595806523))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1181248171))
                        var_17_5FD = add:int(var_16_111:int, and:int(ldc:int(4107), ldc:int(2929)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F2 = and:int(var_3_5F2:int, ldc:int(677507488))
                }
                
                var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1076366601))
                
                if (cmple:boolean(var_5_7D = var_17_5FD:int, sub:int(var_6_84:int, and:int(ldc:int(4649), ldc:int(9345))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-993499357))
            goto(Label_0106)
        }
    }
}
